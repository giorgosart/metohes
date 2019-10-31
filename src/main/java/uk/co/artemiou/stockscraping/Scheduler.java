package uk.co.artemiou.stockscraping;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

  private Logger logger = LoggerFactory.getLogger(Scheduler.class);
  private static final String URL = "https://www.marketwatch.com/investing/stock/";

  private DecimalFormat df = new DecimalFormat("#00.00");

  @Scheduled(fixedRate = 60000)
  private void getDocument() throws IOException {

    BigDecimal portfolioValue = bd(0);
    double totalPNL;

    logger.info("|--------------------------------------------------------------|");

    for (PortfolioItem p : init()) {
      Document d = Jsoup.connect(URL + p.getStockName()).userAgent(UserAgent.getRandomAgent())
          .timeout(3000).get();
      double currentValue = Double.parseDouble(d.select("bg-quote.value").text());
      BigDecimal diff = bd(p.getPurchasePrice()).subtract(bd(currentValue));
      portfolioValue = portfolioValue.add(bd(currentValue)).multiply(bd(p.getQuantity()));
      print(p, diff, currentValue);
    }

    logger.info("| Portfolio value: " + portfolioValue);
    logger.info("|--------------------------------------------------------------|");

  }

  private void print(PortfolioItem p, BigDecimal diff, double currentValue) {
    String op = diff.compareTo(BigDecimal.ZERO) < 0 ? "+" : "-";
    logger.info("| Stock: " + p.getStockName()
        + " | Purchased: $" + df.format(p.getPurchasePrice())
        + " | Current: $" + df.format(currentValue)
        + " | Diff: $" + op + df.format(diff) + " |");
  }

  private List<PortfolioItem> init() {
    return new ArrayList<>() {{
      add(new PortfolioItem("amd", 29.01, 11));
      add(new PortfolioItem("avp", 4.27, 10));
    }};
  }

  private BigDecimal bd(double bigDecimal) {
    return new BigDecimal(bigDecimal);
  }
}

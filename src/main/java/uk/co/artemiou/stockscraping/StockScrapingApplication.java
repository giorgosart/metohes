package uk.co.artemiou.stockscraping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class StockScrapingApplication {

  public static void main(String[] args) {
    SpringApplication.run(StockScrapingApplication.class, args);
  }

}

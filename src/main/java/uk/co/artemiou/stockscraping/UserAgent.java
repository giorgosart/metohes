package uk.co.artemiou.stockscraping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserAgent {

  private static List<String> USER_AGENTS = new ArrayList<>(){{
    add("ABrowse");
    add("Acoo Browser");
    add("America Online Browser");
    add("AmigaVoyager");
    add("AOL");
    add("Arora");
    add("Avant Browser");
    add("Beonex");
    add("BonEcho");
    add("Browzar");
    add("Camino");
    add("Charon");
    add("Cheshire");
    add("Chimera");
    add("Chrome");
    add("ChromePlus");
    add("Classilla");
    add("CometBird");
    add("Comodo_Dragon");
    add("Conkeror");
    add("Crazy Browser");
    add("Cyberdog");
    add("Deepnet Explorer");
    add("DeskBrowse");
    add("Dillo");
    add("Dooble");
    add("Edge");
    add("Element Browser");
    add("Elinks");
    add("Enigma Browser");
    add("EnigmaFox");
    add("Epiphany");
    add("Escape");
    add("Firebird");
    add("Firefox");
    add("Fireweb Navigator");
    add("Flock");
    add("Fluid");
    add("Galaxy");
    add("Galeon");
    add("GranParadiso");
    add("GreenBrowser");
    add("Hana");
    add("HotJava");
    add("IBM WebExplorer");
    add("IBrowse");
    add("iCab");
    add("Iceape");
    add("IceCat");
    add("Iceweasel");
    add("iNet Browser");
    add("Internet Explorer");
    add("iRider");
    add("Iron");
    add("K-Meleon");
    add("K-Ninja");
    add("Kapiko");
    add("Kazehakase");
    add("Kindle Browser");
    add("KKman");
    add("KMLite");
    add("Konqueror");
    add("LeechCraft");
    add("Links");
    add("Lobo");
    add("lolifox");
    add("Lorentz");
    add("Lunascape");
    add("Lynx");
    add("Madfox");
    add("Maxthon");
    add("Midori");
    add("Minefield");
    add("Mozilla");
    add("myibrow");
    add("MyIE2");
    add("Namoroka");
    add("Navscape");
    add("NCSA_Mosaic");
    add("NetNewsWire");
    add("NetPositive");
    add("Netscape");
    add("NetSurf");
    add("OmniWeb");
    add("Opera");
    add("Orca");
    add("Oregano");
    add("osb-browser");
    add("Palemoon");
    add("Phoenix");
    add("Pogo");
    add("Prism");
    add("QtWeb Internet Browser");
    add("Rekonq");
    add("retawq");
    add("RockMelt");
    add("Safari");
    add("SeaMonkey");
    add("Shiira");
    add("Shiretoko");
    add("Sleipnir");
    add("SlimBrowser");
    add("Stainless");
    add("Sundance");
    add("Sunrise");
    add("surf");
    add("Sylera");
    add("Tencent Traveler");
    add("TenFourFox");
    add("theWorld Browser");
    add("uzbl");
    add("Vimprobable");
    add("Vonkeror");
    add("w3m");
    add("WeltweitimnetzBrowser");
    add("WorldWideWeb");
    add("Wyzo");
  }};

  public static String getRandomAgent(){
    return USER_AGENTS.get(new Random().nextInt(USER_AGENTS.size()));
  }

}

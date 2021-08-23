package locators;

public class Locators {
    public static final String searchInput = "//input[@id='orb-search-q']";
    public static final String moreButton = "//*[@id='orb-nav-more']";
    public static final String soundsMenuItem = "//*[@id='orb-panel-more']/*/ul/li[@class='orb-nav-sounds']";
    public static final String thirdRadio = "//*[@class='sc-o-scrollable gs-u-pb+']/ul/li[4]/div/a";   //тут неправильный локатор
    public static final String workLifeButton = "//*[@id='orb-nav-links']/ul//li[@class='orb-nav-worklife']";
    public static final String mostPopularBlock = "//*[@class='most-popular']";
    public static final String ninthArticle = "//*[@class='most-popular__items most-popular__items--desktop']/div[9]/div/a/h2";
    public static final String firstSimilarArticle = "//*[@class='related-articles__list with-numbers']/li[1]/div/div/*[@class='related-article__title']";

}

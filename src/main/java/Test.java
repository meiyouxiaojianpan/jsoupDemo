import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
*@author : gaozhiwen
*@date : 2020/11/20
*
*/
public class Test {
    public static void main(String[] args) throws IOException {
        String url = "http://fund.eastmoney.com/161725.html?spm=search";
        Document document = Jsoup.connect(url).get();
        Elements elements = document.select("div.instantBuy");
        Elements elements1 = elements.select("span.fix_dwjz");
        String attr = elements.select("span.fix_dwjz").first().childNodes().get(0).toString();
        System.out.println(attr);
        System.out.println("=====");
    }
}

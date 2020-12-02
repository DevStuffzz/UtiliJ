import utilij.os.Links;
import utilij.os.Searcher;

import java.io.IOException;
import java.net.URISyntaxException;

public class UtiliJDocumentation {
    public static void main(String[] args) throws IOException, URISyntaxException {
        
        // Simple as creating a Searcher and searching for your link
        Searcher searcher = new Searcher();
        searcher.search(Links.DEV_WEBSITE);
        searcher.search(Links.YOUTUBE);
        searcher.search(Links.GITHUB);
        searcher.search(Links.ITCH);
        
        // You dont need to use the Links class
        searcher.search("www.codepen.io");
    }
}

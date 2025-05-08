import java.util.ArrayList;
import java.util.List;

public class Website {
    List<Webpage> webpages;   
    public Website(int totalPages) {
        webpages = new ArrayList<>();
        for(int i = 0; i < totalPages; i++) {
            Webpage page = new Webpage(i);
            webpages.add(page);
        }
    }

    public Webpage getWebpage(int i) {
        return this.webpages.get(i);
    }
}

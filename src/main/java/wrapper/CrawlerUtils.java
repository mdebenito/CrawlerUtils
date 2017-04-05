package wrapper;

import loader.UserAgentStringLoader;
import pause.RandomPause;

import java.io.FileNotFoundException;

/**
 * Created by Mario de Benito on 05/04/2017.
 */
public class CrawlerUtils {

    private UserAgentStringLoader uasl;

    public CrawlerUtils() throws FileNotFoundException {
        this.uasl = new UserAgentStringLoader();
    }

   // RandomPause Wrapper
    public int randomPause() throws InterruptedException {
        return RandomPause.pause();
    }

    public int randomPause(int min, int max) throws InterruptedException {
        return RandomPause.pause(min,max);
    }

    public int randomPause(int refMillis) throws InterruptedException {
        return RandomPause.pause(refMillis);
    }


    // UserAgentProvider Wrapper
    public String getRandomUserString(){
        return this.uasl.getRandomUserAgentString();
    }
}

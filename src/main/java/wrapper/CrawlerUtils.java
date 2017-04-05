package wrapper;

import loader.UserAgentStringLoader;
import pause.RandomPause;

import java.io.FileNotFoundException;

/**
 * Created by Mario de Benito on 05/04/2017.
 */
public class CrawlerUtils {

    private UserAgentStringLoader uasl;

    /**
     * Default constructor. Initializes the different crawling utilities
     * @throws FileNotFoundException
     */
    public CrawlerUtils() throws FileNotFoundException {
        this.uasl = new UserAgentStringLoader();
    }

   // RandomPause Wrapper
    /**
     * Pauses the thread for a random amount of milliseconds between MIN_MILLIS and MAX_MILLIS
     * @return milliseconds paused
     * @throws InterruptedException
     */
    public int randomPause() throws InterruptedException {
        return RandomPause.pause();
    }
    /**
     * Pauses the thread for a random amount of milliseconds between min and max values
     * @param max Maximum amount of milliseconds to pause
     * @param min Minimum amount of milliseconds paused
     * @return milliseconds paused
     * @throws InterruptedException
     */
    public int randomPause(int min, int max) throws InterruptedException {
        return RandomPause.pause(min,max);
    }
    /**
     * Pauses the thread for a random amount of milliseconds between 0 and refmillis*2
     * @param refMillis reference milliseconds
     * @return milliseconds paused
     * @throws InterruptedException
     */
    public int randomPause(int refMillis) throws InterruptedException {
        return RandomPause.pause(refMillis);
    }


    // UserAgentProvider Wrapper
    /**
     * Randomly selects one of the configured User Agent strings and returns it.
     * @return A random User Agent string.
     */
    public String getRandomUserString(){
        return this.uasl.getRandomUserAgentString();
    }
}

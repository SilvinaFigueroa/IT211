import java.util.*;

public class Codec{

    HashMap <String,String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) { 
        String shortUrl= shortener(longUrl);
        map.put(longUrl, shortUrl);
        map.put(shortUrl,longUrl);

        return shortUrl;
        
    }

    private String shortener(String url){

        String tiny  = "http://tinyurl.com/";
        int length = 10;
        Random random = new Random();
        StringBuilder shortRandom = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(url.length());
            char randomChar = url.charAt(randomIndex);
            shortRandom.append(randomChar);
        }

        String shortUrl = tiny + shortRandom.toString();
        return shortUrl;
    }  
    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {

        return map.get(shortUrl); 
    }
}



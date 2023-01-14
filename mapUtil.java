import java.util.HashMap;
import java.util.Set;


public class mapUtil {
   public static void main(String[] args) {
      HashMap<String, String> trackList = new HashMap<String, String>();
      trackList.put("Love Me Like A Love Song", "Selena Gomez");
      trackList.put("Happier", "Rex Orange County");
      trackList.put("Arabella", "Arctic Monkeys");
      trackList.put("Kill Bill", "SZA");

      String name = trackList.get("Happier");

      Set<String> Lyrics = trackList.keySet();
      for(String Song: Lyrics){
         System.out.println(Song);
         System.out.println(trackList.get(Song));
      }
   }

}
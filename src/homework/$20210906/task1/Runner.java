package homework.$20210906.task1;

import java.util.HashMap;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {
//        Input text as a string
        String source =
                "hello,  hello helLO, new . demo. hello. THE, " +
                        "THE The! the. the! the THe THe?";
        System.out.println("source text:\n" + source + "\nresult text:");
//        Delete everything that is not words and change it with a space
        source = source.replaceAll("\\W", " ");

        Map<String, Integer> map = new HashMap<>();

//        In a loop, divide the string into words by space
        for (String currentWord : source.split(" ")) {
//        We check if there is such a word, if there is,
//        then we get it and rewrite it with an increased key,
//        else we add a new word with a key equal to 1
            if (map.containsKey(currentWord)) {
                map.put(currentWord, map.get(currentWord) + 1);
            } else {
                map.put(currentWord, 1);
            }
        }
//        Remove empty cases so as not to display spaces in statistics
        map.remove("");
        System.out.println(map);
    }

}

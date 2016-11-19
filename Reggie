import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.Math; 
import java.lang.StringBuilder;
import java.io.*;
import java.util.Set;
import java.util.Map;

public class Reggie{  
  public static void main(String[] args) {
     
      StringBuilder contentBuilder = new StringBuilder();
        try {
          BufferedReader in = new BufferedReader(new FileReader("lirics.html"));
          String str;
          while ((str = in.readLine()) != null) {
              contentBuilder.append(str);
          }
          in.close();
        } catch (IOException e) {
        }
    String content = contentBuilder.toString();   
    Song cantec = new Song(content.toLowerCase());
    System.out.printf("Cantecul are %s cuvinte in total dintre care %s unice, dupa cum urmeaza%n",
                      cantec.getTotalWordCount() ,
                      cantec.getWordCount());
    cantec.cuvinte().entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
  }
}

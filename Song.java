import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Song{
  String mLirics; 
  public Song(String lirics)  {
  	mLirics = lirics;
  }
  
  public List<String> dezbina(){  
    
  	List<String> cuvinte = new ArrayList<>(Arrays.asList(mLirics.split("[^\\p{L}0-9']+")));
    return cuvinte;
  }
  
  public int getTotalWordCount(){
    int result = dezbina().size();
    return result;
  }
  
  public int getWordCount(){
    int result = cuvinte().size();
    return result;
  }
  
  public Map<String, Integer> cuvinte(){
    List<String> cuvinte = dezbina();
    Map<String, Integer> harta = new HashMap<>();
    for(String cuvant : cuvinte){
      if (harta.containsKey(cuvant)){
        Integer numar = harta.get(cuvant);
        numar = new Integer(numar.intValue() + 1);
        harta.put(cuvant,numar);
        	
      }else{
        Integer x = 1;
      	harta.put(cuvant, x);
      }
    }
    return harta;
  }  
}

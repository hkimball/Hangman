import java.io.*; 
import java.util.*;    

public class LetterList {
   public static void main(String[] args){
      ArrayList<String> word = new ArrayList<String>();
      int wrong = 0;
      String letters = "krishann";
      int length = letters.length();
      for (int i = 0; i < length; i++){
         word.add(letters.substring(i, i + 1));
      } 
      if (word.indexOf("c") >= 0){
         wrong++;    
      }
      System.out.println(word);   
      System.out.println(wrong);
      System.out.println(word.indexOf("b"));
   
   }  
}   

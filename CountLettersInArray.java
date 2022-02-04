package CaseStudy1;
import java.util.Random;

public class CountLettersInArray {

	public static void main(String args[]) {
		
	     char[] chars = createArray();
		 System.out.println("letters are");
	     displayArray(chars);
	     int[] c = countLetters(chars);
	     System.out.println();
		 System.out.println("occurrences");
		 displayCounts(c);
              }
	
	  public static char[] createArray(){
	    
	    char[] chars = new char[100];
	    Random generator = new Random();
	    
	     String a ="abcdefghijklmnopqrstuvwxyz";
	     for (int i = 0; i < chars.length; i++) 
	       chars[i] = (char)a.charAt(generator.nextInt(26));
	     
	    return chars;
	  }
	
	  public static void displayArray(char[] chars) {
	   
	    for (int i = 0; i < chars.length; i++) {
	      if ((i+1) % 20 == 0)
	        System.out.println(chars[i]);
	      else
	        System.out.print(chars[i] + " ");
	    }
	  }

	  public static int[] countLetters(char[] chars) {
	    
	    int[] c = new int[26];
	    for (int i = 0; i < chars.length; i++)
	      c[chars[i] - 'a']++;

	    return c;
	  }

	  
	  public static void displayCounts(int[] counts) {
	    for (int i = 0; i < counts.length; i++) {
	      if ((i + 1) % 10 == 0)
	        System.out.println(counts[i] + " " + (char)(i + 'a'));
	      else
	        System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
	    }
	  }
	}

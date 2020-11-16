package pangramChecker;

public class PangramChecker {

	public static boolean check(String sentence){
	    
	    String str = sentence.replace(" ", "");	    
	    boolean pangram = true;    
	    boolean[] mark = new boolean[26];	    
	    int index = 0;
	    
	    for(int i = 0; i < str.length(); i++)
	    {
	      char c = str.charAt(i);
	      if(c >= 'A' && c <= 'Z')
	        {
	        index = c - 'A';
	        }
	      else if (c >= 'a' && c <= 'z')
	        {
	        index = c -'a';
	        }
	      mark[index] = true;
	    }
	    
	    for(int i = 0; i < mark.length; i++)
	    {
	      if(mark[i] == false)
	      {
	        pangram = false;
	      }
	    }
	    
	    return pangram;
	  }
}
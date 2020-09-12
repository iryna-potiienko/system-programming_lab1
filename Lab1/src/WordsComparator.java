import java.util.Comparator;

public class WordsComparator implements Comparator<String>{
	    public int compare(String a, String b){
	    	if(a.length() == b.length()) return 1;
	    	return a.length()-b.length();
	    }
	}

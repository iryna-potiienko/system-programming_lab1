import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Words{
		public static void readFile(String filename) {
			File file = new File(filename);
			try(FileReader reader = new FileReader(file)){
				char[] buffer = new char[(int) file.length()];
				reader.read(buffer);
				
	            String text = new String(buffer);
	            String words[] = text.split("\\s*(\\s|,|!|\\?"
	            		+ "|\\$|\\#|\\@|\\*|\\:|\\;"
	            		+ "|\\(|\\)|\\[|\\]|\\{|\\}"
	            		+ "|\\.)\\s*");
	            
	            Set<String> wordsSet = new TreeSet<String>();
	            for(String word : words) {
	            	if(word.length()>30) word = word.substring(0, 29);
	            	if(!word.isEmpty()) 
	            		wordsSet.add(word);
	            }
	            
	            WordsComparator wordscomparator = new WordsComparator();
	            Set<String> sortedwordsSet = new TreeSet<String>(wordscomparator);
	            sortedwordsSet.addAll(wordsSet);
	            
	            System.out.printf("Слова тексту файла %s, впорядковані за довжиною: %n", filename);
	            for(String word : sortedwordsSet) {
	            	System.out.println(word);
	            }
	        }
			catch(FileNotFoundException ex) {
				System.out.println("Файл не знайдено");
			}
			catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

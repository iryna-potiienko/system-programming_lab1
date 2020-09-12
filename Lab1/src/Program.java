import java.util.*;

public class Program {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String filename;
			while(true) {
			System.out.println("¬вед≥ть назву файла: (*дл€ виходу введ≥ть exit)");
			filename = scanner.nextLine();
			if (filename.equalsIgnoreCase("exit")) break;
			if (!filename.endsWith(".txt"))
				filename = filename + ".txt";
			Words.readFile(filename);
		}
		scanner.close();
	}
}

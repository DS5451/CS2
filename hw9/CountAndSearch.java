package hw9;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CountAndSearch {
	public static int[] statistic(Scanner input) {
		int[] stats = new int[3];
		int lines = 0;
		int words = 0;
		int chars = 0; 
		
		while(input.hasNextLine()) {
			stats[1]+=1;
			
			String line = input.nextLine();
			String[] word = line.split(" ");
			
			stats[2] += word.length;
			
			for(int i = 0; i<line.length();i++) {
				if(line.charAt(i)!=' ') {
				
				
					stats[0] += 1;
				} 
			}
		}
		return stats;
		
	}
	public static ArrayList<Integer> search(Scanner input, String target){
		ArrayList<Integer> search = new ArrayList<Integer>();
		int lines = 0;

		while(input.hasNextLine()) {
			String line = input.nextLine();
			lines++;
			String[] words = line.split(" ");
			for(int i = 0; i<words.length; i++) {
				boolean check = false;
				for(int j = 0; j<search.size(); j++) {
				if(search.get(j)==lines){
					check = true;
				}
				
				
					}
				if(words[i].contains(target) && check==false) {
					search.add(lines);
				}
			}
			
	
			}
			return search;
		}
		

	
	public static void main(String[] args) {
		Scanner file;
		
			try {
				file = new Scanner(new File("C:\\Users\\dmsap\\eclipse-workspace\\CS132S22\\src\\hw9\\WutheringHeights.txt"));
				int[] stats =statistic(file);
				for(int i = 0; i<stats.length; i++) {
					System.out.println(stats[i]);
				}
				file.close();

				Scanner fileSearch = new Scanner(new File("C:\\Users\\dmsap\\eclipse-workspace\\CS132S22\\src\\hw9\\WutheringHeights.txt"));
				Scanner input = new Scanner(System.in);
				System.out.println("Please enter a word: ");
				String word = input.nextLine();

				ArrayList<Integer> s = search(fileSearch, word);
				for(int i =0; i<s.size(); i++) {
	
				System.out.println(s.get(i));
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	
		
		
		
		
	}

}

package hw9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Shopping {
	public static ArrayList<String> getCommon(String file){
		ArrayList<String> common = new ArrayList<String>();
		ArrayList<String> Sally = new ArrayList<String>();
		ArrayList<String> Emma = new ArrayList<String>();
		
		try {
			Scanner File = new Scanner(new File("C:\\Users\\dmsap\\eclipse-workspace\\CS132S22\\src\\hw9\\"+file));


			boolean emma = false;
			while(File.hasNextLine()) {
				String line = File.nextLine();
				String[] items = line.split("	");
				
				if(emma==false && !line.equals("#######") ) {
					Sally.add(items[0]);
				} else if (emma==true) {
					Emma.add(items[0]);
				}
				
				if(line.equals("#######")) {
					emma = true;
				}
			}
			
			for(int i = 0; i<Sally.size(); i++) {
				for(int j = 0; j<Emma.size(); j++) {
					if(Sally.get(i).equals(Emma.get(j))) {
						common.add(Sally.get(i));
					}
				}
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return common;
		
	}
	public static String whichMore(String file) {
		ArrayList<String> Sally = new ArrayList<String>();
		ArrayList<String> Emma = new ArrayList<String>();
		double SallyTotal = 0;
		double EmmaTotal = 0;
		
		try {

			Scanner File = new Scanner(new File("C:\\Users\\dmsap\\eclipse-workspace\\CS132S22\\src\\hw9\\"+file));
			boolean emma = false;
			while(File.hasNextLine()){
				String line = File.nextLine();
				String[] items = line.split("	");
				if(emma==false && !line.equals("#######")) {
					SallyTotal += Double.parseDouble(items[1]);
					
				} else if(emma==true && !line.equals("#######")) {
					EmmaTotal += Double.parseDouble(items[1]);
				}
				
				if(line.equals("#######")) {
					emma = true;
				}
				
			}
			
			if(EmmaTotal>SallyTotal) {
				return "Emma spent more.";
			} else if(SallyTotal>EmmaTotal) {
				return "Sally spent more.";
			} else {
				return "They spent the same";
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String sallyMore = "Sally spent more";
		String emmaMore = "Emma spent more";
		return sallyMore;
	}
public static void main(String[] args) {
	System.out.println("The common items are: ");
	ArrayList<String> common = getCommon("SallyAndEmma.txt");
	for(int i = 0; i<common.size(); i++) {
		System.out.println(common.get(i));
	}
	
	System.out.println();
	System.out.println(whichMore("SallyAndEmma.txt"));
}


}

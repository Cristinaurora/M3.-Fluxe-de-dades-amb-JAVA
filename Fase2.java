import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Fase2 {

	public static void main(String[] args) {
		
		
		ArrayList<String> ciutats = new ArrayList<String>();
		
		ciutats.add("Barcelona"); 
		ciutats.add("Madrid"); 
		ciutats.add("Valencia"); 
		ciutats.add("Málaga"); 
		ciutats.add("Cádiz"); 
		ciutats.add("Santander"); 
		
		Collections.sort(ciutats);
		for (String i: ciutats){
	  
			System.out.println(i);
	  
		} 
	}
}


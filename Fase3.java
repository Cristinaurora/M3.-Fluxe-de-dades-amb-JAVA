import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Fase3 {

	public static void main(String[] args) {
		
		ArrayList<String> ciutats = new ArrayList<String>();
		
		ciutats.add("Barcelona"); 
		ciutats.add("Madrid"); 
		ciutats.add("Valencia"); 
		ciutats.add("Málaga"); 
		ciutats.add("Cádiz"); 
		ciutats.add("Santander"); 
		
		ArrayList<String> ArrayCiutatsModificades = new ArrayList<String>();
			      
		for (int i = 0; i < ciutats.size(); i++) {
			ArrayCiutatsModificades.add(ciutats.get(i).replace('a', '4'));
		}
	    
		
		System.out.println (ArrayCiutatsModificades);
		
		
		
		

	}

}

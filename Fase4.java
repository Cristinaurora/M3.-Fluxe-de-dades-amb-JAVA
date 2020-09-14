import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fase4 {

	public static void main(String[] args) {
		
			
			ArrayList<String> ciutats = new ArrayList<String>();
			
			ciutats.add("Barcelona"); 
			ciutats.add("Madrid"); 
			ciutats.add("Valencia"); 
			ciutats.add("Málaga"); 
			ciutats.add("Cádiz"); 
			ciutats.add("Santander"); 
			
			char[] BarcelonaCiutat = new char[ciutats.get(0).length()];
			
	        for (int i = 0; i < ciutats.get(0).length(); i++) { 
	        	BarcelonaCiutat[i] = ciutats.get(0).charAt(i);
	        	
	        }
	        
	        char[] MadridCiutat = new char[ciutats.get(1).length()];	
	        
	        for (int i = 0; i < ciutats.get(1).length(); i++) { 
	        	MadridCiutat[i] = ciutats.get(1).charAt(i);	
	        }
	        	//hola
	        
	        char[] ValenciaCiutat = new char[ciutats.get(2).length()];	
	        
	        for (int i = 0; i < ciutats.get(2).length(); i++) { 
	        	ValenciaCiutat[i] = ciutats.get(2).charAt(i);	
	        }
	          //h0la
	        
	        char[] MálagaCiutat = new char[ciutats.get(3).length()];	
	        
	        for (int i = 0; i < ciutats.get(3).length(); i++) { 
	        	MálagaCiutat[i] = ciutats.get(3).charAt(i);	
	        }
	        
	        char[] CádizCiutat = new char[ciutats.get(4).length()];	
	        
	        for (int i = 0; i < ciutats.get(4).length(); i++) { 
	        	CádizCiutat[i] = ciutats.get(4).charAt(i);	
	        }
	        
	        char[] SantanderCiutat = new char[ciutats.get(5).length()];	
	        
	        for (int i = 0; i < ciutats.get(5).length(); i++) { 
	        	SantanderCiutat[i] = ciutats.get(5).charAt(i);	
	        }
	        	
	       
	         for(int i= BarcelonaCiutat.length-1;i>=0;i--)
	             System.out.print(BarcelonaCiutat[i]);
	         
	         for(int i= MadridCiutat.length-1;i>=0;i--)
	             System.out.print(MadridCiutat[i]);
	         
	         for(int i= ValenciaCiutat.length-1;i>=0;i--)
	             System.out.print(ValenciaCiutat[i]);
	         
	         for(int i= MálagaCiutat.length-1;i>=0;i--)
	             System.out.print(MálagaCiutat[i]);
	         
	         for(int i= CádizCiutat.length-1;i>=0;i--)
	             System.out.print(CádizCiutat[i]);
	         
	         for(int i= SantanderCiutat.length-1;i>=0;i--)
	             System.out.print(SantanderCiutat[i]);
	       

	}

}

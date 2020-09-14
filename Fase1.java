import java.util.Scanner;

public class Fase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String ciudad1= new String (); 
		String ciudad2= new String ();
		String ciudad3= new String ();
	    String ciudad4= new String ();
	    String ciudad5= new String ();
	    String ciudad6= new String ();
	    
	    Scanner ciudades  = new Scanner(System.in);
	    
	    
	    System.out.println("enter ciudades");
	    
	  ciudad1 = ciudades.nextLine();
	  ciudad2 = ciudades.nextLine();
	  ciudad3 = ciudades.nextLine();
	  ciudad4 = ciudades.nextLine();
	  ciudad5 = ciudades.nextLine();
	  ciudad6 = ciudades.nextLine();
	  
	    
	    System.out.println(ciudad1 + ","+ " "+ 
	    ciudad2 + ","+ " "+ 
	    ciudad3 +  ","+ " "+
	    ciudad4 + ","+ " "+ 
	    ciudad5+ ","+ " "+
	    ciudad6+".");



	}

}

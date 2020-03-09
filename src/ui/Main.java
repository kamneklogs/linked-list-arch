package ui;
import model.*;

public class Main{

    public static void main(String[] args) {
		
    	Department d = new Department();
    	
    	d.addOffice("Camilo", 1);
    	d.addOffice("Andres", 1);
    	d.addOffice("Sarmiento", 1);
    	
    	
    	System.out.println(d.report());
    	
    	d.sortByCode();
    	
    	System.out.println(d.report());
    	
	}

}
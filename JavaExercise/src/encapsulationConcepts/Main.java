package encapsulationConcepts;

public class Main 
{
	 public static void main(String[] args) {

	        Jewellery j = new Jewellery();

	        // setting values
	        j.setGms(4);
	        j.setDesign("Necklace");

	        // getting values
	        System.out.println("Gold grams: " + j.getGms());
	        System.out.println("Design: " + j.getDesign());
	    }
	}


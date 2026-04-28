package classesMethodsConcepts;

public class KilogramsToGram 
{
	
	public int Convertkilogramstograms(int kg)
    {
      int grams = kg*1000;
        System.out.println("Weight in grams is"+ grams);
        return grams;
    }
    public static void main(String[] args) {
    	KilogramsToGram g = new KilogramsToGram();
        g.Convertkilogramstograms(6);
    }
}

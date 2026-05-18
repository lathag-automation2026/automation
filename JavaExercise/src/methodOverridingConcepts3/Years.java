package methodOverridingConcepts3;

public class Years extends Months 
{

    @Override
    public void may() {
        System.out.println("May is school opening");
    }
}

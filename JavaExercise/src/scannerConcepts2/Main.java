package scannerConcepts2;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Add a = new Add();
        a.parent();

        a.purchase(2,2.55);

        System.out.println("The name g:" + a);

        Murgan m = new Murgan();
        m.purchase(8,8.6);

        String name = "raja";

        int n = '1';
        int t = '0';

        if(name == "rajaa") 
        {
            System.out.println("The name is Raja");
        }
        else 
        {
            System.out.println("number is 1 ");

            do 
            {
                System.out.println("Enter the number");

                Scanner var = new Scanner(System.in);

                int va = var.nextInt();

                for(int q = 0; q < va; q++)
                {
                    System.out.println("SANTHOSH");
                }

                t++;

            } while(t > n);
        }
    }
}
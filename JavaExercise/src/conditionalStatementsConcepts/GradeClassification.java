package conditionalStatementsConcepts;

public class GradeClassification 
{
	

    public static void main(String[] args) {
        int marks = 80;
       if(marks>=90)
       {
           System.out.println("Outstanding");
       }
       else if (marks>=80 && marks<90)
       {
        System.out.println("Excellent");   
       }
       else if (marks>=70 && marks<80)
       {
         System.out.println("Very Good"); 
       }
        else if (marks>=60 && marks<70)
       {
         System.out.println("Good"); 
       }
      else if (marks>=50 && marks<60)
       {
         System.out.println("Fine"); 
       }
        else 
       {
         System.out.println("Fail"); 
       }
    }

}

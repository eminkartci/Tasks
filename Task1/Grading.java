import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        find_average();
    }
    public static void find_average() {
        double midterm1 = 0;
        double midterm2 = 0;
        double finalExam    = 0;
        double avg       = 0;
        char   letter         = 'F';

        //Get the inputs from the user
        Scanner input1 = new Scanner(System.in);
        System.out.print("Midterm 1 grade: ");
         midterm1 = input1.nextInt();

        
        System.out.print("\nMidterm 2 grade: ");
         midterm2 = input1.nextInt();

       
        System.out.print("\nFinal grade: ");
         finalExam = input1.nextInt();

        input1.close();
        //Calculate the average
         avg = (midterm1+midterm2+finalExam)/3;
        
        if (avg >=90 ) {
            letter ='A';
            
        }
        else if (avg <90 && avg >=80 ) {
            letter ='B';
            
        }
        else if (avg >=70 && avg <80 ) {
            letter ='C';
            
        }
        else if (avg <70 && avg >=60 ) {
            letter ='D';
            
            
        }
        else{
            letter ='F';
            return;
        }
        
        
        // Deneme Commıt

        String outputStr =  "\n****** RESULTS ******\n" +
                            "Midterm 1 : "+ midterm1 +"\n" +
                            "Midterm 2 : "+ midterm2 +"\n" +
                            "finalExam : "+ finalExam +"\n" +
                            "Average   : "+ avg+"\n"+
                            "Letter    : " + letter ;

        //display the output
        System.out.println(outputStr);

    }
}

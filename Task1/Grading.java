import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        find_average();
    }
    public static void find_average() {

        //Get the inputs from the user
        Scanner input1 = new Scanner(System.in);
        System.out.print("Midterm 1 grade: ");
        int midterm1 = input1.nextInt();

        
        System.out.print("\nMidterm 2 grade: ");
        int midterm2 = input1.nextInt();

       
        System.out.print("\nFinal grade: ");
        int finalExam = input1.nextInt();

        input1.close();
        //Calculate the average
        double avg = (midterm1+midterm2+finalExam)/3;

        // Deneme Commıt

        String outputStr =  "\n****** RESULTS ******\n" +
                            "Midterm 1 : "+ midterm1 +"\n" +
                            "Midterm 2 : "+ midterm2 +"\n" +
                            "finalExam : "+ finalExam +"\n" +
                            "Average   : "+ avg+"\n";

        //display the output
        System.out.println(outputStr);

    }
}

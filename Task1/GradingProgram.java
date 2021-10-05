

/*

Author: Emin Kartci
GitHub: eminkartci
Date  : 17 April 2021

*/

import java.util.Scanner;

public class GradingProgram{

    public static void main(String[] args){

        // create exam grades
        double midtermGrade1 = 0;
        double midtermGrade2 = 0;
        double finalGrade    = 0;
        double average       = 0;
        char   grade         = 'F';

        // Create a scanner
        Scanner myScan = new Scanner(System.in);

        System.out.println("\n\n\n --- Grade Calculator Program --- \n\n");

        try{
            System.out.println("Midterm 1 : "); midtermGrade1   = myScan.nextDouble();
            System.out.println("Midterm 2 : "); midtermGrade2   = myScan.nextDouble();
            System.out.println("Final     : "); finalGrade      = myScan.nextDouble();
        }catch(Exception e){
            System.out.println("Please enter a valid number 0-100 !!");
        }
        // control grades
        if(midtermGrade1 < 0 || midtermGrade1 > 100 || midtermGrade2 < 0 || midtermGrade2 > 100 || finalGrade < 0 || finalGrade > 100){
            System.out.println("Grade should between 0-100 !!");
        }else{ 

            // average = 0.3 mid1 + 0.3 mid2 + 0.4 final
            average = midtermGrade1 * 0.3 + midtermGrade2 * 0.3 + finalGrade * 0.4;
        }


        /*
        The if the average:
            A  ; average >= 90
            B  ; 90 > average >= 80
            C  ; 80 > average >= 70
            D  ; 70 > average >= 60
            F  ; 60 > average 
        */
        if(average >= 90 ){
            grade = 'A';
        }else if (average >= 80){
            grade = 'B';
        }else if (average >= 70){
            grade = 'C';
        }else if (average >= 60){
            grade = 'D';
        }else{
            grade = 'F';
        }


        // Create a string like:
            /*
                First Midterm Grade : ---
                Second Midterm Grade: ---
                Final Grade         : ---
                -------------------------
                Average             : ---
                Letter Grade        : ---
            */
        String content = "\n\nFirst Midterm Grade : " + midtermGrade1   + "\n"
                        +"Second Midterm Grade: " + midtermGrade2   + "\n"
                        +"Final Grade         : " + finalGrade      + "\n" 
                        +"-------------------------"                + "\n"
                        +"Average             : " + average         + "\n"
                        +"Letter Grade        : " + grade           ;

        // Print to the screen
        System.out.println(content);

    }

}
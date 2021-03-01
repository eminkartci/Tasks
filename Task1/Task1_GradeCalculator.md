
### Task 1
```

Title: Grading Program
Definition: This program gets the exam grades of a student and decides a letter grade.

1. Get the exam grades from student:

    midtermGrade1
    midtermGrade2
    finalGrade 

!! The value of these integers will be taken from the user by "console"

    1.2 Be careful !!

        1.2.1 Grade cannot be a string
        1.2.2 Grade cannot exceed 100
        1.2.3 Grade cannot be lower than 0

    
2. Then calculate the average of the exams and keep the value as float or double

    ** If you took the grades as integers the result won't be exactly true
    ## Go to the Warning 1

examAverages

The if the average:
A  ; average >= 90
B  ; 90 > average >= 80
C  ; 80 > average >= 70
D  ; 70 > average >= 60
F  ; 60 > average 

Report the grades - averge - letter grade

```
### Expected Output
```
First Midterm Grade : ---
Second Midterm Grade: ---
Final Grade         : ---
-------------------------
Average             : ---
Letter Grade        : ---

```
---
## Warning 1
#### Warning 1 - Code 1
```Java
public static void main(String[] args){

    // I assume that you get the inputs from the user
    int midtermGrade1   = 80;
    int midtermGrade2   = 81;
    int finalGrade      = 95;

    // calculate the average of the exams
    double averageGrade = (midtermGrade1 + midtermGrade2 + finalGrade) / 3;

    // Print result to the screen
    System.out.println("Average of the exams: " + averageGrade);

}

```
#### Warning 1 Output 1
```
Average of the exams: 85.0
```
```
    The problem is that exact result is 85.333333 

    This problem occurs when you get the grades as integers. 
    There are 2 solutions for that :

    1. Get the inputs as double

    2. "casting"

        Sometimes we have to get the inputs as integer.
        While calculating we want to use them as double.

        ((double)midtermGrade1 + (double)midtermGrade2 + (double)finalGrade) / 3;

        If they are in a correct format we can convert variable types.
```
---
##Thanks
```
Author      : Emin Kartci
Date        : 02/02/2021
Difficulty  : Easy

```
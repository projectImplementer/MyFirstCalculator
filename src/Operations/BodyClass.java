package Operations;

import java.util.Scanner;

public class BodyClass {

    public String run;

    public static void body() {

        // Objects
        Addition adding = new Addition();
        //

        Integer num1;
        Integer num2;
        char operator;
        double answer = 0.0;

        Scanner scanObject = new Scanner(System.in);  // create Scanner type object.

        System.out.println("The value of x is: ");
        num1 = scanObject.nextInt();   // the terminal waits for user input for num1.
        System.out.println("The value of y is: ");
        num2 = scanObject.nextInt();  // the terminal waits for user input for num2.
        System.out.println("What operation will be done? ");
        operator = scanObject.next().charAt(0);   // the operator char var receives char value index of 0.

// in a case from switch we can add more operations per case, even methods.
        switch (operator) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
            case 'k':
                adding.calculate();
                System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
                answer = num1 - num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
                answer = num1 * num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
                answer = num1 / num2;
                break;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
    }
}

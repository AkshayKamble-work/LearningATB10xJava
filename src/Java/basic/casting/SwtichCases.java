package Java.basic.casting;

import java.util.Scanner;

public class SwtichCases {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Simple Calculator using switch statement: ");
        String op = sc.next();
        switch(op){
            case "+":
                System.out.println("Addition: "+(num1+num2));
                break;
            case "-":
                System.out.println("Substraction: "+(num1-num2));
                break;
            case "*":
                System.out.println("Multiplication: "+(num1*num2));
                break;
            case "/":
                System.out.println("Division: "+(num1/num2));
                break;
            case "%":
                System.out.println("Modulus: "+(num1%num2));
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        sc.close();
    }
}

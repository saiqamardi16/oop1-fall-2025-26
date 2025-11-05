package lab;

import java.util.Scanner;

public class mortgagecalculator {
    public static void main(String[]args){
        System.out.println("Mortage Calculator: ");

         Scanner input = new Scanner (System.in) ;


   System.out.println("Enter the loan amount (P): ") ;
   double principal = input.nextDouble() ;

   System.out.println("Enter annual interest rate in ( in % ): ");
   double annualRate = input.nextDouble();

   System.out.println("Enter the loan term in years : ");
     int years = input.nextInt();
     double r = annualRate / 100/ 12 ;
      int n =  years * 12 ;

      double numerator = r * Math.pow( 1+r , n );
      double denominator = Math .pow (1+r,n)- 1 ;
        double monthlyPayment = principal * (numerator/denominator );

        System.out.println ( "Your monthly payment is ($) : " + String.format("%.2f", monthlyPayment));

        input.close();

    }

    }
    


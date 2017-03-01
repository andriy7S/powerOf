package com.andriyshapoval;

/*Write a recursive method called power that takes a double x and an integer n and
        returns xn.
        Hint: A recursive definition of this operation is xn = x · xn − 1. Also, remember that
        anything raised to the zeroth power is 1.
        Optional challenge: you can make this method more efficient, when n is even, using
        xn = xn/2 2.*/

public class Main {

    public static double power (double x, int n) {
        if (n == 0){
            return 1;
        } else if ( n == 1) {
            return x;
        } else {
            return x * (power(x, n - 1));
        }
    }
    public static double powerEfficient (double x, int n){
        if (n == 0){
            return 1;
        } else if ( n == 1) {
            return x;
        } else if ( n == 2){
            return x * x;
        } else if (n % 2 == 0){
            return powerEfficient((powerEfficient(x, n / 2)), 2);
        }
        return x *(powerEfficient(x, n -1));
    }

    public static void main(String[] args) {
       double x = 3;
       int n = 7;
	   double result = power(x,n);
	   System.out.println("The result is: " + result);

	   double resultEfficient = powerEfficient(x, n);
	   System.out.println("The result of efficient method is: " + resultEfficient);
    }
}

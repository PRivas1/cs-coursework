/*
    Pablo Rivas     Lab03
    2/8/2023
*/

#include <stdio.h>
#include <math.h>

// function prototypes
double paymentCalculator(double carCost, double downPayment, double annualRate, double n);
double gosperFormula (double n);

// main

int main (void){

    // Payment Calculator 

    double carCost,        //cost of vehicle
           downPayment,    //down payment
           annualRate,     //annual interest rate
           numPayments,    //number of payments
           payment;        //final payment cost

    //inputs
    printf("    CALCULATE LOAN PAYMENT:\nEnter cost of car: ");
    scanf("%lf", &carCost);
    printf("Enter down payment: ");
    scanf("%lf", &downPayment);
    printf("Enter annual interest rate: ");
    scanf("%lf", &annualRate);
    printf("Enter number of payments: ");
    scanf("%lf", &numPayments);

    payment = paymentCalculator(carCost, downPayment, annualRate, numPayments); //calling the function
    printf("Your mountly payment is %.2f", payment);
    printf("\n");


    //Gospers Formula

    int n; //input n

    printf("\n    GOSPER FORMULA\nEnter an intenger: ");
    scanf("%d", &n);
    printf("%d! equals approximately %lf\n", n, gosperFormula(n));



    return 0;    
}

// Payment Calculator Formula

double paymentCalculator(double carCost, double downPayment, double annualRate, double n){
    double p, //principle
           i, //monthly interest rate
           payment; //final payment amount

    p = carCost - downPayment;
    i = annualRate / 12;

    payment = p * ((i * pow(1 + i, n)) / (1 - pow(1 + i, n) ));
    return fabs(payment);
}

// Gosper Formula
double gosperFormula (double n){
    double a, //(2n + 1/3)
           b, //root(pi*a)
           c, //(n/e)^n
           d; //final solution
    
    a = (2.0*n + 1.0/3.0);
    b = sqrt(M_PI * a);
    c = pow(n/exp(1), n);
    d = b * c;

    //printf("\nDEBUG: %lf, %lf, %lf, %lf \n\n", n, a, b ,c);
    return d;
}


/*
    OUTPUTS:


    CALCULATE LOAN PAYMENT:
Enter cost of car: 30000
Enter down payment: 0
Enter annual interest rate: 0.03
Enter number of payments: 60
Your mountly payment is 539.06

    GOSPER FORMULA
Enter an intenger: 1
1! equals approximately 0.996022

    CALCULATE LOAN PAYMENT:
Enter cost of car: 30000
Enter down payment: 0
Enter annual interest rate: 0.045
Enter number of payments: 60
Your mountly payment is 559.29

    GOSPER FORMULA
Enter an intenger: 2
2! equals approximately 1.997363

    CALCULATE LOAN PAYMENT:
Enter cost of car: 30000
Enter down payment: 0
Enter annual interest rate: 0.06
Enter number of payments: 60
Your mountly payment is 579.98

    GOSPER FORMULA
Enter an intenger: 3
3! equals approximately 5.996135

    CALCULATE LOAN PAYMENT:
Enter cost of car: 30000
Enter down payment: 0
Enter annual interest rate: 0.075
Enter number of payments: 60
Your mountly payment is 601.14

    GOSPER FORMULA
Enter an intenger: 4
4! equals approximately 23.990890

    CALCULATE LOAN PAYMENT:
Enter cost of car: 30000
Enter down payment: 0
Enter annual interest rate: 0.09
Enter number of payments: 60
Your mountly payment is 622.75

    GOSPER FORMULA
Enter an intenger: 5
5! equals approximately 119.970030

    CALCULATE LOAN PAYMENT:
Enter cost of car: 30000
Enter down payment: 0
Enter annual interest rate: 0
Enter number of payments: 60
Your mountly payment is nan

    GOSPER FORMULA
Enter an intenger: 6
6! equals approximately 719.872829

    GOSPER FORMULA
Enter an intenger: 7
7! equals approximately 5039.337479

    GOSPER FORMULA
Enter an intenger: 8
8! equals approximately 40315.902823


CAR CHOSEN:
2023 Toyota GR Corolla Full Spec
Final cost:
$53,997
36 months
3.17% Interest rate
$3,506 Down payment

    CALCULATE LOAN PAYMENT:
Enter cost of car: 53997
Enter down payment: 3506
Enter annual interest rate: 3.17
Enter number of payments: 36
Your mountly payment is 13340.92



*/
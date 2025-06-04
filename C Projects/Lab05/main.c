/*
    Pablo Rivas Lab05
    Feb 20th, 2023
*/

#include <stdio.h>

int divisibleByNine (int n);    //checks if number is divisible by 9
double piIterations (int iterations);   //return pi with input iterations

int main (void){
    int n,  //input number for divisble by 9
        iterations;     //input number of iterations

    printf("IS IT DIVISIBLE BY 9\nEnter an integer: ");
    scanf("%d", &n);

    switch (divisibleByNine(n)){    //switch for output
        case 0:
            printf("%d is NOT divisible by 9\n", n);
            break;
        case 1:
            printf("%d is divisible by 9\n", n);
            break;
    }

    printf("\nESTIMATE PI\nEnter number of iterations: ");
    scanf("%d", &iterations);

    printf("\nEstimated PI is %1.6lf\n", piIterations(iterations));   //limitied to {0.000000}

return 0;
}


int divisibleByNine(int n){
    int r = 0,  //remainder
        sum = 0;    //sum of digits

    while (n != 0){
        r = n % 10;     //modulus to find digit
        sum += r;
        n /= 10;    //removes digit with int properties
    }

    if (sum % 9 == 0){  //checks if sum of digits is divisible by 9
        return 1;
    }
    else {
        return 0;
    }

}

double piIterations (int iterations){
    int negative = 1,   //negative starts as a positive
        denominator = 1;
    double pi = 4.00,
           sum = 0;
    
    for (int i = 0; i <= iterations; ++i){
        sum += ((1.0/denominator) * negative);  //fractions
        negative *= -1;     //flips the sign
        denominator += 2;    //increments of 2
    }

    pi *= sum;
    return pi;
}

/*
    OUTPUT:

    IS IT DIVISIBLE BY 9
    Enter an integer: 154368
    154368 is divisible by 9

    ESTIMATE PI
    Enter number of iterations: 99

    Estimated PI is 3.131593

    IS IT DIVISIBLE BY 9
    Enter an integer: 123456
    123456 is NOT divisible by 9

    ESTIMATE PI
    Enter number of iterations: 9999

    Estimated PI is 3.141493

    IS IT DIVISIBLE BY 9
    Enter an integer: 621594
    621594 is divisible by 9
*/
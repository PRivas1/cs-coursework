/*
    Pablo Rivas     Lab06
    March 8th, 2023

*/

#include <stdio.h>
#include <math.h>
#include <limits.h>

int number_list();
int quadratic_formula();

int main (void){

    printf("Enter positive integers, when finished enter in -1: \n");
    number_list();

    printf("Quadratic Formula Calculator: \n");
    quadratic_formula();
     
return 0;
}


int number_list(){

    int input = 0,      //input from user
        maximum = INT_MIN,        //maximum value from inputs (Uses limits.h for smallest possible starting value)
        minimum = INT_MAX,        //minimum value from inputs (Uses limits.h for highest possible starting value)

        // Instead of limits.h, i could also ask the user to enter their first integer and assign it to both the min and max

        average = 0,    //average of all inputs
        integers = 0,   //number of inputs
        sum = 0;        //sum of all inputs

    
    while (input != -1){

        scanf("%d", &input);
        while (input < -1){     //checks if input is a negative number
            printf("Please enter in a positive integer: \n");
            scanf("%d", &input);
        }
        if (input != -1){   //checks if input is not sentinel value
            integers += 1;
            sum += input;
            if (input > maximum)
                maximum = input;
            if (input < minimum)
                minimum = input;
        }
        else
            break;  //breaks if sentinel value is the input

    }

    average = sum / integers;

    printf("Maximum: %d, Minimum: %d, Average: %d, Number of Integers: %d\n", maximum, minimum, average, integers);

return 0;
}


int quadratic_formula(){

   int a,
       b,
       c,
       i = 0,
       input;

    double discriminant = 0,
           form1 = 0,
           ans1 = 0,
           ans2 = 0;


    printf("Please enter a: \n");
    scanf("%d", &a);
    printf("Please enter b: \n");
    scanf("%d", &b);
    printf("Please enter c: \n");
    scanf("%d", &c);
    

    discriminant = pow(b,2) - 4 * a * c; //find the discriminant

    if (discriminant < 0){ //checks for negative
        i = -1;
        discriminant *= -1;
    }
    
    
    if (i == -1){ //math for complex numbers
        ans1 = (sqrt(discriminant)/2*a);
        ans2 = (sqrt(discriminant)/2*a);
        form1 = (-b/(2*a));
        printf("X = %g - %gi, %g + %gi\n", form1, ans1, form1, ans2);
    }
    else{ //math for non complex numbers
        ans1 = (-b/(2*a)) - ((sqrt(discriminant)/2*a));
        ans2 = (-b/(2*a)) + ((sqrt(discriminant)/2*a));
        printf("X = %g, %g\n", ans1, ans2);
    }

    printf("Do you want to run this calculator again? Enter 1 if yes: \n");
    scanf("%d", &input);

    if (input == 1)
        quadratic_formula();


return 0;
}


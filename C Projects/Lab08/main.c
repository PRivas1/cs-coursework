/*
    Pablo Rivas     Lab08
    March 28th, 2023
*/

#include <stdio.h>
#include <stdbool.h>    //bool for true/false
#include <math.h>

bool just_missed (int grade);

void formula1 (double *slopep, double *yintp); //functions with pointer
void formula2 (double *slopep, double *yintp);
void formula3 (double *slopep, double *yintp);

int main(void){
    //grade question function is below main
    int grade;

    printf("Enter in grade: ");
    scanf("%d", &grade);
    if(just_missed(grade) == true)
        printf("True");
    else 
        printf("False");

    
    /*
        Slope Intercept
    */
    int choice;
    
    double slope,
           y_intercept,
           *slopep, //pointer for slope
           *yintp;  //pointer for y int

    printf("\n\nPlease choose from one of the following input options:\n1) Two Points Given\n2) One point given + Slope\n3) Slope and y-int given\n");
    scanf("%d", &choice);

    switch (choice){
        case 1:
            formula1(&slope, &y_intercept);
            printf("\nSlope intercept form: y = %gx + %g\n", slope, y_intercept);
            break;
        case 2:
            formula2(&slope, &y_intercept);
            printf("\nSlope intercept form: y = %gx + %g\n", slope, y_intercept);
            break;
        case 3:
            formula3(&slope, &y_intercept);
            printf("\nSlope intercept form: y = %gx + %g\n", slope, y_intercept);
            break;
        
    }

}

//checks if just missed is true
bool just_missed(int grade){    
    double remainder;

    remainder = (double)grade *0.1; //bring it down one tenth
    grade = floor(remainder);   //gets rid of decimal
    remainder -= grade; //subtracts decimal
    remainder *= 10;    // mult by 10 to bring it up one tenth

    if ((int)remainder == 9)
        return true;
    else 
        return false;
}

void formula1 (double *slopep, double *yintp){
    int x1,
        x2,
        y1,
        y2;

    printf("\nPlease enter in the following points: \nx1: ");
    scanf("%d", &x1);
    printf("y1: ");
    scanf("%d", &y1);
    printf("x2: ");
    scanf("%d", &x2);
    while (x2 == x1){       //error check
        printf("Please enter in a valid number: ");
        scanf("%d", &x2);
    }
    printf("y2: ");
    scanf("%d", &y2);

    *slopep = (y2 - y1)/(x2-x1);  //finds slope
    *yintp = y1 - *slopep*x1;       //finds y int

}

void formula2 (double *slopep, double *yintp){
    int x1,
        y1;
    

    printf("\nEnter in x1: ");
    scanf("%d", &x1);
    printf("y1: ");
    scanf("%d", &y1);

    printf("\nEnter in the slope: ");
    scanf("%lf", &*slopep);

    // y = mx + b
    //-b = mx -y
    //b = -mx + y

    *yintp = -(*slopep * x1) +y1;   //uses formula to find y int

}

void formula3 (double *slopep, double *yintp){  //no calculations needed

    printf("\nEnter in the slope as a double: ");
    scanf("%lf", &*slopep);
    printf("Enter in the y-intercept: ");
    scanf("%lf", &*yintp);

}


/*

2)
Returning the output is a better option if you need the data back in the main function. Printing the output only
leads to the user being able to view it, but since functions dont share variables unless a pointer is used, the
data that you get from the function would be lost, returning it give the data back to the main function to be 
used for other parts of the code. In this program i wrote all it does it prints it out back in the main function.

3)
All of the functions in the program including the main function are able to call the function grumpy. It can even 
be called within its own function which is called recursion. Since the preprocessor directive is at the start before 
any of the other functions, they are all able to be called.
*/

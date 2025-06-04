/*
    Pablo Rivas     Lab10
    April 13th, 2023
*/
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define MAXSIZE 20

void question1();
void get_poly(int *np, int coefficients[]);
double eval_poly(int *np, int coefficients[]);

int main (void){
    int n,
        *np,
        coefficients[MAXSIZE];

    get_poly(&n, coefficients);   
    printf("\nValue: %g", eval_poly(&n, coefficients));

return 0;
}

void get_poly(int *np, int coefficients[]){
    printf("\nEnter in the degree: ");
    scanf("%d", &*np);

    for(int i=0; i<=*np; i++){
        printf("Enter the coefficient for %d: ", i);
        scanf("%d", &coefficients[i]);
    }
    printf("\n");
    for(int i=0; i<=*np; i++){
        printf("%d[%d]X^[%d]", coefficients[i], i, i);
        if (i<*np)
            printf(" + ");
    }
}

double eval_poly(int *np, int coefficients[]){
    int x;
    double eval = 0;
    printf("\n\nPlease enter in the value for X: ");
    scanf("%d", &x);

    for(int i=0; i<=*np; i++){
        eval += pow((double)coefficients[i], i)*pow(x, i);
    }

    return eval;
}



void question1(){
    double ar1[30];
    char ar2[30];
    int ar3[20];

    printf("Enter data type double: \n");
    for (int i=0; i < 30; i++){
        printf("%d: ", i);
        scanf("%lf", &ar1[i]);
    }
    printf("Enter data type char\n");
    for (int i=0; i < 30; i++){
        printf("%d: ", i);
        scanf("%c", &ar2[i]);
    }
    printf("Enter data type int\n");
    for (int i=0; i < 20; i++){
        printf("%d: ", i);
        scanf("%d", &ar3[i]);
    }
}

/*
Question 2:
a)Not valid
    ar1 and ar2 dont exist in main
b)Not valid
    Only gives the 7th element which does not exist
c)Valid
    Works fine, sum of c and d put into e
d)Valid
    int n us unkown, not explained in the question so same as c
e)Valid
    same as above
f)Valid/Not Valid
    works but not as intended, sum of e and d will be put into c
g)Valid/Not Valid
    works but not as intended, doubles numbers in the array
h)Not Valid
    6 is not an array
i)Same questions as d
j)Valid
    arrays are doubles, int n isn't defined in the question

int n wasn't explained in the question, is it the amount of iterations for a loop? Length of arrays?
from the question it seems that:
c is supposed to be ar1
d is supposed to be ar2
e is supposed to be ar_sum
*/
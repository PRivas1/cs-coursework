/*
    Pablo Rivas
    Feb 23th, 2023
*/

#include <stdio.h>
#include <math.h>

double area_of_ellipse (double a, double b);
double diagonal_of_box (double l, double w, double h);
double area_of_pyramid (double l, double w, double h);
int add_integers ();

int main (void){
    int chosen;

    double a,
           b,
           l,
           w,
           h;

    printf("Chose what program to run: ");
    scanf("%d", &chosen);
    
    switch (chosen){
        case 1:
            printf("Enter A: ");
            scanf("%lf", &a);
            printf("Enter B: ");
            scanf("%lf", &b);
            printf("%g\n", area_of_ellipse(a,b));
            break;
        case 2:
            printf("Enter L: ");
            scanf("%lf", &l);
            printf("Enter W: ");
            scanf("%lf", &w);
            printf("Enter H: ");
            scanf("%lf", &h);
            printf("%g\n", diagonal_of_box(l,w,h));
            break;
        case 3:
            printf("Enter L: ");
            scanf("%lf", &l);
            printf("Enter W: ");
            scanf("%lf", &w);
            printf("Enter H: ");
            scanf("%lf", &h);
            printf("%g\n", area_of_pyramid(l,w,h));
            break;
        case 4:
            printf("%d", add_integers());
    }

}

double area_of_ellipse(double a, double b){
    double area;
    area = M_PI*(a*b);
    return area;

}

double diagonal_of_box (double l, double w, double h){
    double diagonal;
    diagonal = sqrt(pow(l, 2)+pow(w, 2)+pow(h, 2));
    return diagonal;

}

double area_of_pyramid (double l, double w, double h){
    double area;
    area = l*w + l*sqrt(pow((w/2), 2)+pow(h, 2))+ w*sqrt(pow((l/2), 2)+pow(h, 2));
    return area;

}

int add_integers (){
    int sum = 0;
    char input;
    
    do{
        printf("\nEnter char: ");
        scanf("\n%c", &input);
        if (input - 0 >= 0 && input - 0 <= 9){
            sum += input - 0;
            break;
        }
    }while(input - 0 >= 0 && input - 0 <= 9);

    return sum;

}

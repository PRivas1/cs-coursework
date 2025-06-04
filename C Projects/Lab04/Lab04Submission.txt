/*
    Pablo Rivas     Lab04
    Feb 14th, 2023
*/

#include <stdio.h>

//substance values
#define WATER 100
#define MERCURY 357
#define COPPER 1187
#define SILVER 2193
#define GOLD 2660

int leapYear (int month, int day, int year); //determines if it is a leap year
int dayCalculator (int month, int day, int leap); //caculates what day of the year it is

int within_x_percentage (int ref, int data, double x); //return 0 if false, 1 if true
const char* substanceFinder (int meltingPoint); //finds what substance from provided input


int main (void){
    //day calculator
    int month,  //input month
        day,    //input day
        year,   //input year
        leap,   //1 means leap year, 0 means normal year
        days;   //finals amount of days

    printf("CALCULATE DAY OF THE YEAR\nEnter a Date: ");
    scanf("%d %d %d", &month, &day, &year);     //input

    leap = leapYear(month,day,year); 
    days = dayCalculator(month, day, leap);
    printf("%d/%d/%d is the %dth day of %d\n", month, day ,year, days, year);   //output

    //substance from boiling point
    int meltingPoint; //input meltling point
    

    printf("FIND SUBSTANCE GIVEN ITS BOILING POINT\n\nEnter a temperature: ");
    scanf("%d", &meltingPoint);
    printf("The substance is %s\n", substanceFinder(meltingPoint));


return 0;
}


int leapYear (int month, int day, int year){
    if (year % 100 == 0){   //determines if it is a century year
        if (year % 400 == 0){   //leap year
            return 1;
        }
        else{
            return 0;
        }
    }
    else if (year % 4 == 0){    //leap year
        return 1;
    }
    else{
        return 0;
    }
}


int dayCalculator (int month, int day, int leap){
    switch(month){      //sums up the input days with the months
        case 1:
            break;
        case 2:
            day = day + 31;
            break;
        case 3:
            day = day + 59;
            break;
        case 4:
            day = day + 90;
            break;
        case 5:
            day = day + 120;
            break;
        case 6:
            day = day + 151;
            break;
        case 7:
            day = day + 181;
            break;
        case 8:
            day = day + 212;
            break;
        case 9:
            day = day + 243;
            break;
        case 10:
            day = day + 273;
            break;
        case 11:
            day = day + 304;
            break;
        case 12:
            day = day + 334;
            break;
    }

    if (month > 2){     //adds a day if it is a leap year and is past feburary
        if (leap == 1){
            day++;
        } 
    }

    return day;
}

const char* substanceFinder (int meltingPoint){     //tests the input melting point with the possible substances
    if (within_x_percentage(WATER, meltingPoint, 0.05) == 1){
        return "Water";
    }
    else if (within_x_percentage(MERCURY, meltingPoint, 0.05) == 1){
        return "Mercury";
    }
    else if (within_x_percentage(COPPER, meltingPoint, 0.05) == 1){
        return "Copper";
    }
    else if (within_x_percentage(SILVER, meltingPoint, 0.05) == 1){
        return "Silver";
    }
    else if (within_x_percentage(GOLD, meltingPoint, 0.05) == 1){
        return "Gold";
    }
    else{
        return "Invalid";   //return invalid if it doesnt fall withing 5% of any substance
    }

}

int within_x_percentage (int ref, int data, double x){
    double lowRange,
           highRange;

    lowRange = ref - (data * x);
    highRange = ref + (data * x);
    
    if (data >= lowRange && data <= highRange){     //must be within the ranges to return 1
        return 1;
    }
    else 
        return 0;

return 0;
}


/*
    OUTPUT:

    CALCULATE DAY OF THE YEAR
    Enter a Date: 12 31 2004
    12/31/2004 is the 366th day of 2004
    FIND SUBSTANCE GIVEN ITS BOILING POINT

    Enter a temperature: 360
    The substance is Mercury

*/


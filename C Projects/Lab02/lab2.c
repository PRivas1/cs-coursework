/*  Pablo Rivas
     1/31/2023   */

#include <stdio.h>

#define MILE 0.655 //reimbursment per mile

int main (void){

    /*
        Mileage Calculator
    */

    int totalMiles, //currant mileage
        startMiles, //original mileage
        traveledMiles; //miles traveled

    double payment; //final payment after calculations

    //input mileage
    printf("Please enter your staring mileage: ");
    scanf("%d", &startMiles);
    printf("Please enter your current milage: ");
    scanf("%d", &totalMiles);

    //calculations
    traveledMiles = (totalMiles - startMiles);
    payment = traveledMiles * MILE;

    //print statements
    printf("Your traveled %d miles. At $%g per mile, your reimburesment is $%g\n", traveledMiles, MILE, payment);
    // print("you traveled", traveeledMIles, "asdasdasd")
    /*
        Fahrenheight to Celsius converter
    */
   
   double cOutput, //output in celcius
          fInput; //input in fahrenheight

   //input
   printf("Enter in degrees in fahrenheight: ");
   scanf("%lf", &fInput);

   //formula
   cOutput = ((5/9.0) * (fInput - 32.0));

   //output
   printf("%g in fahrenheight is %g degrees celcius", fInput, cOutput);

return 0;
}

/*
    OUTPUT

Please enter your staring mileage: 0
Please enter your current milage: 0
Your traveled 0 miles. At $0.655 per mile, your reimburesment is $0
Enter in degrees in fahrenheight: 212
212 in fahrenheight is 100 degrees celcius%    

Please enter your staring mileage: 0  
Please enter your current milage: 100
Your traveled 100 miles. At $0.655 per mile, your reimburesment is $65.5
Enter in degrees in fahrenheight: 32
32 in fahrenheight is 0 degrees celcius%  

Please enter your staring mileage: 0
Please enter your current milage: 429
Your traveled 429 miles. At $0.655 per mile, your reimburesment is $280.995
Enter in degrees in fahrenheight: -459.67
-459.67 in fahrenheight is -273.15 degrees celcius%   

Please enter your staring mileage: 22000
Please enter your current milage: 47000
Your traveled 25000 miles. At $0.655 per mile, your reimburesment is $16375
Enter in degrees in fahrenheight: 97
97 in fahrenheight is 36.1111 degrees celcius%    

*/
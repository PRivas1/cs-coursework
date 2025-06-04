/*
    Pablo Rivas     Lab07
    March 19th, 2023
*/

#include <stdio.h>

int main (void){
    FILE *inp;  //pointer to file

    char ch;

    int hit = 0,
        atBat = 0,
        atPlate = 0;

    double battingAverage = 0.0;

    inp = fopen("playerData", "r"); //reads file playerData

    if (inp == NULL){
        printf("Error while opening file"); //error if file doesn't open properly
    }
    else{
        do{
            ch = fgetc(inp); //gets the next char

            if (ch == 'H'){  //hit
                hit += 1;
                atBat += 1;
                atPlate += 1;
            }
            else if (ch == 'O'){  //out
                atBat += 1;
                atPlate += 1;
            }
            else if (ch == 'W')  //walk
                atPlate += 1;
            else if (ch == 'S')  //sacrifice
                atPlate += 1;
            else if (ch == 'P')  //hit by pitch
                atPlate += 1;
            else if (ch == ' ')  //white space
                printf("\n");
            else if (ch == '\n' || ch == EOF){ //new line or eof

                battingAverage = (double)hit / (double)atBat;

                printf("Number of times at plate: %d  Official at-bats: %d  Hits: %d  Batting Average: %.3lf  \n", atPlate, atBat, hit, battingAverage);
                printf("\n");

                atBat = 0; //sets values back to zero for new line
                atPlate = 0;
                hit = 0;

            }
            else if (ch <= 9 || ch > 0) //player nums
                printf("%c", ch);
  
        }while (ch != EOF);  //do while so the loop runs on the eof
    }

    fclose(inp);  //closes file
return 0;
}

/*
FILE playerData (Located in same dir as main.c): 

12 HOOOWSHHOOHPWWHO
4 OSOHHHWWOHOHOOO
7 HOWOOWOSHOPHWOWOOHOSP

Output:

12
Number of times at plate: 16  Official at-bats: 11  Hits: 5  Batting Average: 0.455  

4
Number of times at plate: 15  Official at-bats: 12  Hits: 5  Batting Average: 0.417  

7
Number of times at plate: 21  Official at-bats: 13  Hits: 4  Batting Average: 0.308  

*/
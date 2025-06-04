/*
    Pablo Rivas     Lab09
    April 4th, 2023
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

#define QUESTIONS 50
#define STUDENTS 25

double calculate_score (int correct, int num_of_answers);

int main (void){
    FILE* data;
    FILE* output;
    data = fopen("examdata.txt", "r");
    output = fopen("report.txt", "w");      //file points/creating output file

    char space,
         new_line,
         answers[QUESTIONS],
         responses[QUESTIONS];      //char variables and array declarations

    int num_of_questions,
        status,
        idnum = 0,
        correct = 0,
        id[STUDENTS];       //int variable and array declarations


    if (data == NULL){      //checks if file opened properly
        printf("Error while opening file");
        return (-1);
    }
    else{
        status = fscanf(data, "%d", &num_of_questions); //read num of questions
        fscanf(data, "%c", &space);     // skips space
        for(int i = 0; i<num_of_questions; i++){        //for loop puts answers into array
            fscanf(data, "%c", &answers[i]);
        }
        fscanf(data, "%c", &new_line);  //skips newline
        
        if (output == NULL){        //error in creating new file
            printf("Error while creating report.txt");
            return (-1);
        }

        fprintf(output, "      EXAM REPORT\n\n");
        fprintf(output, "Question  ");

        for (int i = 0; i < num_of_questions; i++){     //lists out num of questions
            fprintf(output, "  %d  ", i+1);
        }

        fprintf(output, "\nAnswers   ");

        for (int i = 0; i < num_of_questions; i++){     //lists out answers
            fprintf(output, "  %c  ", answers[i]);
        }

        fprintf(output, "\n\nID     Score\n");

        do{     //main loop for info
            fscanf(data, "%d", &idnum);     //gets id num
            fscanf(data, "%c", &space);

            for (int i = 0; i < num_of_questions; i++){     //gets responses and notes how many are correct
                fscanf(data, "%c", &responses[i]);
                if (responses[i] == answers[i])
                    correct ++;
            }

            fprintf(output, "%d", idnum);
            fprintf(output, "      %g  \n", calculate_score(correct, num_of_questions));    //calls function to compute score

            correct = 0;
            status = fgetc(data);   //status for loop
        }while(status != EOF);
    }
    fclose(data);
    fclose(output);
return 0;
}

double calculate_score (int correct, int num_of_answers){
    double grade;
    grade = ((double)correct/(double)num_of_answers)*100;       //calculates score and mult by 100
    return grade;
}

/*
FINAL OUTPUT FILE

      EXAM REPORT

Question    1    2    3    4    5  
Answers     d    b    b    a    c  

ID     Score
111      80  
102      60  
251      100  




1.
A data structure is a tool that has many very useful purposes. They hold data that can be accessed 
and modified in code. One example is an array which is a list and are assigned with the index 0,1,2,3...
Another data structure is a 2d array, similar to the first example it has the indexes of 0,1,2,3..., but
in a 2d array you have something similar to rows and columns. Its is used by [#][#] where it is stored as
{  {0,1,2,3,} {0,1,2,3} }. Another structure is a stack, where only the top instance is accessible. It works
as like a stack of pancakes, it places it on top.

2.
No, all elements of an array must be of the same type as c doesn't allow different elements like and 
int, char, string, in the same array.

3.
The first one allows editing to the array, while the const in front of the declaration of the array makes
it read only as it is a constant. You can't edit the const array and is very useful to make sure data isn't 
changed on accident.

4.
    i=0;
This line sets the increment to 0
    while (i<12){
this line creates a while loop that runs until the increment reaches 12, will run a total of 12 times
    scanf("%d", &n);
gets input from user for an integer
    nums[i] = n;
sets the input number to the index of the current iteration
    i += 1;
increases the iteration variable by one every time the loop runs

if the inputs are 5,2,6,8,3,1,5,7,8,4,2,6
the nums array will be {5,2,6,8,3,1,5,7,8,4,2,6}
so then the following would be
nums[0] = 5
nums[6] = 5
nums[11] = 6

5.
a) The array has 8 elements. Since its a 2d array it has 2 lines of 4
b) m[0][2], m[1][0], m[1][2], m[0][3] 
When you go to reference an elements, it has to be with the same indexes as a normal array starting at 0
(0,1,2,3...)
The first number is the "row" while the second is the "column"
*/

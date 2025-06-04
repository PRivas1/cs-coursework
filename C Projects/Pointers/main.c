#include <stdio.h>
/*

6.1
Pointers and indirect addressing

6.2
To see how to access external data files in a program and to be 
able to read from input file and write to output files using file pointers

6.3
To learn how to return function results through a function's arguments

6.4
To understand the differences between call-by-value and call-by-reference


Pointers
    Pointer (pointer variable)
        a memory cell that stores the address of a data item
        syntax: type *variable
            int m = 25;
            int *itemp;

Indirection
    indirect reference
        accessing the contents of a memory cell through a pointer variable that stores it address
        M:25 <--*itemp--- itemp:1024

Pointers to files
    C allows a program to explicitly name a file for input or output
    Declare file pointers
        FILE *inp; //pointer to input file
        FILE *outp; //pointer to output file
    Prepare for input or output before permitting access
        inp = fopen("infile.txt", "r");
        outp = fopen("outfile.txt", "w");
        r: read, w: write (will wipe the file), a: append (adds to the end of the file)
    fscanf
        file equivalent of scanf
        fscanf(inp, "%1f", &item);
    fprintf
        file equivalent of printf
        fprintf(outp, "%.2f\n", item);
    closing a file when done
        fclose(inp);
        fclose(outp);
        scratch files may be deleted after program is finished if not closed, wiping the file 
        (close files you want to keep)



*/


int main (void){



return 0;
}
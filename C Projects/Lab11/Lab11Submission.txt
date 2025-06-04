/*
    Pablo Rivas     Lab11
    April 24th, 2023
*/

/*
1a:
The result would be the reverse of the string. I came to this conclusion because i began
with the array "a,b,c,d,e". I then switched first with the last, next with second to last, 
and the middle stays the same as it switches. The end result was "e,d,c,b,a".
*/

#include <stdio.h>
#include <ctype.h>

#define STRINGLEN 5
#define STRINGMAX 80

void reverseString();
int palindrome(char *input, int len);
int string_position(char a[], char b[]);
void replace_string(char a[], char b[], char replacement[]);

int main(void){
    char input[STRINGMAX];

    reverseString();

    int len = 0;
    printf("Enter a string: ");
    int c = getchar();
    while(c != '\n' && len < 80) {
        input[len++] = c;
        c = getchar();
    }
    input[len] = '\0';

    for(int i=0; i<len; i++) {
        input[i] = toupper(input[i]);
    }

    if(palindrome(input, len)) {
        printf("'%s' is a palindrome\n", input);
    }
    else {
        printf("'%s' is NOT a palindrome\n", input);
    }

    char a[] = "cat";
    char b[] = "concatenate";
    char c[] = "ate";
    char d[] = "concatenate";
    int position = string_position(a, b);

    printf("Position of %s in %s: %d\n", a, b, position);
    
    
    replace_string(c, d, "1234");
    printf("New string: %s\n", d);
    
    return 0;
}

void reverseString(){
    char string[STRINGLEN] = "abcde";

    for (int i=0; i<STRINGLEN/2; i++){
        char buff;

        buff = string[i];
        string[i] = string[STRINGLEN-i-1];
        string[STRINGLEN-i-1] = buff;
    }

    for (int i=0; i<STRINGLEN; i++)
        printf("%c", string[i]);

    printf("\n");
}

int palindrome(char *input, int len){
    int i = 0, j = len-1;
    while(i<j) {
        while(i<j && !isalpha(input[i])) 
            i++;
        while(i<j && !isalpha(input[j])) j--;
            if(toupper(input[i]) != toupper(input[j])) {
              return 0;
        }
        i++;
        j--;
    }
    return 1;
}

int string_position(char a[], char b[]) {
    int i, 
        n, 
        m;

    for (i = 0; b[i] != '\0'; i++) {
        n = i;
        m = 0;
        while (a[m] != '\0' && b[n] == a[m]) {
            n++;
            m++;
        }
        if (a[m] == '\0') {
            return i+1;
        }
    }
    return 0;
}

void replace_string(char a[], char b[], char replacement[]) {
    int i, 
        n, 
        m;

    for (i = 0; b[i] != '\0'; i++) {
        n = i;
        m = 0;
        while (a[m] != '\0' && b[n] == a[m]) {
            n++;
            m++;
        }
        if (a[m] == '\0') {
            int m, 
                n;
            for (m = 0; replacement[m] != '\0'; m++, n++) {
                b[i+m] = replacement[m];
            }
            for (n = i+m; b[n] != '\0'; n++, n++) {
                b[n] = b[n];
            }
            b[m] = '\0';
            i += m - 1;
        }
    }
}
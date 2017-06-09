/*
 * heap-exploration.c
 */


 #include <stdio.h>
 #include <stdlib.h>
 #include <string.h>

 int main(int argc, char *argv[])
 {
    char *s;
    s = malloc(24);
    printf("1 address is %p\n", s);

    char *f;
    f = malloc(10);
    printf("10 address is %p\n", f);

    // char *b;
    // b = malloc(500);
    // printf("500 address is %p\n", b);


     free(s);
     free(f);
     //free(b);
 }

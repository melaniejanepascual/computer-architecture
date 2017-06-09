/*
 * stack-overflow.c
 */

#include <stdio.h>

int angry (int s);
int happy (int b);

int main(int argc, char *argv[])
{
    //angry(0);
    happy(0);

}

int angry(int s) {
    int count = s;
    count = count + 1;
    printf("angry is %d\n", count);
    angry(count);
}

int happy(int b) {
    int count = b;
    int sleep = 50;
    count = count + 1;
    printf("happy is %d\n", count);
    happy(count);
}

/*
 * buffer-overflow.c
 */

#include <stdio.h>
#include <string.h>

void vul();
int nice();

int main(int argc, char *argv[])
{
  vul(5);
}

  void vul(int siz) {
    char buffer[siz];
    char *seankingston;

      for(int i=0; i<50; i++) {
        buffer[i] = i;
      }

    //copy address into array
    memcpy(*seankingston, "seankingston %p\n", siz);
  }

  int nice() {

  }

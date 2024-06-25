#include<stdio.h>
int main()
{
    int idade;
    printf("Digite sua idade:");
    scanf("%d",&idade);
    puts("");
    idade=idade*2;
    printf("O dobro de sua idade é: %d",idade);
}
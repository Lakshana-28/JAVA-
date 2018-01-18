#include<stdio.h>
int main(void)
{
 long int temp,rem=0,sum=0,n;
  for(n=0;n<=9999;n++){
  temp=n;
  while(temp!=0)
  {
    rem=temp%10;
    sum=sum+rem;
    temp=temp/10;
  }
  if(sum==8)
  {
    printf("\n");
  }
  else{
  printf("\n%d",n);
}
sum=0;
}
}


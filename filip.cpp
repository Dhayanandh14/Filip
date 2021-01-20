#include <iostream>  
using namespace std;  
int main()  
{  
int a,b, reverse=0, rem,rem2,reverse2=0;    
cin>>a;    
cin>>b;
  while(a!=0)    
  {    
     rem=a%10;      
     reverse=reverse*10+rem;    
     a/=10;    
  }    
   while(b!=0)    
  {    
     rem2=b%10;      
     reverse2=reverse2*10+rem2;    
     b/=10;    
  }  
 if(reverse>reverse2){
   cout<<reverse;
 }
 else{
   cout<<reverse2;
 }
}
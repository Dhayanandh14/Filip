import java.util.*;

class Filip {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    int a,b,reversed1=0,reversed2=0;
    a=kbd.nextInt();
    b=kbd.nextInt();
      while(a != 0) {
            int digit = a % 10;
            reversed1 = reversed1 * 10 + digit;
            a/= 10;
        }
      while(b != 0) {
        int digit = b % 10;
        reversed2 = reversed2 * 10 + digit;
        b/= 10;
        }         
        if(reversed1>reversed2){
          System.out.print(reversed1);  
        }
        else{
           System.out.print(reversed2); 
        }
  }
}

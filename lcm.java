import java .util.*;
class lcm{
    public static void main(String[] args) {
        int a=56,b=54;
        lcm(a,b);
        gcd(a,b);
        int gcd=gcd(a,b);
        System.out.println("hcf="+a);
        int lcm=lcm(a,b);
        System.out.println("lcm="+lcm);
    }
    public static int  lcm(int a,int b){
      int lcm = ( a*b)/gcd(a,b);
       return lcm;

    }
    public static int gcd(int a, int b){
         
        while(b!=0){
           int temp=b;
           b=a % b;
          
           a=temp;
        }
        return a;
}
}

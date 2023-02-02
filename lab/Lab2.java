package lab;

import java.util.*;
class Lab2{
    public static void main(String[] args) {
        int a,b,c;
        double d,r,r1,r2,p,q,z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The coefficient of x*x:");
        a=sc.nextInt();
        System.out.print("Enter The coefficient of x:");
        b=sc.nextInt();
        System.out.print("Enter The constant term:");
        c=sc.nextInt();
        d=(b*b)-(4*a*c);
        if (d==0){
            r=-(b/(2*a));
            System.out.println("The root are real and equal - root is"+r);
        }
        else if (d>0){
            p = -(b/(2*a));
            q=(Math.sqrt(d)/(2*a));
            r1=p+q;
            r2=p-q;
            System.out.println("Roots are REAL and DISTINCT \n The roots are :"+r1 + "and " + r2);
        }
        else{
            System.out.println("Roots are Imaginary \n  Firts root : ");
            
        }
    }
}
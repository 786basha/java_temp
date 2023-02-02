package lab;
import java.util.*;
import java.io.*;
class Lab18
{
public static void main(String args[ ])throws Exception
{
String s;
Scanner sc= new Scanner(System.in);
System.out.print("\n\n\t ENTER THE FILE NAME .... ");
s=sc.next( );
File f1=new File(s);
if(f1.exists( ))
{
System.out.print("\n\n\t FILE EXISTS");
}
else
{
System.out.print("\n\n\t FILE DOES NOT EXIST");
}
if(f1.canRead( ))
{
System.out.print("\n\n\t FILE IS READABLE");
}else
{
System.out.print("\n\n\tFILE IS NOT READABLE");
}
if(f1.canWrite( ))
{
System.out.print("\n\n\t FILE IS WRITEABLE");
}
else
{
System.out.print("\n\n\t FILE IS NOT WRITABLE");
}
System.out.print("\n\n\t THE LENGTH OF THE FILE IS .... "+f1.length( ));
}
}
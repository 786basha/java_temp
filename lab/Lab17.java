package lab;
import java.io.*;
import java.util.*;
class Split
{
public static void main(String args[])throws Exception
{
String f,s;
Scanner sc=new Scanner(System.in);
System.out.print("\n\n\t ENTER THE FILE NAME ... ");
f=sc.next();
BufferedReader br1 = new BufferedReader(new FileReader(f));
int lc=0;
System.out.print("\n\n\t THE CONTENTS OF THE FILE ARE .. ");
while((s=br1.readLine())!=null)
{
System.out.print("\n\n\t"+s);
System.out.print("\n");
lc++;
}
System.out.println("\n\n\t NUMBER OF LINES IN THE FILE IS ... " + lc);
int nof;
System.out.print("\n\n\t ENTER THE NUMBER OF FILES ... ");nof=sc.nextInt();
System.out.println("\n\n\tNUMBER OF FILES TO BE GENERATED IS..."+nof);
br1.close( );
BufferedReader br2= new BufferedReader(new FileReader(f));
String sl;
int p=lc/nof;
for (int j=1;j<=nof;j++)
{
FileWriter fw = new FileWriter("F:/File"+j+".txt");
BufferedWriter bw = new BufferedWriter(fw);
for (int i=1;i<=p;i++)
{
sl = br2.readLine();
if (sl!= null)
{
bw.write(sl);
if(i!=p)
{
bw.newLine();
}
}
}
bw.close();
}
System.out.print("\n\n\t THE CONTENTS OF FILE-1 ARE...\n");
BufferedReader br3=new BufferedReader(new FileReader("F:/File1.txt"));
while((s=br3.readLine())!=null){
System.out.print("\n\n\t"+s);
System.out.print("\n");
}
System.out.print("\n\n\t THE CONTENTS OF FILE-2 ARE...\n");
BufferedReader br4=new BufferedReader(new FileReader("F:/File2.txt"));
while((s=br4.readLine())!=null)
{
System.out.print("\n\n\t"+s);
System.out.print("\n");
}
}
}
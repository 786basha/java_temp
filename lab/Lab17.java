package lab;
import java.io.*;
import java.util.*;

public class Lab17 {
    public static void main(String[] args) throws Exception
    {
        String f,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The file name:");
        f=sc.next();
        BufferedReader br1 = new BufferedReader(new FileReader(f));
        int lc =0;
        System.out.println("The content of file are:");
        while ((s=br1.readLine())!= null)
        {
            System.out.println(""+s);
            lc++;
        }
        System.out.println("Number of lines in File : "+ lc);
        int nof;
        System.out.print("Enter the number of files:");
        nof = sc.nextInt();
        System.out.println("Number of files to be generatued is:"+nof);
        br1.close();
        BufferedReader br2 = new BufferedReader(new FileReader(f));
        String sl;
        int p=lc/nof;
        for (int j=1;j<=nof;j++){
            FileWriter fw = new FileWriter("F:/File"+j+".txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=1;i<=p;i++){
                s1=br2.readLine();
                if(s1 != null){
                    bw.write(sl);
                    if(i != p){
                        bw.newLine();
                    }
                }
            }
            bw.close();
        }
        System.out.println("");
    }
}

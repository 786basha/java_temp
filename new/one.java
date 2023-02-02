import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;

class one{
    public static void main(String args[])throws Exception
    {
        Date d=new Data();
        String s1 = d.toString();
        ServerSocket ss = new ServerSocket(1080);
        Socket s =ss.accept();
        PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()).true);
        out.println(s1);
        s.close();
        System.out.println(S);
    }
}
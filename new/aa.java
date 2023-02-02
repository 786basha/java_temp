import java.util.Scanner;

public class aa {
    int a,b,c;
    String x,y,z;
    void modd(){
        System.out.println("Successfull");
    }
    void run(){
        System.out.println("\t Program Starts hear...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        a = sc.nextInt();
        switch(a){
            case 1: System.out.println("First case ="+a);
                    run();
                    break;
            case 2: System.out.println("second case ="+a);
                    run();
                    break;
            default: System.out.println("Trying ti changing method");
                        modd();
                        break;
        }
    }
    public static void main(String[] args) {
        aa k = new aa();
        k.run();
    }

}

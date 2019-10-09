import java.util.Scanner;

public class Rogers_Collatz {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Input any positive integer");
        long a = s.nextLong();
        s.close();
        int x = 0;
        while(a != 1){
            if(a % 2 == 0){
                a = a/2;
                System.out.println(a);
                x++;
            }
            else{
                a = 3*a + 1;
                System.out.println(a);
                x++;
            }
        }
        System.out.println("1");
        System.out.println("Completed sequence in " + x + " steps");
    }
}

import java.util.Scanner;

public class Rogers_Prime {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Input an integer");
        int a = s.nextInt();
        int x = 2;
        if(a == 1){
            System.out.println(a + " is not prime");
        }
        while(a%x != 0){
            x++;
        }
        if(x == a){
            System.out.println(a + " is prime");
        }
        else{
            System.out.println(a + " is not prime");
        }
    }
}

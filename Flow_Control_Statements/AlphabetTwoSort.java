
import java.util.Scanner;

class AlphabetTwoSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character :");
        char a=sc.next().charAt(0);
        System.out.println("Enter a character :");
        char b=sc.next().charAt(0);

        if(a<=b)
            System.out.println(a+" "+b);
        else
            System.out.println(b+" "+a);
    }
}
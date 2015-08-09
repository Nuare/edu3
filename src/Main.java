import javax.swing.*;
import java.util.Scanner;

public class Main  {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter age ");
        int age = in.nextInt();
        System.out.println("____________________________________________________________________________________________________________");
        in.nextLine();
        System.out.println("Enter name");
        String name = in.nextLine();
        System.out.println("____________________________________________________________________________________________________________");

        System.out.println("Enter movement direction:\n" + "0) Left\n" + "1) Right\n" + "2) Forward\n" + "3) Backward");

        int side = in.nextInt();

        System.out.println("____________________________________________________________________________________________________________");

        Human u1 = new Human();

        u1.getName();
        System.out.println(age);
        u1.getAge();
        System.out.println(name);
        u1.move(side);
        System.out.println();

    }



}

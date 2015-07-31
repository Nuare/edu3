import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Enter age ");
        int age = in.nextInt();
        System.out.println("____________________________________________________________________________________________________________");
        in.nextLine();
        System.out.println("Enter name");
        String name = in.nextLine();
        System.out.println("____________________________________________________________________________________________________________");

        while (true) {
            System.out.println("Enter movement direction:\n" + "0) Left\n" + "1) Right\n" + "2) Forward\n" + "3) Backward");

            int mv = in.nextInt();

            String side;
            switch (mv) {
                case 0:
                    side = "Left";
                    break;
                case 1:
                    side = "Right";
                    break;
                case 2:
                    side = "Forward";
                    break;
                case 3:
                    side = "Backward";
                    break;
                default:
                    side = "\n\nYou can still choose right direction\n";

                    if(mv>3){
                        System.out.println("lol");
                    }

            }

            System.out.println("____________________________________________________________________________________________________________");
        Human u1 = new Human(age, name, side);
        }

    }

}

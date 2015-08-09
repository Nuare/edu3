/**
 * Created by asdf on 31.07.2015.
 */
public class Human {
    private int age;
    private String name;
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSide() {
        return side;
    }


    public void  move(int side) {

        if (side == 0)

          System.out.println("Left");

        else if (side == 1)
            System.out.println("Right");
        else if (side == 2)
            System.out.println("Forward");
        else if (side == 3)
            System.out.println("Backward");
        else if (side > 3)

        {
           System.out.println(" thinking about direction ");
        }
        return ;

    }
}
import java.util.Scanner;

public class Foot {

    public Footshape footshape = new Footshape();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle : ");
        int input = in.nextInt();
        Foot f = new Foot();
        f.draw(input);
    }

    public void draw(int input){
        switch(input) {
            case 1:
                footshape.drawAsEclipse();
                break;
            case 2:
                footshape.drawAsRectangle();
                break;
        }
    }
}

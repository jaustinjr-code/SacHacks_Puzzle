import pkg.*;

public class Main {
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(10,10,10,10);
        r.draw();

        Picture p = new Picture("shark.png");
        p.draw();
    }
}

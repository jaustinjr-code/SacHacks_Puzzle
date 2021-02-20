import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageLoad l = new ImageLoad("shark.png");
        JFrame jp1 = new JFrame();
        jp1.getContentPane().add(l, BorderLayout.CENTER);
        jp1.setSize(new Dimension(900,900));
        System.out.println("Before");
        jp1.setVisible(true);
        System.out.println("After");

    }
}

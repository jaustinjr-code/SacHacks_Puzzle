import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Canvas {

//    private BufferedImage image;
        public JFrame jp1;
    public Canvas()
    {
        ImageLoad l = new ImageLoad("shark.png");
        jp1 = new JFrame();
        jp1.getContentPane().add(l, BorderLayout.CENTER);
        jp1.setSize(new Dimension(900,900));
        System.out.println("Before");
        jp1.setVisible(true);
        System.out.println("After");
//        image = l.getBufferedImage();
    }

//    public void paint(Graphics g)
//    {
//        Graphics2D g2 = (Graphics2D)g;
//        //image = getImage("shark.png");
//        Rectangle rect = new Rectangle(25,300,110,110);
//        g2.drawImage(image.getSubimage(30,30,100,100), 25, 300, null);
//        g2.draw(rect);
//    }
}

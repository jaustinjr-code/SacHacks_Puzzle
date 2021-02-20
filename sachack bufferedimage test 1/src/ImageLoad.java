import javax.imageio.ImageIO;
import java.applet.Applet;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageLoad extends Applet {

    private BufferedImage image;

    public ImageLoad(String fileName)
    {
        image = getImage(fileName);
    }

//    public void paint(Graphics g)
//    {
//        Graphics2D g2 = (Graphics2D)g;
//        //image = getImage("shark.png");
//        Rectangle rect = new Rectangle(25,300,110,110);
//        g2.drawImage(image.getSubimage(30,30,100,100), 25, 300, null);
//        g2.draw(rect);
//    }

    public BufferedImage getImage(String fileName)
    {
        BufferedImage img = null;
        try{
            img = ImageIO.read(new File(fileName));
        } catch (IOException e){
            System.out.println("File not found");
        }
        return img;
    }

    public BufferedImage getBufferedImage()
    {
        return image;
    }


}

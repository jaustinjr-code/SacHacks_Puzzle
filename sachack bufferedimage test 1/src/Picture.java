import java.lang.Object;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImageOp;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Picture {

    BufferedImage bigImg;
//https://stackoverflow.com/questions/14353302/displaying-image-in-java
    public Picture(String fileName) //throws IOException
    {
        try {
             bigImg = ImageIO.read(new File(fileName));
            ImageIcon icon=new ImageIcon(bigImg);
            JFrame frame=new JFrame();
            frame.setLayout(new FlowLayout());
            frame.setSize(200,300);
            JLabel lbl=new JLabel();
            lbl.setIcon(icon);
            frame.add(lbl);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        catch(IOException e){
            System.out.println("File not found");
        }
    }

}


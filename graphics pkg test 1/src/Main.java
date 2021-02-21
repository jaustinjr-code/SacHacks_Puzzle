import pkg.*;

public class Main //implements InputControl//, InputKeyControl
{
    public static void main(String[] args)
    {
//        Rectangle[][] grid = new Rectangle[3][3];
//        Puzzle p = new Puzzle(grid, 3, 3);
        MouseController mC = new MouseController(Canvas.getInstance(),  new Puzzle());
//        Puzzle p = new Puzzle(3,3);
//        Rectangle a = new Rectangle(50,50,100,100);
//        Rectangle b = new Rectangle(200,200,100,100);
//        a.setColor(Color.RED);
//        b.setColor(Color.BLUE);
//        System.out.println("A: " + a);
//        System.out.println("B: " + b);
//
//        a.fill();
//        b.fill();
//
//        Rectangle temp = a;
//        a = b;
//        b = temp;
//
////        Rectangle temp = new Rectangle(a);
////        a = new Rectangle(b);
////        b = new Rectangle(temp);
//        a.undraw();
//        b.undraw();
//        Color temp = a.getColor();
//        a.setColor(b.getColor());
//        b.setColor(temp);
////
//        a.fill();
//        b.fill();
//        System.out.println("NEW A: " + a);
//        System.out.println("NEW B: " + b);




//
//        for(int i = 0; i < grid.length; i++)
//        {
//            for(int j = 0; j < grid.length; j++)
//            {
//                grid[i][j] = new Rectangle((50*i+5*i+50), (50*j+5*j+50), 50, 50);
//                grid[i][j].setColor(new Color(i*j*60, 0, 0));
//                grid[i][j].fill();
//            }
//        }



//        Picture p = new Picture("shark.png");
//        p.draw();
    }

//    public void onMouseClick(double x, double y){
//
//    }

//    public void keyPress(String s)
//    {
//
//
//    }


}

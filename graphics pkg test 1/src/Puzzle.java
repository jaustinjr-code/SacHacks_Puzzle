import pkg.*;
import java.lang.Math;

public class Puzzle implements InputControl {

    private int xMouse, yMouse; //x,y coordinate of mouse.
    // Puzzle solution;  // 2d array solution.
    // Puzzle problem;   // 2d array problem
    private Rectangle[][] problem; // 2d array problem
    private Rectangle[][] solution; //  2d array solution.
    private Rectangle emptyRect; // empty rectangle object
    //int xEmpty, yEmpty; // index values for empty rectangle

    public Puzzle() {
        this.problem = new Rectangle[3][3]; // [[1, 2, 3], [4, 5, 6], [7, 8, 9]];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                problem[i][j] = new Rectangle((50*i+5*i+50), (50*j+5*j+50), 50, 50);
                problem[i][j].setColor(new Color(i*j*60, 0, 0));
                problem[i][j].fill();
                System.out.println(problem[i][j]);
            }
        }
        emptyRect = problem[2][2];
        //problem[2][2] = null;
//        xEmpty = 2;
//        yEmpty = 2;

    }

    /**
     Produces a Grid made out of a 2D Array.
     */
    public Puzzle(Rectangle[][] r, int xDim, int yDim) {
        this.problem = new Rectangle[xDim][yDim]; // [[1, 2, 3], [4, 5, 6], [7, 8, 9]];
        for(int i = 0; i < r.length; i++)
        {
            for(int j = 0; j < r[i].length; j++)
            {
                problem[i][j] = new Rectangle((50*i+5*i+50), (50*j+5*j+50), 50, 50);
                problem[i][j].setColor(new Color(i*j*60, 0, 0));
                problem[i][j].fill();
            }
        }
        emptyRect = new Rectangle(problem[2][2]);
//        xEmpty = 2;
//        yEmpty = 2;
    }

    /**
     Return true if Rectangle can move into empty spot.
     False if it cannot.
     */
    public boolean aware(Rectangle problem, int x, int y){
        if(Math.abs(x - getEmptyRectX()) == 1 && Math.abs(y - getEmptyRectY()) == 0)
        {
            return true;
        }
        else if(Math.abs(x - getEmptyRectX()) == 0 && Math.abs(y - getEmptyRectY()) == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void onMouseClick(double x, double y)
    {
        xMouse = (int)x;
        yMouse = ((int)y - 30);
        System.out.println("X: " + xMouse + "; Y: " + yMouse);
        Rectangle temp = clickedSquare();
        System.out.println(temp);
        if(!(temp.equals(emptyRect)))
        {
            if(aware(temp, getRectangleX(temp), getRectangleY(temp)))
            {
                System.out.println("True");
                // method 1 swapping index of rectangle object
                int row = getRectangleX(temp);
                int col = getRectangleY(temp);
//                //problem[row][col]
                problem[row][col] = problem[getEmptyRectX()][getEmptyRectY()];  //becomes new empty.
                problem[getEmptyRectX()][getEmptyRectY()] = temp;   ///becomes color
                problem[row][col].setColor(problem[row][col].getColor()); //iffy
                problem[getEmptyRectX()][getEmptyRectY()].setColor(problem[getEmptyRectX()][getEmptyRectY()].getColor());

                // method 2 swapping rectangle objects
//                Rectangle move = problem[getRectangleX(temp)][getRectangleY(temp)];
//                problem[getRectangleX(temp)][getRectangleY(temp)] = problem[getEmptyRectX()][getEmptyRectY()];
//                problem[getEmptyRectX()][getEmptyRectY()] = move;
            }
        }
    }

    /**
     Returns the Rectangle that the mouse clicked.
     Returns null if the mouse did not click a Rectangle.
     */
    public Rectangle clickedSquare()
    {
        Rectangle clickedSquare;
        int rIndex = -1;
        int cIndex = -1;

        for(int r = 0; r < problem.length; r++)
        {
            for(int c = 0; c < problem[0].length; c++)
            {
                if(problem[r][c].contains(xMouse,yMouse))
                {
                    rIndex = r;
                    cIndex = c;
                    System.out.println("rIndex: " + rIndex + "; cIndex: " + cIndex);
                }
            }
        }
        if( (rIndex == -1) || (cIndex == -1) )
        {
            return null;
        }
        else
        {
            clickedSquare = new Rectangle(problem[rIndex][cIndex]);
            return clickedSquare;
        }
    }

    /**
     Returns the xCoordinate of the Mouse Click.
     */
    public int getMouseX()
    {
        return xMouse;
    }

    /**
     Returns the yCoordinate of the MouseClick.
     */
    public int getMouseY()
    {
        return yMouse;
    }

    /**
     Return X row of empty rect in puzzle.
     */
    public int getEmptyRectX()
    {
        return getRectangleX(emptyRect);
    }

    /**
     Return Y index of empty problem
     */
    public int getEmptyRectY()
    {
        return getRectangleY(emptyRect);
    }

    /**
     Return X index of Rectangle r.
     */
    public int getRectangleX(Rectangle r)
    {
        for(int row = 0; row < problem.length; row++)
        {
            for(int col = 0; col < problem.length; col++)
            {
                if(r.equals(problem[row][col])){
                    return row;
                }
            }
        }
        return -1;
    }

    /**
     Return Y index of Rectangle r.
     */
    public int getRectangleY(Rectangle r)
    {
        for(int row = 0; row < problem.length; row++)
        {
            for(int col = 0; col < problem.length; col++)
            {
                if(r.equals(problem[row][col]))
                {
                    return col;
                }
            }
        }
        return -1;
    }
}

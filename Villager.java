import java.awt.*;

public class Villager 
{
    protected static int pixelHeight;
    protected static int xPos;
    protected static int yPos;

    public Villager(int x, int y, int p)
    {
        xPos = x;
        yPos = y;
        pixelHeight = p;
    }

        

    public void drawVillager(Graphics g)
    {
        
    }

    public int getPixelHeight()
    {
        return pixelHeight;
    }

    public int getXPos()
    {
        return xPos;
    }

    public int getYPos()
    {
        return yPos;
    }

    public void drawPixels(int x, int y, int width, int height, Color c, Graphics g)
    {
        g.setColor(c);
        g.fillRect(x, y, width, height);
    }

}

public class Point
{
    private int x;
    private int y;
    public Point()
    {
        x = 0;
        y = 0;
    }
    public Point(int userX, int userY)
    {
        x = userX;
        y = userY;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void changeX(int changeX)
    {
        x = changeX;
    }
    public void changeY(int changeY)
    {
        y = changeY;
    }
    public int manhattanDistance(int PointX, int PointY, int PointX2, int PointY2)
    {
        int distance = Math.abs(PointX-PointY) + Math.abs(PointX2-PointY2);
        return distance;
    }
    public boolean isCollinear(Point p1, Point p2)
    {
        
    }

}

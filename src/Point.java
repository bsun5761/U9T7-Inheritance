public class Point {
    private int x;
    private int y;
    private String label;
    public Point(String label, int x, int y)
    {
        this.y=y;
        this.x=x;
        this.label=label;
    }
    @Override
    public String toString()
    {
        return "Point: "+ label+ " is at X= "+ " and Y= " +y;
    }
    @Override
    public boolean equals(Object i)
    {
        if(i==null || !(i instanceof Point))
        {
            return false;
        }
        Point b = (Point) i;
return (this.x==b.x)&&(this.y==b.y);
    }

}

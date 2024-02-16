/**
 * This class provides a simple Circle type that
 * creates and tracks instances of circles.
 *
 * @author (You & Me)
 * @version (2019-10-15)
 */
public class Circle
{
    //instance variables
    private Point location;
    private double radius;

    /**
     * Default constructor that initializes an instance of Circle
     * to (0,0) with a radius of 1.0.
     */
    public Circle()
    {
        setLocation(new Point());
        setRadius(1.0);
    }

    /**
     * Constructor that initializes an instance of Circle to (0,0)
     * with a radius given by the parameter radius.
     *
     * @param radius the radius of this circle.
     */
    public Circle(double radius)
    {
        setLocation(new Point());
        setRadius(radius);
    }

    /**
     * Constructor that initializes an instance of Circle to (x,y)
     * with a radius given by the parameter radius.
     *
     * @param location the location of the center of this circle
     * @param radius the radius of this circle.
     */
    public Circle(Point location, double radius)
    {
        setLocation(location);
        setRadius(radius);
    }

    //accessors
    /**
     * Returns the radius of this circle.
     *
     * @return The radius of this circle.
     */
    public double getRadius()
    {
        return radius;
    }

    /**
     * Returns an instance of a Point indicating the location of this circle.
     *
     * @return The location of this circle.
     */
    public Point getLocation()
    {
        return new Point(location);
    }

    // mutator methods
    /**
     * Sets the radius of this circle.
     *
     * @param radius The new radius of this circle.
     */
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    /**
     * Sets the location of this circle.
     *
     * @param location The new location this circle.
     */
    public void setLocation(Point location)
    {
        this.location = new Point(location);
    }

    // other methods
    /**
     * Returns true if the point is in the circle; otherwise false. A point
     * falling on the circle is considered inside the circle.
     *
     * @return true if the point is in the circle; otherwise false
     */
    public boolean contains(Point p)
    {
        double x1 = p.getX();
        double y1 = p.getY();
        double x2 = location.getX();
        double y2 = location.getY();
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        return (distance <= radius);
    }

    /**
     * Returns true if the Circle aCircle intersects with this circle;
     * otherwise false.
     *
     * @param aCircle a circle.
     */
    public boolean intersects(Circle aCircle)
    {
        double x1 = aCircle.getLocation().getX();
        double y1 = aCircle.getLocation().getY();
        double r1 = aCircle.getRadius();
        double x2 = location.getX();
        double y2 = location.getY();
        double r2 = radius;
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        return (distance < (r1 + r2));
    }

    /**
     * Returns a string representation of this circle.
     *
     * @return a string representation of this circle.
     */
    public String toString()
    {
        return "Circle/loc="+location+",radius="+radius;
    }
}

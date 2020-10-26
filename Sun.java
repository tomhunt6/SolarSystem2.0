public class Sun extends SpaceObject
{
    private double xPosition;
    private double yPosition;

    public Sun(String colour, double diameter, double x, double y)
    {
        super(colour, diameter);
        xPosition=x;
        yPosition=y;

    }

    public String returnColour()
    {
        return colour;
    }

    public double returnDiameter()
    {
        return diameter;
    }

    public double returnXPosition()
    {
        return xPosition;
    }

    public double returnYPosition()
    {
        return yPosition;
    }
}
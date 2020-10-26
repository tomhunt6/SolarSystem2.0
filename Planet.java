public class Planet extends OrbitingSpaceObject
{
    private double distanceFromSun;
    private double angleFromSun;
    private Sun sun;

    public Planet(String colour, double diameter, double speed, double distanceFromSun, double angleFromSun)
    {
        super(colour, diameter, speed);
        this.distanceFromSun=distanceFromSun;
        this.angleFromSun=angleFromSun;
    }

    public void updatePosition()
    {
        angleFromSun = angleFromSun + speed;
    } 

    public String returnColour()
    {
        return colour;
    }

    public double returnDiameter()
    {
        return diameter;
    }

    public double returnSpeed()
    {
        return speed;
    }

    public double returnDistanceFromSun()
    {
        return distanceFromSun;
    }

    public double returnAngleFromSun()
    {
        return angleFromSun;
    }

}
public class Planet extends OrbitingSpaceObject
{
    private double distanceFromSun;
    private double angleFromSun;
    private Sun sun;

    public Planet(String colour, double diameter, double speed, double distanceFromSun, double angleFromSun, Sun sun)
    {
        super(colour, diameter, speed);
        this.distanceFromSun=distanceFromSun;
        this.angleFromSun=angleFromSun;
        this.sun=sun;
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

    public double returnSunX()
    {
        return sun.returnXPosition();
    }

    public double returnSunY()
    {
        return sun.returnYPosition();
    }
}
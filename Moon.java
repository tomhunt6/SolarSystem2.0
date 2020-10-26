public class Moon extends OrbitingSpaceObject
{
    private double distanceFromPlanet;
    private double angleFromPlanet;
    private Planet p;

    public Moon(String colour, double diameter, double speed, double distanceFromPlanet, double angleFromPlanet, Planet p)
    {
        super(colour, diameter, speed);
        this.distanceFromPlanet=distanceFromPlanet;
        this.angleFromPlanet=angleFromPlanet;
        this.p=p;
    }

    public void updatePosition()
    {
        angleFromPlanet = angleFromPlanet + speed;
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

    public double returnDistanceFromPlanet()
    {
        return distanceFromPlanet;
    }

    public double returnAngleFromPlanet()
    {
        return angleFromPlanet;
    }

    public double returnPlanetDistance()
    {
        return p.returnDistanceFromSun();
    }

    public double returnPlanetAngle()
    {
        return p.returnAngleFromSun();
    }
}
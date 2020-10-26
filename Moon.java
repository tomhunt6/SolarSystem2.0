/**
 * This class provides the basis of any moon used in the solar system model
 * @author Tom hunt
 */
public class Moon extends OrbitingSpaceObject
{
    private double distanceFromPlanet;
    private double angleFromPlanet;
    private Planet p;

    /**
	 * Creates a Moon 
     * This is a type of OrbitingSpaceObject that will orbit a planet <p>
     * This must be added to an instance of 'SolarSystem' using drawSolarObject() or drawSolarObjectAbout() <p>
     * and using the method finishedDrawing()</p>
	 *
	 * @param colour the colour of the moon. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. <p>Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
	 * @param diameter the diameter of the moon.
     * @param speed the speed of the moon.
     * @param distanceFromSun the distance the moon will be from its planet.
     * @param angleFromSun the angle of the moon to its planet.
	 */
    public Moon(String colour, double diameter, double speed, double distanceFromPlanet, double angleFromPlanet, Planet p)
    {
        super(colour, diameter, speed);
        this.distanceFromPlanet=distanceFromPlanet;
        this.angleFromPlanet=angleFromPlanet;
        this.p=p;
    }

    /**
	 * A method that changes the angle from the planet (using the speed) to 'move' the moon around the planet.
	 */
    public void updatePosition()
    {
        angleFromPlanet = angleFromPlanet + this.returnSpeed();
    }


    /**
	 * A method that returns the moon's distance from its planet.
	 */
    public double returnDistanceFromPlanet()
    {
        return distanceFromPlanet;
    }

    /**
	 * A method that returns the moon's angle from its planet.
	 */
    public double returnAngleFromPlanet()
    {
        return angleFromPlanet;
    }


    /**
	 * A method that returns the planet's (that the moon orbits) distance from the sun
	 */
    public double returnPlanetDistance()
    {
        return p.returnDistanceFromSun();
    }

    /**
	 * A method that returns the planet's (that the moon orbits) angle from the sun
	 */
    public double returnPlanetAngle()
    {
        return p.returnAngleFromSun();
    }
}
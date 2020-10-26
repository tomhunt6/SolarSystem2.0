/**
 * This class provides the basis of any planet used in the solar system model
 * @author Tom hunt
 */
public class Planet extends OrbitingSpaceObject
{
    private double distanceFromSun;
    private double angleFromSun;
    private Sun sun;

    /**
	 * Creates a Planet 
     * This is a type of OrbitingSpaceObject that will orbit a sun <p>
     * This must be added to an instance of 'SolarSystem' using drawSolarObject() or drawSolarObjectAbout() <p>
     * and using the method finishedDrawing()</p>
	 *
	 * @param colour the colour of the planet. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. <p>Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
	 * @param diameter the diameter of the Planet.
     * @param speed the speed of the Planet.
     * @param distanceFromSun the distance the planet will be from the sun.
     * @param angleFromSun the angle of the planet from the sun.
	 */
    public Planet(String colour, double diameter, double speed, double distanceFromSun, double angleFromSun)
    {
        super(colour, diameter, speed);
        this.distanceFromSun=distanceFromSun;
        this.angleFromSun=angleFromSun;
    }

    /**
	 * A method that changes the angle from the sun (using the speed) to 'move' the planet around the sun
	 */
    public void updatePosition()
    {
        angleFromSun = angleFromSun + this.returnSpeed();
    } 

    /**
	 * A method that returns the planet's distance from the sun
	 */
    public double returnDistanceFromSun()
    {
        return distanceFromSun;
    }

    /**
	 * A method that returns the planet's angle from the sun
	 */
    public double returnAngleFromSun()
    {
        return angleFromSun;
    }

}
/**
 * This class provides the basis of any orbiting space object used in the solar system model
 * @author Tom hunt
 */
public abstract class OrbitingSpaceObject extends SpaceObject
{
    private double speed; 

    /**
	 * Creates an OrbitingSpaceObjcet <p>
     * This is a type of SpaceObject that will orbit another object <p>
     * This must be added to an instance of 'SolarSystem' using drawSolarObject() or drawSolarObjectAbout() <p>
     * and using the method finishedDrawing()</p>
	 *
	 * @param colour the colour of the OrbitingSpaceObject. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. <p>Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
	 * @param diameter the diameter of the OrbitingSpaceObject.
     * @param speed the speed of the OrbitingSpaceObject
	 */
    public OrbitingSpaceObject(String colour, double diameter, double speed)
    {
        super(colour, diameter);
        this.speed=speed;
    }

    /**
	 * A method that returns the speed of the OrbitingSpaceObject in the form of a double
	 */
    public double returnSpeed()
    {
        return speed;
    }
}
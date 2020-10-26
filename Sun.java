/**
 * This class provides the basis of the sun used in the solar system model
 * @author Tom hunt
 */
public class Sun extends SpaceObject
{
    private double xPosition;
    private double yPosition;

    /**
	 * Creates a Sun. <p>
     * This must be added to an instance of 'SolarSystem' using drawSolarObject()<p>
     * and using the method finishedDrawing()</p>
	 *
	 * @param colour the colour of the Sun. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. <p>Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
	 * @param diameter the diameter of the Sun.
     * @param x an X-coordinate that describes the location of the center of the sun
     * @param y an Y-coordinate that describes the location of the center of the sun
	 */
    public Sun(String colour, double diameter, double x, double y)
    {
        super(colour, diameter);
        xPosition=x;
        yPosition=y;

    }

    /**
	 * A method that returns the sun's X-coordinate.
	 */
    public double returnXPosition()
    {
        return xPosition;
    }

    /**
	 * A method that returns the sun's Y-coordinate.
	 */
    public double returnYPosition()
    {
        return yPosition;
    }
}
/**
 * This class provides the basis of any space object used in the solar system model
 * @author Tom hunt
 */
public abstract class SpaceObject
{
    private String colour;
    private double diameter;

    /**
	 * Creates a SpaceObjcet. <p>
     * This must be added to an instance of 'SolarSystem' using drawSolarObject() or drawSolarObjectAbout() <p>
     * and using the method finishedDrawing()</p>
	 *
	 * @param colour the colour of the SpaceObject. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	 * MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. <p>Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
	 * @param diameter the diameter of the SpaceObject.
	 */
    public SpaceObject(String colour, double diameter)
    {
        this.colour=colour;
        this.diameter=diameter;
    }

    /**
	 * A method that returns the colour of the SpaceObject in the form of a string
	 */
    public String returnColour()
    {
        return colour;
    }

    /**
	 * A method that returns the diameter of the SpaceObject in the form of a double
	 */
    public double returnDiameter()
    {
        return diameter;
    }

}
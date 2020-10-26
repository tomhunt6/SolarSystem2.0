public abstract class OrbitingSpaceObject extends SpaceObject
{
    double speed; 

    public OrbitingSpaceObject(String colour, double diameter, double speed)
    {
        super(colour, diameter);
        this.speed=speed;
    }
}
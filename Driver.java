public class Driver
{
    
    public static void main(String[] args)
    {
        SolarSystem ss = new SolarSystem(1000,1000);

        Sun sun = new Sun("YELLOW", 50, 0, 0);

        Planet[] planets = new Planet[8];

        planets[0] = new Planet("#DBDBDB", 6, 4, 55, 180, sun);             //Mercury
        planets[1] = new Planet("#DBDBDB", 8, 3.5, 70, 180, sun);           //Venus
        planets[2] = new Planet("#1A85FF", 10, 3, 100, 180, sun);           //Earth
        planets[3] = new Planet("#C1440E", 7, 2.5, 145, 180, sun);          //Mars
        planets[4] = new Planet("#FFCB78", 30, 2, 200, 180, sun);           //Jupiter
        planets[5] = new Planet("#EDA353", 28, 1.5, 280, 180, sun);         //Saturn
        planets[6] = new Planet("#8594A3", 14, 1, 325, 180, sun);           //Uranus
        planets[7] = new Planet("#1C70C8", 14, 0.5, 370, 180, sun);         //Neptune


        while(true)
        {
            ss.drawSolarObject(sun.returnXPosition(), sun.returnYPosition(), sun.returnDiameter(), sun.returnColour());
            
            for(int i=0; i<8; i++)
            {
                ss.drawSolarObjectAbout(planets[i].returnDistanceFromSun(),planets[i].returnAngleFromSun(),planets[i].returnDiameter(),planets[i].returnColour(), planets[i].returnSunX(),planets[i].returnSunY());
            }
            
            ss.finishedDrawing();

            for(int i=0; i<8; i++)
            {
                planets[i].updatePosition(); 
            }
        }
    }

}
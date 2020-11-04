/**
 * This class is the main method for running the model solar system
 * @author Tom hunt
 */
public class Driver
{
    public static void main(String[] args)
    {

        SolarSystem ss = new SolarSystem(1000,1000);

        Sun sun = new Sun("YELLOW", 50, 0, 0);

        Planet[] planets = new Planet[8];

        planets[0] = new Planet("#DBDBDB", 6, 4, 55, 180);                                  //Mercury
        planets[1] = new Planet("#DBDBDB", 8, 3.5, 70, 180);                                //Venus
        planets[2] = new Planet("#1A85FF", 10, 3, 100, 180);                                //Earth
        planets[3] = new Planet("#C1440E", 7, 2.5, 145, 180);                               //Mars
        planets[4] = new Planet("#FFCB78", 30, 2, 200, 180);                                //Jupiter
        planets[5] = new Planet("#EDA353", 28, 1.5, 280, 180);                              //Saturn
        planets[6] = new Planet("#8594A3", 14, 1, 325, 180);                                //Uranus
        planets[7] = new Planet("#1C70C8", 14, 0.5, 370, 180);                              //Neptune

        Moon earthMoon = new Moon("WHITE", 3, 3, 10, 180, planets[2]);

        Moon[] marsMoons = new Moon[2];
        marsMoons[0] = new Moon("WHITE", 3, 2, 10, 180, planets[3]);
        marsMoons[1] = new Moon("WHITE", 3, 4, 15, 0, planets[3]);
 
        Moon[] jupiterMoons = new Moon[4];
        jupiterMoons[0] = new Moon("WHITE", 3, 2, 25, 180, planets[4]);
        jupiterMoons[1] = new Moon("WHITE", 3, 3, 35, 90, planets[4]);
        jupiterMoons[2] = new Moon("WHITE", 3, 4, 30, 270, planets[4]);
        jupiterMoons[3] = new Moon("WHITE", 3, 5, 20, 0, planets[4]);

        Moon[] saturnMoons = new Moon[4];
        saturnMoons[0] = new Moon("WHITE", 3, 2, 20, 180, planets[5]);
        saturnMoons[1] = new Moon("WHITE", 3, 3, 30, 90, planets[5]);
        saturnMoons[2] = new Moon("WHITE", 3, 4, 25, 270, planets[5]);
        saturnMoons[3] = new Moon("WHITE", 3, 5, 40, 0, planets[5]);

        Moon[] uranusMoons = new Moon[4];
        uranusMoons[0] = new Moon("WHITE", 3, 2, 30, 180, planets[6]);
        uranusMoons[1] = new Moon("WHITE", 3, 3, 25, 90, planets[6]);
        uranusMoons[2] = new Moon("WHITE", 3, 4, 20, 270, planets[6]);
        uranusMoons[3] = new Moon("WHITE", 3, 5, 10, 0, planets[6]);

        Moon[] neptuneMoons = new Moon[4];
        neptuneMoons[0] = new Moon("WHITE", 3, 2, 15, 180, planets[7]);
        neptuneMoons[1] = new Moon("WHITE", 3, 3, 25, 90, planets[7]);
        neptuneMoons[2] = new Moon("WHITE", 3, 4, 20, 270, planets[7]);
        neptuneMoons[3] = new Moon("WHITE", 3, 5, 30, 0, planets[7]);


        while(true)
        {
            ss.drawSolarObject(sun.returnXPosition(), sun.returnYPosition(), sun.returnDiameter(), sun.returnColour());
            
            //draws the planets and moons into the SolarSystem window
            for(int i=0; i<8; i++)
            {
                ss.drawSolarObject(planets[i].returnDistanceFromSun(),planets[i].returnAngleFromSun(),planets[i].returnDiameter(),planets[i].returnColour());

                if(i<1)
                {
                    ss.drawSolarObjectAbout(earthMoon.returnDistanceFromPlanet(), earthMoon.returnAngleFromPlanet(), earthMoon.returnDiameter(), earthMoon.returnColour(), earthMoon.returnPlanetDistance(), earthMoon.returnPlanetAngle()); 
                }

                if(i<2)
                {
                    ss.drawSolarObjectAbout(marsMoons[i].returnDistanceFromPlanet(), marsMoons[i].returnAngleFromPlanet(), marsMoons[i].returnDiameter(), marsMoons[i].returnColour(), marsMoons[i].returnPlanetDistance(), marsMoons[i].returnPlanetAngle());
                }

                if(i<4)
                {
                    ss.drawSolarObjectAbout(jupiterMoons[i].returnDistanceFromPlanet(), jupiterMoons[i].returnAngleFromPlanet(), jupiterMoons[i].returnDiameter(), jupiterMoons[i].returnColour(), jupiterMoons[i].returnPlanetDistance(), jupiterMoons[i].returnPlanetAngle());
                    ss.drawSolarObjectAbout(saturnMoons[i].returnDistanceFromPlanet(), saturnMoons[i].returnAngleFromPlanet(), saturnMoons[i].returnDiameter(), saturnMoons[i].returnColour(), saturnMoons[i].returnPlanetDistance(), saturnMoons[i].returnPlanetAngle());
                    ss.drawSolarObjectAbout(uranusMoons[i].returnDistanceFromPlanet(), uranusMoons[i].returnAngleFromPlanet(), uranusMoons[i].returnDiameter(), uranusMoons[i].returnColour(), uranusMoons[i].returnPlanetDistance(), uranusMoons[i].returnPlanetAngle());
                    ss.drawSolarObjectAbout(neptuneMoons[i].returnDistanceFromPlanet(), neptuneMoons[i].returnAngleFromPlanet(), neptuneMoons[i].returnDiameter(), neptuneMoons[i].returnColour(), neptuneMoons[i].returnPlanetDistance(), neptuneMoons[i].returnPlanetAngle());
                }
            }
            
            //updates the window of newly drawn objects
            ss.finishedDrawing();

            //Updates the position of each planet and its moons, using its respective use of updatePosition()
            for(int i=0; i<8; i++)
            {
                planets[i].updatePosition(); 

                if(i<1)
                {
                    earthMoon.updatePosition();
                }

                if(i<2)
                {
                    marsMoons[i].updatePosition();
                }

                if(i<4)
                {
                    jupiterMoons[i].updatePosition();
                    saturnMoons[i].updatePosition();
                    uranusMoons[i].updatePosition();
                    neptuneMoons[i].updatePosition();
                }
            }
        }
    }

}
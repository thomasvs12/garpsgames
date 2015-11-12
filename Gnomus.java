import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gnomus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gnomus extends Actor
{
     /**
     * Act - do whatever the Gnomus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        int random;
        move(5); //ga 5 pixels vooruit
        if (atWorldEdge()) { //Sta je aan de rand van de wereld
            move(-5); //Doe een stap terug
            if (Greenfoot.getRandomNumber(100) < 50) { //Welke kant op: rechts of links
                setRotation(getRotation() + Greenfoot.getRandomNumber(180));
            }
            else {
                setRotation(getRotation() - Greenfoot.getRandomNumber(180));
            }
        }
        else { //Als je niet aan de rand van de wereld bent
            random = Greenfoot.getRandomNumber(100); //getal tussen 0 en 100
            if (random < 2) { //2% kans naar rechts
                setRotation(getRotation() + Greenfoot.getRandomNumber(180));
            }
            if (random > 98) { //2% kans naar links
                setRotation(getRotation() - Greenfoot.getRandomNumber(180));
            }
        }
    }
    
    public boolean atWorldEdge() {
        int x, y, wx, wy, i, j; //declaratie van i toegevoegd voor de helft van breedte van de afbeelding
        x = getX();
        y = getY();
        i = getImage().getWidth() / 2; //Vraag de breedte van de afbeelding op en deel deze door twee
        j = getImage().getHeight() / 2; //Vraag de hoogte van de afbeelding op en deel deze door twee
        wx = getWorld().getWidth() - i;
        wy = getWorld().getHeight() - j;
        if(x <= i || y <= j || x >= wx || y >= wy) { //Aan de rand van de wereld
            return true;
        }
        return false;
    }
    
}
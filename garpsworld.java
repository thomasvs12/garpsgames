import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class garpsworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class garpsworld extends World
{
private GreenfootSound sound = new GreenfootSound("Zelda.mp3");
public void started()

{

 sound.playLoop();

}
public void stopped() 

 {

 sound.stop();

 }
    /**
     * Constructor for objects of class garpsworld.
     * 
     */
    public garpsworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        addObject(new garp(), 350, 250);
        setPaintOrder(garp.class, Gnomus.class, diamond.class, bom.class, rock.class);
        addObject(new Gnomus(), Greenfoot.getRandomNumber(670) + 15,      
Greenfoot.getRandomNumber(470) + 15);
addObject(new Gnomus(), Greenfoot.getRandomNumber(670) + 15,     
Greenfoot.getRandomNumber(470) + 15);
addObject(new Gnomus(), Greenfoot.getRandomNumber(670) + 15,      
Greenfoot.getRandomNumber(470) + 15);
for(int teller = 0; teller < 10; teller ++) {

addObject(new diamond(), Greenfoot.getRandomNumber(700), 

Greenfoot.getRandomNumber(500));

}
for(int teller = 0; teller < 6; teller ++) {

addObject(new rock(),Greenfoot.getRandomNumber(670) + 15,      
Greenfoot.getRandomNumber(470) + 15);
}
for(int teller = 0; teller < 6; teller ++) {

addObject(new bom(),Greenfoot.getRandomNumber(670) + 15,      
Greenfoot.getRandomNumber(470) + 15);
}
}
}

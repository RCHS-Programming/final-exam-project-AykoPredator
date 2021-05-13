import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackGround extends World
{

    /**
     * Constructor for objects of class BackGround.
     * 
     */
    public BackGround()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new Sheep(),50,300);
        addObject(new Wall(),50,400);
        addObject(new Wall(),100,400);
        addObject(new Wall(),50,200);
        addObject(new Wall(),100,200);
        addObject(new Wall(),100,100);
        addObject(new Wall(),100,50);
        addObject(new Wall(),100,500);
        addObject(new Wall(),100,550);
        addObject(new Wall(),550,600);
        addObject(new Wall(),350,600);
        addObject(new Barn(),762,27);
        for (int i = 0; i < 4; i++){
            addObject(new Wall(), 350, 50 +100*i);
        }
        for(int i = 0; i < 3; i++)
        {
            addObject( new Snake(), 225, 10 + 200*i);
        }
        for(int i = 0; i < 2; i++)
        {
            addObject( new Spider(), 450, 10 + 300*i);
        }
        for (int i = 0; i < 4; i++){
            addObject(new Wall(), 550, 50 +100*i);
        }
    }
}

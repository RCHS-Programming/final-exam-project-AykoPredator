import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends World
{
    /**
     * Constructor for objects of class World2.
     * 
     */
    public World2()
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
        addObject(new Wall(),300,0);
        addObject(new Wall(),500,600);
        addObject(new Wall(),680,0);
        addObject(new Barn2(),767,567);
        addObject( new Spider(9, 0, 767), 767, 10);
        for(int i = 0; i < 2; i++)
        {
            addObject( new Spider(-7, 600, 200), 200, 10 + 300*i);
        }
        for (int i = 0; i < 5; i++){
            addObject(new Wall(), 300, 200 +100*i);
        }
                for(int i = 0; i < 3; i++)
        {
            addObject( new Spider(5, 0, 400), 400, 10 + 200*i);
        }
        for (int i = 0; i < 5; i++){
            addObject(new Wall(), 500, 0 +100*i);
        }
        for (int i = 0; i < 5; i++){
            addObject(new Wall(), 680, 200 +100*i);
        }
                for(int i = 0; i < 3; i++)
        {
            addObject( new Spider(-5, 600, 590), 590, 10 + 200*i);
        }
    }
}

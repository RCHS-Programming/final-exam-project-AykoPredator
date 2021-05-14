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
    }
}

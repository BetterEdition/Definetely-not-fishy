/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fishgame;

/**
 *
 * @author Adam
 */
public class Fish extends WaterCreatureAbstract
{

    public Fish(int size, int speed, boolean orientation)
    {
        super(size, speed, orientation);
    }

    @Override
    public void move()
    {
        setLocation(getX() + speed, getY());
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fishgame;

public abstract class WaterCreatureAbstract extends Actor implements CreatureInterface
{

    protected int height;
    protected int length;
    protected boolean orientation;
    protected int size;
    protected int speed;

    public WaterCreatureAbstract(int size, int speed, boolean orientation)
    {
        this.speed = speed;
        this.size = size;
        this.orientation = orientation;
    }

    public int getHeight()
    {
        return height;
    }

    public int getLength()
    {
        return length;
    }

    protected int getSize()
    {
        return size;
    }

    protected int getSpeed()
    {
        return speed;
    }

    public boolean isOrientation()
    {
        return orientation;
    }

    protected void setOrientation(boolean orientation)
    {
        this.orientation = orientation;
    }

    @Override
    public void act()
    {
        if (checkLivingConditions())
        {
            move();
        } else
        {
            die();
        }
    }

    @Override
    public void changeOrientation()
    {
        setOrientation(!isOrientation());
    }

    @Override
    public void move()
    {
    }

    @Override
    public void die()
    {
        getWorld().removeObject(this);
    }

    private boolean checkLivingConditions()
    {

        if ((getX() + length / 2 >= getWorld().getWidth() || getX() - length / 2 <= 0) || (getY() + height / 2 >= getWorld().getHeight() || getY() - height / 2 <= getWorld().getBottom()))
        {
            return false;
        } else
        {
            return true;
        }
    }

}

package movepoint;

import java.util.Arrays;

public class Moveable  extends Point{
    private  float xspeed;
    private  float yspeed;

    public Moveable() {
    }

    public Moveable(float xspeed, float yspeed) {
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public Moveable(float x, float y, float xspeed, float yspeed) {
        super(x, y);
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public float getXspeed() {
        return xspeed;
    }

    public void setXspeed(float xspeed) {
        this.xspeed = xspeed;
    }

    public float getYspeed() {
        return yspeed;
    }

    public void setYspeed(float yspeed) {
        this.yspeed = yspeed;
    }
    public void setSpeed( float xspeed , float yspeed){
        this.xspeed=xspeed;
        this.yspeed=yspeed;
    }
    public Moveable move(){
       setX(getX()+getXspeed());
       setY(getY()+getYspeed());
         return this;
    }
    public String getSpeed(){
        float [] ar1= {getXspeed(), getYspeed()};
        String str1= Arrays.toString(ar1);
        return str1;
    }
    public String toString(){
        return super.toString()+" dich chuyen = "+ getSpeed();
    }
}

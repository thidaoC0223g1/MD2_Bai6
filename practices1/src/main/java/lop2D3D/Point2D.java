package lop2D3D;

import java.util.Arrays;

public class Point2D {
    private float x;
    private  float y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public String  getXY(){
        float [] ar1 = {getX(),getY()};
       String str= Arrays.toString(ar1);
       return str;
    }
    @Override
    public String toString(){
        return "toa do nhap vao la " +  getXY();
    }
}

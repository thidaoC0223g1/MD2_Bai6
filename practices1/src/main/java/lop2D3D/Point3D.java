package lop2D3D;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
      setX(x);
      setY(y);
      this.z=z;
    }
    public String getXZY(){
        float [] ar2= {getX(),getY(),getZ()};
        String str2= Arrays.toString(ar2);
        return str2;
    }
    @Override
    public String toString(){
        return " toa do 3 chieu nhap vao la " +getXZY();
    }
}

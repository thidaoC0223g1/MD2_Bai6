package cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea1(){
        return getPer()*height;
    }
    public double getVolume(){
        return getArea()*height;
    }
    public String toString(){
        return "hinh tru co chieu cao la"+getHeight()+"va dien tich la "+ getArea1()+" co the tich la "
                +getVolume()+"co mau la "+getColor();
    }
}

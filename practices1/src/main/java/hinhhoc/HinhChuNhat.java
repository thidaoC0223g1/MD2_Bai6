package hinhhoc;

public class HinhChuNhat extends HinhDang{
    private double width;
    private double height;
    public HinhChuNhat(){
        this.width=1.0;
        this.height=2.0;
    }

    public HinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public HinhChuNhat(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getPerimeter(){
        return (height+width)*2;
    }
    public  double getArea(){
        return height*width;
    }
@Override
    public String toString(){
        return "mot hinh chu nhat co chieu rong =" + getWidth()
                +" va chieu cao="+ getHeight()+" la "+ super.toString();

    }


}

package hinhhoc;

class HinhVuong extends HinhChuNhat {

    public HinhVuong(String color, boolean filled, double size) {

        super(color, filled, size, size);
    }

    public void setSize(double size) {
        setWidth(size);
        setHeight(size);
    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public void setHeight(double height) {
        setSize(height);
    }

    public double getSize() {

        return getHeight();
    }

    @Override
    public String toString() {
        return " Hinh vuong co canh la " + getSize() + " la " + super.toString();
    }

}

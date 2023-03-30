package hinhhoc;

public class HinhDang {
    private String color;
    private boolean filled;

    public HinhDang() {
        color = "green";
        filled = true;
    }

    public HinhDang(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Mot hinh voi mau la " + getColor() +" "+ (isFilled()? "duoc dien":"khong duoc dien");
    }}



package hinhhoc;
public class TestHinhChuNhat {
    public static void main(String[] args) {
        HinhChuNhat hcn1=new HinhChuNhat();
        System.out.println(hcn1);
        hcn1=new HinhChuNhat(4.5, 6.7);
        System.out.println(hcn1);
        hcn1= new HinhChuNhat("cyan",false,6.8, 9.0);
        System.out.println(hcn1);


    }
}

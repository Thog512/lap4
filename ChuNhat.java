
package lap4;
import java.util.Scanner;
public class ChuNhat {
    Scanner scan = new Scanner (System.in);
    public double rong;
    public double dai;
    
    public ChuNhat(double r, double d){
        rong = r;
        dai = d;
    }
    public double getchuvi(){
        return (dai + rong)*2;
    }
    public double getdientich(){
        return dai*rong;
    }
    public void Xuat(){
        System.out.println("Chieu rong hinh cn la: " +rong);
        System.out.println("Chieu dai hinh cn la: " +dai);
        System.out.println("Chu vi hinh cn la: " +getchuvi());
        System.out.println("Dien tich hinh cn la: " +getdientich());
    }
}
class Vuong extends ChuNhat{
        public Vuong(double c){
                super (c,c);
        }
        @Override
    public void Xuat(){
        System.out.println("Canh hinh vuong la: " +rong);
        System.out.println("Dien tich hinh cn la: " +getdientich());
        System.out.println("Chu vi hinh cn la: " +getchuvi());
    }
}
class main{
    public static void main(String[] args) {
        ChuNhat cn1 = new ChuNhat(4,5);
        ChuNhat cn2 = new ChuNhat(6,5);
        Vuong v1 = new Vuong(3);

        System.out.println("Hinh chu nhat 1:");
        cn1.Xuat();
        System.out.println();

        System.out.println("Hinh chu nhat 2:");
        cn2.Xuat();
        System.out.println();

        System.out.println("Hinh vuong:");
        v1.Xuat();
    }
}
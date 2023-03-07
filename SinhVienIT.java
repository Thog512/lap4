
package lap4;

public class SinhVienIT extends SinhVienPoly{
    public double diemJava;
    public double diemCss;
    public double diemHTML;
    
    public SinhVienIT(String HoTen, String Nganh, double diemJava, double diemCss, double diemHTML){
        super (HoTen,Nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHTML = diemHTML;
    }
    @Override
    public double getDiem()
    {
        return (2*diemJava + diemHTML +diemCss)/4;
    }
}

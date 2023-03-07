
package lap4;

public class SinhVienBiz extends SinhVienPoly{
    public double diemMarketing;
    public double diemSales;
    
    public SinhVienBiz(String HoTen, String Nganh, double diemMarketing, double diemSales){
        super (HoTen, Nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    @Override
    public double getDiem(){
        return (2*diemMarketing + diemSales)/3;
    }
    
}

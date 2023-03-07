package lap4;
public abstract class SinhVienPoly {
    public String HoTen;
    public String Nganh;
    
    public String getHoTen(){
        return HoTen;
    }
    public String getNganh(){
        return Nganh;
    }
    public SinhVienPoly(String hoten, String nganh){
        this.HoTen = hoten;
        this.Nganh = nganh;
    }
    public abstract double getDiem();
    
    public String getHocLuc(){
        double Diem = getDiem();
        if(Diem < 5){
            return "Yếu";
        }else if(Diem<=5 && Diem<6.5){
            return "Trung Bình";
        }else if(Diem<=6.5 && Diem<7.5){
            return "Khá";
        }else if(Diem<=7.5 && Diem<9){
            return "Giỏi";
        }else return "Xuất sắc";
    }
    public void Xuat(){
        System.out.println("Họ Tên: "+HoTen+ ",Nganh: "+Nganh+ ",Điểm: " +getDiem()+ ",Học lực: " +getHocLuc());
    } 
}

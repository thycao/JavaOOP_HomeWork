package thy.com.JavaOOP1;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nhanVien1=new NhanVien();
        System.out.println("ID: "+nhanVien1.getId());
        System.out.println("Ten Nhan Vien: "+nhanVien1.getName());
        System.out.println("So Dien Thoai: "+nhanVien1.getPhone());
        System.out.println("Email: "+nhanVien1.getEmail());
        System.out.println("Dia Chi: "+nhanVien1.getAddress());

    }
}

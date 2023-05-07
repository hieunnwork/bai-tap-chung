
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        ManagementDocument managementDocument = new ManagementDocument();
        while (isRunning) {
            try {
                System.out.println("Quan ly tai lieu");
                System.out.println("1. Nhap thong tin cho tai lieu");
                System.out.println("2. Xuat Thong tin toan bo tai lieu");
                System.out.println("3. Tim kiem thong tin theo nha xuat ban");
                System.out.println("Moi nhap: ");
                int input1 = scanner.nextInt();
                if (input1 < 1 || input1 > 3) {
                    System.out.println("Nhập sai");
                } else if (input1 == 1) {
                    System.out.println("1. nhập thông tin sách");
                    System.out.println("2. nhập thông tin tạp chí");
                    System.out.println("3. nhập thông tin báo");
                    System.out.println("Moi nhap: ");
                    int input2 = scanner.nextInt();
                    if (input2 < 1 || input2 > 3) {
                        System.out.println("Nhập sai");
                    } else if (input2 == 1) {
                        System.out.println("nhập thông tin sách");
                        System.out.println("nhập mã tài lieu: ");
                        Scanner scanner1 = new Scanner(System.in);
                        String maTaiLieu = scanner1.next();
                        System.out.println("nhập tên nhà xuất bản: ");
                        Scanner scanner2 = new Scanner(System.in);
                        String tenNhaXuatBan = scanner2.next();
                        System.out.println("nhập so bản phát hành: ");
                        Scanner scanner3 = new Scanner(System.in);
                        int soBanPhatHanh = scanner3.nextInt();
                        System.out.println("nhập tên tác giả: ");
                        Scanner scanner4 = new Scanner(System.in);
                        String tenTacGia = scanner4.next();
                        System.out.println("nhập số trang: ");
                        Scanner scanner5 = new Scanner(System.in);
                        int soTrang = scanner5.nextInt();
                        managementDocument.ImportBook(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang);
                    } else if (input2 == 2) {
                        System.out.println("nhập thông tin tạp chí");
                        System.out.println("nhập mã tài lieu: ");
                        Scanner scanner6 = new Scanner(System.in);
                        String maTaiLieuTc = scanner6.next();
                        System.out.println("nhập tên nhà xuất bản: ");
                        Scanner scanner7 = new Scanner(System.in);
                        String tenNhaXuatBanTc = scanner7.next();
                        System.out.println("nhập so bản phát hành: ");
                        Scanner scanner8 = new Scanner(System.in);
                        int soBanPhatHanhTc = scanner8.nextInt();
                        System.out.println("nhập số phát hành: ");
                        Scanner scanner9 = new Scanner(System.in);
                        int soPhatHanh = scanner9.nextInt();
                        System.out.println("nhập tháng phát hành (mm/yy)");
                        Scanner scanner10 = new Scanner(System.in);
                        int thangPhatHanh = scanner10.nextInt();
                        managementDocument.ImportMagazine(maTaiLieuTc, tenNhaXuatBanTc, soBanPhatHanhTc, soPhatHanh, thangPhatHanh);
                    } else if (input2 == 3) {
                        System.out.println("nhập thông tin báo");
                        System.out.println("nhập mã tài lieu: ");
                        Scanner scanner11 = new Scanner(System.in);
                        String maTaiLieuB = scanner11.next();
                        System.out.println("nhập tên nhà xuất bản: ");
                        Scanner scanner12 = new Scanner(System.in);
                        String tenNhaXuatBanB = scanner12.next();
                        System.out.println("nhập so bản phát hành: ");
                        Scanner scanner13 = new Scanner(System.in);
                        int soBanPhatHanhB = scanner13.nextInt();
                        System.out.println("nhập ngày phát hành (dd/mm/yy): ");
                        Scanner scanner14 = new Scanner(System.in);
                        int ngayPhatHanh = scanner14.nextInt();
                        managementDocument.ImportNewspaper(maTaiLieuB, tenNhaXuatBanB, soBanPhatHanhB, ngayPhatHanh);
                    }
                } else if (input1==2) {
                    managementDocument.ShowBookInformation();
                    managementDocument.ShowMagazineInformation();
                    managementDocument.ShowNewsletterInformation();
                }
                else if (input1 == 3) {
                    System.out.println("Nhập thông tin nhà xuất bản cần tìm kiếm");
                    String keyWord = scanner.next();
                    managementDocument.searchDocument(keyWord);

                }

            } catch (InputMismatchException e) {
                System.out.println("Sai du lieu dau vao");
            }
        }
    }
}
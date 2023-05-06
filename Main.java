import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        boolean flag = true;
        while (flag) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("-----------------------------");
                System.out.println("1.Nhập thông tin tài liệu");
                System.out.println("2.Hiển thị thông tin tài liệu");
                System.out.println("3.Tìm kiếm thông tin tài liệu");
                System.out.println("4.Thoát chương trình");
                int option = scanner.nextInt();
                switch (option) {
                    case 1, 2:
                        // to do
                        break;
                    case 3:
                        System.out.println(" Bạn muốn tìm kiếm thông tin gì:");
                        System.out.println("1.Sách");
                        System.out.println("2.Tạp chí");
                        System.out.println("3.Báo");
                        int optionCase3 = scanner.nextInt();
                        switch (optionCase3) {
                            case 1:
                                System.out.println("Nhap ten tac gia can tim kiem");
                                String keyWordBook = scanner.nextLine();
                                library.search(1, keyWordBook);
                                break;
                            case 2:
                                System.out.println("Nhap ten tac gia can tim kiem");
                                String keyWordMagazine = scanner.nextLine();
                                library.search(2, keyWordMagazine);
                                break;
                            case 3:
                                System.out.println("Nhap ten tac gia can tim kiem");
                                String keyWordNewspaper = scanner.nextLine();
                                library.search(3, keyWordNewspaper);
                                break;
                            default:
                                break;
                        }
                        break;
                    case 4:
                        flag = false;
                        System.out.println("Byeeee");
                        break;
                    default:
                        break;
                }
            } catch (Exception ex) {
                System.out.println(" nhập giá trị bị lỗi rồi");
            }
        }
    }
}
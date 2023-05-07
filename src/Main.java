import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagementDocument managementDocument = new ManagementDocument();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin nhà xuất bản cần tìm kiếm");
        String keyWord = scanner.nextLine();
        managementDocument.searchDocument(keyWord);
    }
}
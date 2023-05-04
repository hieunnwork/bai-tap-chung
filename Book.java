import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Book extends Document implements IExportFile {
    private String author;
    private int pageNumber;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Book(String id, String name, int number, String author, int pageNumber) {
        super(id, name, number);
        this.author = author;
        this.pageNumber = pageNumber;
    }

    @Override
    public void exportFile() {
        File file = new File("Book.txt");

        boolean isExit = file.exists();
        if (!isExit) {
            try {
                boolean value = file.createNewFile();
                if (value) {
                    System.out.println("Tạo file thành công");
                } else {
                    System.out.println("File đã tồn tại");
                }
            } catch (Exception e) {
                System.out.println("Tạo file thất bại");
            }
        }

        try {
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("=================================\n");
            bufferedWriter.write("Tên nhân viên : " + getName() + "\n");
            bufferedWriter.write("Ngày tháng năm sinh: " + getId() + "\n");
            bufferedWriter.write("Giới tính : " + getNumber() + "\n");
            bufferedWriter.write("Địa chỉ: " + getAuthor() + "\n");
            bufferedWriter.write("Cấp bậc: " + getPageNumber() + "\n");
            System.out.println("Data đã được ghi vào file ");
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Ghi file thất bại");
        }
    }
}

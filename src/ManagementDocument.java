import java.util.ArrayList;
import java.util.List;

public class ManagementDocument {
    private List<Book> listBooks;
    private List<Magazine> listMagazines;
    private List<NewPaper> listNewspapers;

    public ManagementDocument() {
        listBooks = new ArrayList<>();
        listMagazines = new ArrayList<>();
        listNewspapers = new ArrayList<>();
    }

    public void searchDocument(String keyWord) {
        System.out.println(" Kết quả trả về thông tin tìm kiếm sách là");
        if (listBooks.size() == 0) {
            System.out.println(" Rỗng");
        } else {
            for (int i = 0; i < listBooks.size(); i++) {
                if (keyWord.contains(listBooks.get(i).getNamePublication())) {
                    System.out.println(" Mã tài liệu: " + listBooks.get(i).getCodeDocument());
                    System.out.println(" Tên nhà xuất bản: " + listBooks.get(i).getNamePublication());
                    System.out.println(" Số bản phát hành: " + listBooks.get(i).getPageNumber());
                    System.out.println(" Tên tác giá: " + listBooks.get(i).getNameAuthor());
                    System.out.println(" Số trang: " + listBooks.get(i).getPageNumber());
                }
            }
        }
        System.out.println();
        System.out.println(" Kết quả trả về thông tin tìm kiếm tạp chí là");
        if (listMagazines.size() == 0) {
            System.out.println(" Rỗng");
        } else {
            for (int i = 0; i < listMagazines.size(); i++) {
                if (keyWord.contains(listMagazines.get(i).getNamePublication())) {
                    System.out.println(" Mã tài liệu: " + listMagazines.get(i).getCodeDocument());
                    System.out.println(" Tên nhà xuất bản: " + listMagazines.get(i).getNamePublication());
                    System.out.println(" Số bản phát hành: " + listMagazines.get(i).getEdition());
                    System.out.println(" Số phát hành: " + listMagazines.get(i).getIssueNumber());
                    System.out.println(" Tháng phát hành: " + listMagazines.get(i).getReleaseMonth());
                }
            }
        }
        System.out.println();
        System.out.println(" Kết quả trả về thông tin tìm kiếm báo là");
        if (listNewspapers.size() == 0) {
            System.out.println(" Rỗng");
        } else {
            for (int i = 0; i < listNewspapers.size(); i++) {
                if (keyWord.contains(listNewspapers.get(i).getNamePublication())) {
                    System.out.println(" Mã tài liệu: " + listNewspapers.get(i).getCodeDocument());
                    System.out.println(" Tên nhà xuất bản: " + listNewspapers.get(i).getNamePublication());
                    System.out.println(" Số bản phát hành: " + listNewspapers.get(i).getEdition());
                    System.out.println(" Ngày phát hành: " + listNewspapers.get(i).getDateRelease());
                }
            }
        }
    }

}

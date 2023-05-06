import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Magazine> magazines = new ArrayList<>();
    ArrayList<Newspaper> newspapers = new ArrayList<>();


    public void searchBook(String keyWord) {
        if (books.size() == 0) {
            System.out.println(" hiện tại chưa có giá trị nào");
        } else {
            for (int i = 0; i < books.size(); i++) {
                if (keyWord.contains(books.get(i).getName())) {
                    System.out.println(" Mã tài liệu: " + books.get(i).getId());
                    System.out.println(" Tên nhà xuất bản: " + books.get(i).getName());
                    System.out.println(" Số bản phát hành: " + books.get(i).getNumber());
                    System.out.println(" Tên tác giá: " + books.get(i).getAuthor());
                    System.out.println(" Số trang: " + books.get(i).getPageNumber());
                }

            }
        }
    }

    public void searchMagazine(String keyWord) {
        if (magazines.size() == 0) {
            System.out.println(" hiện tại chưa có giá trị nào");
        } else {
            for (int i = 0; i < magazines.size(); i++) {
                if (keyWord.contains(books.get(i).getName())) {
                    System.out.println(" Mã tài liệu: " + magazines.get(i).getId());
                    System.out.println(" Tên nhà xuất bản: " + magazines.get(i).getName());
                    System.out.println(" Số bản phát hành: " + magazines.get(i).getNumber());
                    System.out.println(" Số phát hành: " + magazines.get(i).getRelease());
                    System.out.println(" Tháng phát hành: " + magazines.get(i).getMothRelease());
                }
            }
        }
    }

    public void searchNewspaper(String keyWord) {
        if (newspapers.size() == 0) {
            System.out.println(" hiện tại chưa có giá trị nào");
        } else {
            for (int i = 0; i < newspapers.size(); i++) {
                if (keyWord.contains(books.get(i).getName())) {
                    System.out.println(" Mã tài liệu: " + newspapers.get(i).getId());
                    System.out.println(" Tên nhà xuất bản: " + newspapers.get(i).getName());
                    System.out.println(" Số bản phát hành: " + newspapers.get(i).getNumber());
                    System.out.println(" Tháng phát hành: " + newspapers.get(i).getMothRelease());
                }
            }
        }
    }

    public void search(int option, String keyWord) {

        if (option == 1) {
            searchBook(keyWord);
        } else if (option == 2) {
            searchMagazine(keyWord);
        } else {
            searchNewspaper(keyWord);
        }
    }

}

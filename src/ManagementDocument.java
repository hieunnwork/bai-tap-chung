import java.util.ArrayList;
import java.util.List;

public class ManagementDocument {
    private ArrayList<Book> listBooks;
    private ArrayList<Magazine> listMagazines;
    private ArrayList<NewPaper> listNewspapers;

    public ManagementDocument() {
        listBooks = new ArrayList<>();
        listMagazines = new ArrayList<>();
        listNewspapers = new ArrayList<>();
    }

    public void ShowBookInformation() {
        for (int i = 0; i < listBooks.size(); i++) {
            listBooks.get(i).ShowBook();
        }
    }

    public void ShowMagazineInformation() {
        for (int i = 0; i < listMagazines.size(); i++) {
            listMagazines.get(i).ShowMagazine();
        }
    }

    public void ShowNewsletterInformation() {
        for (int i = 0; i < listNewspapers.size(); i++) {
            listNewspapers.get(i).ShowNewpaper();
        }
    }
    public void ImportBook(String inputCodeDocument, String inputNamePublication, int inputEdition, String inputNameAuthor, int inputPageNumber) {
        Book book = new Book(inputCodeDocument, inputNamePublication, inputEdition, inputNameAuthor, inputPageNumber);
        listBooks.add(book);
        System.out.println("Nhap thanh cong");
    }

    public void ImportMagazine (String inputCodeDocument, String inputNamePublication, int inputEdition, int inputIssueNumber, int inputReleaseMonth){
        Magazine magazine = new Magazine(inputCodeDocument,inputNamePublication,inputEdition,inputIssueNumber,inputReleaseMonth);
        listMagazines.add(magazine);
        System.out.println("Nhap thanh cong");
    }
    public void ImportNewspaper (String inputCodeDocument, String inputNamePublication, int inputEdition, int inputDateRelease){
        NewPaper newPaper = new NewPaper(inputCodeDocument,inputNamePublication,inputEdition,inputDateRelease);
        listNewspapers.add(newPaper);
        System.out.println("Nhap thanh cong");
    }
}

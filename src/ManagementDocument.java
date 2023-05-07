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
}

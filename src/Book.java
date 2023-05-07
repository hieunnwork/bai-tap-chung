public class Book extends Document{
    private String nameAuthor;
    private int pageNumber;
    public Book(){}
    public Book(String inputCodeDocument, String inputNamePublication, int inputEdition, String inputNameAuthor, int inputPageNumber){
        super(inputCodeDocument,inputNamePublication,inputEdition);
        nameAuthor=inputNameAuthor;
        pageNumber=inputPageNumber;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}

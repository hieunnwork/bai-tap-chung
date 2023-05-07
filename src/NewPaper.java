public class NewPaper extends Document {
    private int dateRelease;

    public NewPaper() {
    }

    public NewPaper(String inputCodeDocument, String inputNamePublication, int inputEdition, int inputDateRelease) {
        super(inputCodeDocument, inputNamePublication, inputEdition);
        dateRelease = inputDateRelease;
    }

    public int getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(int dateRelease) {
        this.dateRelease = dateRelease;
    }
}

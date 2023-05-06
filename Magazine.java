public class Magazine extends Document implements IExportFile {
    private String release;
    private int monthRelease;

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public int getMothRelease() {
        return monthRelease;
    }

    public void setMonthRelease(int monthRelease) {
        this.monthRelease = monthRelease;
    }

    public Magazine(String id, String name, int number, String release, int mothRelease) {
        super(id, name, number);
        this.release = release;
        this.monthRelease = mothRelease;
    }

    @Override
    public void exportFile() {

    }
}

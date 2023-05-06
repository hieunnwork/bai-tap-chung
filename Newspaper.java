public class Newspaper extends Document implements IExportFile {
    private int dayRelease;

    public Newspaper(String id, String name, int number, int mothRelease) {
        super(id, name, number);
        this.dayRelease = mothRelease;
    }

    public int getMothRelease() {
        return dayRelease;
    }

    public void setDayRelease(int dayRelease) {
        this.dayRelease = dayRelease;
    }

    @Override
    public void exportFile() {

    }
}

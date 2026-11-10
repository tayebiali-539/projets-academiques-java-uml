package ex1;

public class MobileApplication extends Application {
    private String ios;

    public MobileApplication(String name, String developer, int year, String ios) {
        super(name, developer, year);
        this.ios = ios;
    }

    @Override
    public String getPlatform() {
        return "mobile";
    }
    public String getIos() {
        return ios;
    }

    public void setIos(String ios) {
        this.ios = ios;
    }
}

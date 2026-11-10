package ex1;

public class WebApplication extends Application {
    private String frameworkk;

    public WebApplication(String name, String developer, int year, String frameworkk) {
        super(name, developer, year);
        this.frameworkk = frameworkk;
    }

    @Override
    public String getPlatform() {
        return "web";
    }

    public String getFrameworkk() {
        return frameworkk;
    }

    public void setFrameworkk(String frameworkk) {
        this.frameworkk = frameworkk;
    }


}

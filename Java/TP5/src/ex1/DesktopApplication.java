package ex1;

import java.util.Comparator;

public class DesktopApplication extends Application {
    private boolean requiredInstallation;

    public DesktopApplication(String name, String developer, int year, boolean requiredInstallation) {
        super(name, developer, year);
        this.requiredInstallation = requiredInstallation;
    }

    @Override
    public String getPlatform() {
        return "desktop";
    }

    public boolean isRequiredInstallation() {
        return requiredInstallation;
    }

    public void setRequiredInstallation(boolean requiredInstallation) {
        this.requiredInstallation = requiredInstallation;
    }
}

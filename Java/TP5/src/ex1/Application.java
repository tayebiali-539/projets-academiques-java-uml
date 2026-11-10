package ex1;

public abstract class Application {
    private String name, developer;
    private int year;

    public Application(String name, String developer, int year) {
        this.name = name;
        this.developer = developer;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;
        if(obj instanceof Application) {
            Application a = (Application) obj;
            return a.name.equals(this.name) && a.developer.equals(this.developer);
        }
        return false;
    }

    public abstract String getPlatform();
    public String toString() {
        return name + " " + developer + " " + year;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

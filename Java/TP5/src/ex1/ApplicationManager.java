package ex1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ApplicationManager {
    LinkedList<Application> applications;

    public ApplicationManager() {
        applications = new LinkedList<>();
    }

    public void addApplication(Application app) throws DuplicateApplicationException {
        boolean existe = applications.stream()
                .anyMatch(app1 -> app1.getName().equals(app.getName()) &&
                        app1.getDeveloper().equals(app.getDeveloper()));
        //au cas où equals existe dans la classe Application
        if (applications.contains(app))
            throw new DuplicateApplicationException("Application already exists");
        applications.add(app);
    }

    List<Application> filterApplications(Predicate<Application> filter) {
        List<Application> filtered = new LinkedList<>();
        for (Application app : applications) {
            if (filter.test(app)) filtered.add(app);
        }
        return filtered;
    }

    List<Application> filterApplications2(Predicate<Application> x) {
        return applications.stream()
                .filter(x)
                .collect(Collectors.toList());
    }

    void displayApplications() {
        //applications.forEach(a->System.out.println(a.getName()));
        for (Application app : applications) {
            System.out.println(app.getName() + ": " + app.getDeveloper());
        }
    }

    public void deleteApplication(String name, String devloper) {
        //Moins recommondé
        for (Application app : applications) {
            if (app.getName().equals(name) && app.getDeveloper().equals(devloper)) {
                applications.remove(app);
            }
        }
        //ou meilleur
        Iterator<Application> it = applications.iterator();
        while(it.hasNext()) {
            Application app = it.next();
            if (app.getName().equals(name) && app.getDeveloper().equals(devloper)) {
                it.remove();
            }
        }
        //ou encore mieux
        applications.removeIf(app -> app.getName().equals(name) &&
                app.getDeveloper().equals(devloper));
    }

    public Application getApplication(String name, String developer) {
        for (Application app : applications) {
            if (app.getName().equals(name) && app.getDeveloper().equals(developer)) {
                return app;
            }
        }
        return null;
    }

    public void Statistique() {
        int cmobile = 0, cWeb = 0, cDesktop = 0;
        for (Application app : applications) {
            if (app instanceof MobileApplication) cmobile++;
            else if (app instanceof WebApplication) cWeb++;
            else cDesktop++;
        }
        System.out.println("Mobile: " + cmobile);
        System.out.println("Web: " + cWeb);
        System.out.println("Desktop: " + cDesktop);
    }

    List<MobileApplication> getMobile(String type) {
        List<MobileApplication> mobiles = new LinkedList<>();
        for (Application app : applications) {
            if (app instanceof MobileApplication) {
                MobileApplication mapp = (MobileApplication) app;
                if (mapp.getIos().equals(type))
                    mobiles.add(mapp);
            }
        }
        return mobiles;
    }

    List<MobileApplication> getMobile2(String type) {
        return applications.stream()
                .filter(a -> a instanceof MobileApplication)
                .map(a -> (MobileApplication) a)
                .filter(am -> am.getIos().equals(type))
                .collect(Collectors.toList());
    }

    public Map<String, List<WebApplication>> getWeb(String type) {
        return applications.stream()
                .filter(a -> a instanceof WebApplication)
                .map(a -> (WebApplication) a)
                .collect(Collectors.groupingBy(WebApplication::getFrameworkk));
    }

    public void afficherDesktop() {
        applications.stream()
                .filter(a -> a instanceof DesktopApplication)
                .map(a -> (DesktopApplication) a)
                .filter(da -> da.isRequiredInstallation())
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .forEach(da -> System.out.println(da.getName()));
    }

    public void afficherDesktop2() {
        applications.stream()
                .filter(a -> a instanceof DesktopApplication)
                .map(a -> (DesktopApplication) a)
                .filter(da -> da.isRequiredInstallation())
                .sorted((a, b) -> Integer.compare(a.getYear(), b.getYear()))
                .forEach(da -> System.out.println(da.getName()));
    }

    public void afficherDesktopSansStream() {
        List<DesktopApplication> l = new LinkedList<>();
        for (Application app : applications) {
            if (app instanceof DesktopApplication)
                l.add((DesktopApplication) app);
        }
        l.sort((a, b) -> Integer.compare(a.getYear(), b.getYear()));
        l.forEach(da -> System.out.println(da.getName()));
    }

}

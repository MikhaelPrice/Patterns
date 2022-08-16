package observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("Junior");
        jobSite.addVacancy("Trainee");

        Observer firstSubscriber = new Subscriber("Michail Price");
        Observer secondSubscriber = new Subscriber("Milana Bondar");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Middle");

        jobSite.removeVacancy("Junior");
    }
}

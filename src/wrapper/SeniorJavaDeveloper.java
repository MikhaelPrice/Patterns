package wrapper;

public class SeniorJavaDeveloper extends DeveloperWrapper {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }

    public String makeCodeReview() {
        return " Making code review";
    }
}

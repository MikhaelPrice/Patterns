package wrapper;

public class JavaTeamLead extends DeveloperWrapper{

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob()+sendWeekReport();
    }

    public String sendWeekReport(){
        return " Send week report to customer.";
    }

}

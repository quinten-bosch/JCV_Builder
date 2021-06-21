package domain.model;

import java.util.Date;

public class WorkExperience extends DatumEnBeschrijving {

    private String function;
    private String employer;

    public WorkExperience(Date from, Date until, String description, String place, String function, String employer) {
        super(from, until, description, place);
        this.setFunction(function);
        this.setEmployer(employer);
    }

    public WorkExperience() {
        super();
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }
}

package domain.model;

import java.util.Date;

public class Education extends DatumEnBeschrijving {

    private String education;
    private String educationalInstitution;

    public Education(Date from, Date until, String description, String place, String education, String educationalInstitution) {
        super(from, until, description, place);
        this.setEducation(education);
        this.setEducationalInstitution(educationalInstitution);
    }

    public Education() {

    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEducationalInstitution() {
        return educationalInstitution;
    }

    public void setEducationalInstitution(String educationalInstitution) {
        this.educationalInstitution = educationalInstitution;
    }
}

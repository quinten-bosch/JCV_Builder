package domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import ui.Test3;

import java.util.Map;

public class JsonToJava {

    private String id;
    private String skill;
    private String level;
    private Template2 tt1;

    public JsonToJava() {
        tt1 = new Template2(Test3.sessionID);
        tt1.createTemplateFile();
    }

    @JsonProperty("sessie_id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("skills")
    private void unpackNestedSkills(Map<String,Object> skills) {
        for (int i = 0; i < skills.size(); i++) {
            Map<String,String> skill0 = (Map<String,String>)skills.get("skill"+i);
            this.skill = skill0.get("skill_name");
            this.level = skill0.get("skill_level");

            Skills skillObj = new Skills(skill,level);

            tt1.addSkills(skillObj);
        }
        System.out.println(tt1.skillToHtml());
        tt1.writeSkillsToFile();
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("languages")
    private void unpackNestedLanguages(Map<String,Object> languages) {
        for (int i = 0; i < languages.size(); i++) {
            Map<String,String> language0 = (Map<String,String>)languages.get("language"+i);
            String language = language0.get("language");
            String level = language0.get("language_level");

            Languages langObj = new Languages(language,level);

            tt1.addLanguages(langObj);
        }
        System.out.println(tt1.languageToHtml());
        tt1.writeLanguagesToFile();
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("educations")
    private void unpackNestedEducations(Map<String,Object> educations) {
        for (int i = 0; i < educations.size(); i++) {
            Map<String,String> education0 = (Map<String,String>)educations.get("education"+i);
            String education = education0.get("education");
            String place = education0.get("education_place");
            String institution = education0.get("education_institution");
            String from_month = education0.get("from_month");
            String from_year = education0.get("from_year");
            String to_month = education0.get("to_month");
            String to_year = education0.get("to_year");
            String description = education0.get("description");

            Education educationObj = new Education("", education, "", place, "", institution, "", from_month, "", from_year, "", to_month, "", to_year, "", description);

            tt1.addEducation(educationObj);
        }
        System.out.println(tt1.educationToHtml());
        tt1.writeEducationToFile();
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("experiences")
    private void unpackNestedExperiences(Map<String,Object> experiences) {
        for (int i = 0; i < experiences.size(); i++) {
            Map<String,String> experience0 = (Map<String,String>)experiences.get("experience"+i);
            String function = experience0.get("function");
            String place = experience0.get("place");
            String employer = experience0.get("employer");
            String from_month = experience0.get("from_month");
            String from_year = experience0.get("from_year");
            String to_month = experience0.get("to_month");
            String to_year = experience0.get("to_year");
            String description = experience0.get("description");

            WorkExperience weObj = new WorkExperience("", function, "", place, "", employer, "", from_month, "", from_year, "", to_month, "", to_year, "", description);

            tt1.addWorkExperience(weObj);
        }
        System.out.println(tt1.workExperienceToHtml());
        tt1.writeWorkExperienceToFile();
    }
}

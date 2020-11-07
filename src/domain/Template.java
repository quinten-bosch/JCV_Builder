package domain;

import java.io.FileWriter;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.List;
import java.util.ArrayList;

import ui.*;

public class Template {
    String templateName;
    int templateNr;
    List <Languages> languages;
    List <Skills> skills;
    List <WorkExperience> workExperiences;
    List <Education> educations;

    public Template(String templateName, int templateNr) {
        this.templateName = templateName;
        this.templateNr = templateNr;
        this.languages = new ArrayList<>();
        this.skills = new ArrayList<>();
        this.workExperiences = new ArrayList<>();
        this.educations = new ArrayList<>();
    }

    public String generateTemplateHtml() {
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link rel=\"stylesheet\" href=\"style/template"+ getTemplateNr() +".css\">\n" +
                "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n" +
                "    <title>"+ getTemplateName() + "</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class='container'>\n";
        return html;
    }

    public void createTemplateFile() {
        String html = generateTemplateHtml();
        String out_dir = "";
        if (OSValidator.isWindows()) {
            String user_dir = System.getProperty("user.dir");
           out_dir = user_dir + "/out/templates/";
        }
        else {
            out_dir = "/var/www/fosscvbuilder/out/templates/";
        }




        try {
            FileWriter myWriter = new FileWriter(out_dir+"/"+ getTemplateName() +".html");
            myWriter.write(html);
            myWriter.close();
            System.out.println("Successfully created blank template.");
        } catch (IOException e) {
            System.out.println("An error occurred.");


        }
    }

    public void addLanguages(Languages language) {
        this.languages.add(language);
    }

    public String generateLanguageHtml() {
        String languageHtml = "";
        for (Languages pLanguages : this.languages) {
            languageHtml += "<div>"+ pLanguages.getLanguage() + ": " + pLanguages.getLevel() +"</div>";
        }
        String languageStylingHTML = "<div class='row'><div class='col-6'><h2>Languages</h2>"+ languageHtml +"<div></div>\n";
        return languageStylingHTML;
    }

    public void writeLanguagesToFile() {
        String user_dir = System.getProperty("user.dir");
        String out_dir = user_dir + "/out/templates/";
        try {
            FileWriter myWriter = new FileWriter(out_dir+"template1.html", true);
            myWriter.write(generateLanguageHtml());
            myWriter.close();
            System.out.println("Successfully wrote languages to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void addSkills(Skills skill) {
        this.skills.add(skill);
    }

    public String getAllSkills() {
        String skillHTML = "";
        for (Skills pSkill : this.skills) {
            skillHTML += "<div>"+ pSkill.getSkill() + ": " + pSkill.getLevel() + "</div>";
        }
        return "<div class='row'><div class='col-6'><h2>Skills</h2>"+ skillHTML +"</div></div>\n";
    }

    public void writeSkillsToFile() {
        String user_dir = System.getProperty("user.dir");
        String out_dir = user_dir + "/out/templates/";
        try {
            FileWriter myWriter = new FileWriter(out_dir+"template1.html", true);
            myWriter.write(getAllSkills());
            myWriter.close();
            System.out.println("Successfully wrote skills to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void addWorkExperience(WorkExperience workExperience) {
        this.workExperiences.add(workExperience);
    }

    public String getAllWorkExperience() {
        String workExperienceHTML = "";
        for (WorkExperience pWorkExperience : this.workExperiences) {
            workExperienceHTML += "<div>"+ pWorkExperience.getFunctionValue() + "</div>\n" +
            "<div>" + pWorkExperience.getEmployerValue() + " | " + pWorkExperience.getFromYearValue() + " - " + pWorkExperience.getUntilYearValue()+ "</div>" +
            "<div>" + pWorkExperience.getDescriptionValue() + "</div>\n";
        }
        String workExperienceStylingHtml = "<div class='row'><div class='col-12'><h2>Work Experience</h2>"+ workExperienceHTML +"</div></div>\n";
        return workExperienceStylingHtml;
    }

    public void writeWorkExperienceToFile() {
        String user_dir = System.getProperty("user.dir");
        String out_dir = user_dir + "/out/templates/";
        try {
            FileWriter myWriter = new FileWriter(out_dir+"template1.html", true);
            myWriter.write(getAllWorkExperience());
            myWriter.close();
            System.out.println("Successfully wrote work experience to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void addEducation(Education education) { this.educations.add(education); }

    public String getAllEducation() {
        String educationHTML = "";
        for (Education pEducation : this.educations) {
            educationHTML += "<div>" + pEducation.getEducationValue() + "</div>\n" +
            "<div>" + pEducation.getEducationalInstitutionValue() + " | " + pEducation.getFromYearValue() + " - " + pEducation.getUntilYearValue() + "</div>" +
            "<div>" + pEducation.getDescriptionValue() + "</div>\n";
        }
        String educationStylingHTML = "<div class='row'><div class='col-12'><h2>Work Experience</h2>"+ educationHTML +"</div></div>\n";
        return educationStylingHTML;
    }

    public void writeEducationToFile() {
        String user_dir = System.getProperty("user.dir");
        String out_dir = user_dir + "/out/templates/";
        try {
            FileWriter myWriter = new FileWriter(out_dir+"template1.html", true);
            myWriter.write(getAllEducation());
            myWriter.close();
            System.out.println("Successfully wrote work education to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public int getTemplateNr() {
        return templateNr;
    }

    public void setTemplateNr(int templateNr) {
        this.templateNr = templateNr;
    }

    public List<Languages> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Languages> languages) {
        this.languages = languages;
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }

    public List<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(List<WorkExperience> workExperiences) {
        this.workExperiences = workExperiences;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }
}

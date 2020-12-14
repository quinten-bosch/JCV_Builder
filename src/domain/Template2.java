package domain;

import ui.CvAppV2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Template2 {
    String templateName;
    ArrayList<Skills> skills;
    ArrayList<Languages> languages;
    ArrayList<Education> educations;
    ArrayList<WorkExperience> workExperiences;

    public Template2(String templateName) {
        setTemplateName(templateName);
        this.skills = new ArrayList<Skills>();
        this.languages = new ArrayList<Languages>();
        this.educations = new ArrayList<Education>();
        this.workExperiences = new ArrayList<WorkExperience>();
    }

    public String generateTemplateHtml() {
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link rel=\"stylesheet\" href=\"style/template.css\">\n" +
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
            FileWriter myWriter = new FileWriter(out_dir+"/template"+ getTemplateName() + ".html");
            myWriter.write(html);
            myWriter.close();
            System.out.println("Successfully created blank template.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println(e.toString());
        }
    }

    public void addSkills(Skills skill) {
        this.skills.add(skill);
    }

    public String skillToHtml() {
        String result = "";
        for (Skills pSkill : this.skills) {
            result += "<div>"+ pSkill.getSkill() + ": " + pSkill.getLevel() + "</div>";
        }
        return "<div class='row'><div class='col-6'><h2>Skills</h2>"+ result +"</div></div>\n";
    }

    public void writeSkillsToFile() {
        String user_dir = System.getProperty("user.dir");
        String out_dir = user_dir + "/out/templates/";
        try {
            FileWriter myWriter = new FileWriter(out_dir+"/template"+ getTemplateName() + ".html", true);
            myWriter.write(skillToHtml());
            myWriter.close();
            System.out.println("Successfully wrote skills to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void addLanguages(Languages language) {
        this.languages.add(language);
    }

    public String languageToHtml() {
        String languageHtml = "";
        for (Languages pLanguages : this.languages) {
            languageHtml += "<div>"+ pLanguages.getLanguage() + ": " + pLanguages.getLevel() +"</div>";
        }
        return "<div class='row'><div class='col-6'><h2>Languages</h2>"+ languageHtml +"<div></div>\n";
    }

    public void writeLanguagesToFile() {
        String user_dir = System.getProperty("user.dir");
        String out_dir = user_dir + "/out/templates/";
        try {
            FileWriter myWriter = new FileWriter(out_dir+"/template"+ getTemplateName() +".html", true);
            myWriter.write(languageToHtml());
            myWriter.close();
            System.out.println("Successfully wrote languages to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void addEducation(Education education) { this.educations.add(education); }

    public String educationToHtml() {
        String educationHTML = "";
        for (Education pEducation : this.educations) {
            educationHTML += "<div>" + pEducation.getEducationValue() + "</div>\n" +
                    "<div>" + pEducation.getEducationalInstitutionValue() + " | " + pEducation.getFromYearValue() + " - " + pEducation.getUntilYearValue() + "</div>" +
                    "<div>" + pEducation.getDescriptionValue() + "</div>\n";
        }
        return "<div class='row'><div class='col-12'><h2>Education</h2>"+ educationHTML +"</div></div>\n";
    }

    public void writeEducationToFile() {
        String user_dir = System.getProperty("user.dir");
        String out_dir = user_dir + "/out/templates/";
        try {
            FileWriter myWriter = new FileWriter(out_dir+"/template"+ getTemplateName() +".html", true);
            myWriter.write(educationToHtml());
            myWriter.close();
            System.out.println("Successfully wrote work education to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void addWorkExperience(WorkExperience workExperience) {
        this.workExperiences.add(workExperience);
    }

    public String workExperienceToHtml() {
        String workExperienceHTML = "";
        for (WorkExperience pWorkExperience : this.workExperiences) {
            workExperienceHTML += "<div>"+ pWorkExperience.getFunctionValue() + "</div>\n" +
                    "<div>" + pWorkExperience.getEmployerValue() + " | " + pWorkExperience.getFromYearValue() + " - " + pWorkExperience.getUntilYearValue()+ "</div>" +
                    "<div>" + pWorkExperience.getDescriptionValue() + "</div>\n";
        }
        return "<div class='row'><div class='col-12'><h2>Work Experience</h2>"+ workExperienceHTML +"</div></div>\n";
    }

    public void writeWorkExperienceToFile() {
        String user_dir = System.getProperty("user.dir");
        String out_dir = user_dir + "/out/templates/";
        try {
            FileWriter myWriter = new FileWriter(out_dir+"/template"+ getTemplateName() +".html", true);
            myWriter.write(workExperienceToHtml());
            myWriter.close();
            System.out.println("Successfully wrote work experience to the file.");
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

    public ArrayList<Skills> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skills> skills) {
        this.skills = skills;
    }

    public ArrayList<Languages> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<Languages> languages) {
        this.languages = languages;
    }
}

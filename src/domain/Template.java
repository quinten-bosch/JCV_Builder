package domain;

import java.io.FileWriter;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.List;
import java.util.ArrayList;

public class Template {
    String templateName;
    int templateNr;
    List <Languages> languages;
    List <Skills> skills;

    public Template(String templateName, int templateNr) {
        this.templateName = templateName;
        this.templateNr = templateNr;
        this.languages = new ArrayList<>();
        this.skills = new ArrayList<>();
    }

    public String generateTemplateHtml() {
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link rel=\"stylesheet\" href=\"style/template"+ getTemplateNr() +".css\">\n" +
                "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n" +
                "    <title>"+ getTemplateName() +"</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class='container'>\n";
        return html;
    }

    public void createTemplateFile() {
        String html = generateTemplateHtml();
        String user_dir = System.getProperty("user.dir");
        String out_dir = user_dir + "/out/templates/";
        try {
            FileWriter myWriter = new FileWriter(out_dir+"/"+ getTemplateName() +".html");
            myWriter.write(html);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
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
        String skillStylingHTML = "<div class='row'><div class='col-6'><h2>Skills</h2>"+ skillHTML +"<div></div>\n";
        return skillStylingHTML;
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
}

package domain;

import ui.CvAppV2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Template2 {
    String templateName;
    ArrayList<Skills> skills;

    public Template2(String templateName) {
        setTemplateName(templateName);
        this.skills = new ArrayList<Skills>();
    }

    public String generateTemplateHtml() {
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link rel=\"stylesheet\" href=\"style/template.css\">\n" +
                "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n" +
                "    <title>"+ this.templateName + "</title>\n" +
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
}

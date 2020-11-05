package domain;

import java.io.FileWriter;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.List;
import java.util.ArrayList;

public class Template {
    String templateName;
    int templateNr;
    List <Languages> languages;

    public Template(String templateName, int templateNr) {
        this.templateName = templateName;
        this.templateNr = templateNr;
        this.languages = new ArrayList<>();
    }

    public String generateTemplateHtml() {
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link rel=\"stylesheet\" href=\"style/template"+ getTemplateNr() +".css\">\n" +
                "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha2/css/bootstrap.min.css\" integrity=\"sha384-DhY6onE6f3zzKbjUPRc2hOzGAdEf4/Dz+WJwBvEYL/lkkIsI3ihufq9hk9K4lVoK\" crossorigin=\"anonymous\">\n" +
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
            languageHtml += "<div>"+ pLanguages.getLanguage() + ": " + pLanguages.getLevel() +"</div>\n";
        }
        return languageHtml;
    }

    public void writeLanguagesToFile() {
        String user_dir = System.getProperty("user.dir");
        String out_dir = user_dir + "/out/templates/";
        try {
            FileWriter myWriter = new FileWriter(out_dir+"template1.html", true);
            myWriter.write(generateLanguageHtml());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
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
}

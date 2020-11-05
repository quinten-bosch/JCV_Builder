package domain;

import java.io.FileWriter;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class Template {
    String templateName;
    int templateNr;

    public Template(String templateName, int templateNr) {
        this.templateName = templateName;
        this.templateNr = templateNr;
    }

    public String generateTemplateHtml() {
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link rel=\"stylesheet\" href=\"template"+ getTemplateNr() +".css\">\n" +
                "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha2/css/bootstrap.min.css\" integrity=\"sha384-DhY6onE6f3zzKbjUPRc2hOzGAdEf4/Dz+WJwBvEYL/lkkIsI3ihufq9hk9K4lVoK\" crossorigin=\"anonymous\">\n" +
                "    <title>"+ getTemplateName() +"</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class='container'>\n";
        return html;
    }

    public void createTemplateFile() {
        String html = generateTemplateHtml();
        try {
            FileWriter myWriter = new FileWriter("D:\\Projects\\JCV_Builder\\out\\templates\\"+ getTemplateName() +".html");
            myWriter.write(html);
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
}

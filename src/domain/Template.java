package domain;

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
                "    <title>"+ getTemplateName() +"</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    \n" +
                "</body>\n" +
                "</html>";
        return html;
    }

    public void createTemplateFile() {

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

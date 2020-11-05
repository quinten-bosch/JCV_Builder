package ui;

import domain.*;

public class CvApp {
    public static void main(String[] args) {
        PersonalInfo block1 = new PersonalInfo("Voornaam", "Achternaam", "Jan", "Jansens", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "123456789", "jan.jansens@gmail.com", false, false, false,false, false, false);
        System.out.println(block1.generateHTML());

        Template template1 = new Template("Template1", 1);
        template1.createTemplateFile();
        block1.writePersonalInfoToFile();

        System.out.println(System.getProperty("user.dir"));
        convertHTMLtoPDF.generatePDF();

    }
}

package ui;

import domain.*;

public class CvApp {
    public static void main(String[] args) {
        PersonalInfo block1 = new PersonalInfo("Voornaam", "Achternaam", "Jan", "Jansens", "", "", "", "", "Leuven", "Stationstraat", "51", "3000", "", "", "", "15/02/2000", "", "", "123456789", "jan.jansens@gmail.com", true, true, false,false, false, true);
        System.out.println(block1.generateHTML());

        Template template1 = new Template("template1", 1);
        template1.createTemplateFile();
        block1.writePersonalInfoToFile();

        System.out.println(System.getProperty("user.dir"));
        convertHTMLtoPDF.generatePDF();

    }
}

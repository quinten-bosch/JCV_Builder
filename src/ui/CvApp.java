package ui;

import domain.*;

public class CvApp {
    public static void main(String[] args) {
        PersonalInfo block1 = new PersonalInfo("Voornaam", "Achternaam", "Jan", "Jansens", "", "", "", "", "Leuven", "Stationstraat", "51", "3000", "", "", "", "15/02/2000", "", "", "123456789", "jan.jansens@gmail.com", true, true, false,false, false, true);
        System.out.println(block1.generateHTML());

        Template template1 = new Template("template1", 1);
        template1.createTemplateFile();
        block1.writePersonalInfoToFile();

        Languages language1 = new Languages("Nederlands", "Moedertaal");
        Languages language2 = new Languages("Engels", "Goed");
        Skills skill1 = new Skills("Python", "Goed");
        Skills skill2 = new Skills("Mysql", "Goed");
        template1.addLanguages(language1);
        template1.addLanguages(language2);
        template1.writeLanguagesToFile();

        template1.addSkills(skill1);
        template1.addSkills(skill2);
        template1.writeSkillsToFile();

        System.out.println(System.getProperty("user.dir"));
        convertHTMLtoPDF.generatePDF();

    }
}

package ui;

import domain.*;

public class CvApp {
    public static void main(String[] args) {
        PersonalInfo block1 = new PersonalInfo("Voornaam", "Achternaam", "Jan", "Jansens", "", "", "", "", "Leuven", "Stationstraat", "51", "3000", "", "", "", "15/02/2000", "", "", "123456789", "jan.jansens@gmail.com", true, true, false,false, false, true);


        Template template1 = new Template("template1", 1);
        template1.createTemplateFile();
        block1.writePersonalInfoToFile();

        Languages language1 = new Languages("Nederlands", "Moedertaal");
        Languages language2 = new Languages("Engels", "Goed");

        Skills skill1 = new Skills("Python", "Goed");
        Skills skill2 = new Skills("Mysql", "Goed");

        WorkExperience we1 = new WorkExperience("", "CEO", "", "Leuven", "", "Apple", "", "", "", "2019", "", "", "", "2020", "", "Performed management fucntion.");
        WorkExperience we2 = new WorkExperience("", "Webdeveloper", "", "Leuven", "", "Miniemeninstituut", "", "", "", "2018", "", "", "", "2019", "", "Full stack webdevelopment.");


        template1.addLanguages(language1);
        template1.addLanguages(language2);
        template1.writeLanguagesToFile();

        template1.addSkills(skill1);
        template1.addSkills(skill2);
        template1.writeSkillsToFile();

        template1.addWorkExperience(we1);

        template1.writeWorkExperienceToFile();

        System.out.println(System.getProperty("user.dir"));
        convertHTMLtoPDF.generatePDF();

    }
}

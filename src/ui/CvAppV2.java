package ui;

import domain.*;
import org.intellij.lang.annotations.Language;

public class CvAppV2 {
    public static String session_ID;
    public static void main(String[] args) {
        session_ID = args[0];
        System.out.println("SessionID: "+session_ID);

        int teller = 0;
        int personalInfoTeller = 0;
        int skillsTeller = 0;
        int languagesTeller = 0;
        int workExperiencesTeller = 0;
        int educationTeller = 0;

        Template template1 = new Template("template1", 1);
        template1.createTemplateFile();

        PersonalInfo[] personalInfos = new PersonalInfo[3];
        Skills[] skills = new Skills[3];
        Languages[] languages = new Languages[3];
        WorkExperience[] we = new WorkExperience[3];
        Education[] education = new Education[3];

        for (String arg : args) {
            System.out.println(arg);
            if (arg.equals("PersonalInfo"+session_ID)) {
                personalInfos[personalInfoTeller] = new PersonalInfo("Voornaam", "Achternaam", "Jan", "Jansens", "", "", "", "", "Leuven", "Stationstraat", "51", "3000", "", "", "", "15/02/2000", "", "", "123456789", "jan.jansens@gmail.com", true, true, false,false, false, true);
                personalInfos[personalInfoTeller].writePersonalInfoToFile();
                personalInfoTeller++;
            }
            if (arg.equals("Skills"+session_ID)) {
                skills[skillsTeller] = new Skills("hallo","goed");
                template1.addSkills(skills[skillsTeller]);
                skillsTeller++;
            }
            if (arg.equals("Languages"+session_ID)) {
                languages[languagesTeller] = new Languages("Nederlands", "Moedertaal");
                template1.addLanguages(languages[languagesTeller]);
                languagesTeller++;
            }
            if (arg.equals("WE"+session_ID)) {
                we[workExperiencesTeller] = new WorkExperience("", "CEO", "", "Leuven", "", "Apple", "", "", "", "2019", "", "", "", "2020", "", "Performed management fucntion.");
                template1.addWorkExperience(we[workExperiencesTeller]);
                workExperiencesTeller++;
            }
            if (arg.equals("EDU"+session_ID)) {
                education[educationTeller] = new Education("", "Informatica beheer", "", "Leuven", "", "Miniemen Instituut", "", "", "", "2018", "", "", "", "2020", "", "Learned informatics");
                template1.addEducation(education[educationTeller]);
                educationTeller++;
            }
            teller++;
        }
        template1.writeSkillsToFile();
        template1.writeLanguagesToFile();
        template1.writeWorkExperienceToFile();
        template1.writeEducationToFile();
        convertHTMLtoPDF.generatePDF();
    }
}

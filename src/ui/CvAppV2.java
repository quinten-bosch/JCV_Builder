package ui;

import domain.*;

public class CvAppV2 {
    public static String session_ID;
    public static void main(String[] args) {
        session_ID = args[0];
        System.out.println("SessionID: "+session_ID);

        int teller = 0;
        int personalInfoTeller = 0;
        int skillsTeller = 0;

        Template template1 = new Template("template1", 1);
        template1.createTemplateFile();

        PersonalInfo[] personalInfos = new PersonalInfo[3];
        Skills[] skills = new Skills[3];

        for (String arg : args) {
            System.out.println(arg);
            if (arg.equals("PersonalInfo"+session_ID)) {
                personalInfos[personalInfoTeller] = new PersonalInfo("Voornaam", "Achternaam", "Jan", "Jansens", "", "", "", "", "Leuven", "Stationstraat", "51", "3000", "", "", "", "15/02/2000", "", "", "123456789", "jan.jansens@gmail.com", true, true, false,false, false, true);
                personalInfoTeller++;
            }
            if (arg.equals("Skills"+session_ID)) {
                skills[skillsTeller] = new Skills("hallo","goed");
                template1.addSkills(skills[skillsTeller]);
                skillsTeller++;
            }
            teller++;
        }
        personalInfos[personalInfoTeller].writePersonalInfoToFile();
        template1.writeSkillsToFile();
        convertHTMLtoPDF.generatePDF();
    }
}

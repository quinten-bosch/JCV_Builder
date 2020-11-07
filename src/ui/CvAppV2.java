package ui;

import domain.*;

public class CvAppV2 {
    public static String session_ID;
    public static void main(String[] args) {
        session_ID = args[0];
        int teller = 0;
        int skillsTeller = 0;

        Template template1 = new Template("template1", 1);
        template1.createTemplateFile();

        Skills[] skills = new Skills[3];

        for (String arg : args) {
            System.out.println(arg);
            if (arg.equals("Skills")) {
                skills[skillsTeller] = new Skills("hallo","goed");
                template1.addSkills(skills[skillsTeller]);
                skillsTeller++;
            }
            teller++;
        }
        template1.writeSkillsToFile();
        System.out.println("SessionID: "+session_ID);
    }
}

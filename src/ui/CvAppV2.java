package ui;

import domain.*;

public class CvAppV2 {
    public static String session_ID;
    public static void main(String[] args) {
        session_ID = args[0];
        int teller = 0;

        Template template1 = new Template("template1", 1);
        template1.createTemplateFile();

        for (String arg : args) {
            System.out.println(arg);
            if (arg.equals("Skills")) {
                Skills skill2 = new Skills("hallo","goed");
                template1.addSkills(skill2);
                template1.writeSkillsToFile();
            }
            teller++;
        }
        System.out.println("SessionID: "+session_ID);
    }
}

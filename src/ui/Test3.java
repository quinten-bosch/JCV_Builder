package ui;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.JsonToJava;
import domain.OSValidator;
import domain.convertHTMLtoPDF;

import java.io.File;
import java.io.IOException;

public class Test3 {
    public static String sessionID;
    public static void main(String[] args) {
        sessionID = args[0];
        //sessionID = "h9fidfkt598evpiqklj2v47l3i";

        String out_dir = "";
        if (OSValidator.isWindows()) {
            String user_dir = System.getProperty("user.dir");
            out_dir = user_dir + "/out/templates/";
        }
        else {
            out_dir = "/var/www/fosscvbuilder/out/templates/";
        }

        ObjectMapper mapper = new ObjectMapper();

        try {

            // JSON file to Java object
            JsonToJava staff = mapper.readValue(new File(out_dir+"json\\"+ sessionID +".json"), JsonToJava.class);

            // compact print
            System.out.println(staff.getId());
            convertHTMLtoPDF.generatePDF();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

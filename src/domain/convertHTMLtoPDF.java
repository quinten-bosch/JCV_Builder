package domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class convertHTMLtoPDF {

    public static void generatePDF() {

        String user_dir = System.getProperty("user.dir");
        String out_dir = user_dir + "/out/templates/";

   
        ProcessBuilder processBuilder = new ProcessBuilder();

        String command = "wkhtmltopdf " + out_dir + "template1.html " + out_dir + "template1.pdf";

        processBuilder.command("cmd.exe", "/c", command);


        try {

            Process process = processBuilder.start();

            StringBuilder output = new StringBuilder();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println("Generated PDF");
                System.out.println(output);
                System.exit(0);
            }  //abnormal...


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }

}

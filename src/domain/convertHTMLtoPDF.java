package domain;
import ui.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class convertHTMLtoPDF {

    public static void generatePDF() {

        String user_dir = System.getProperty("user.dir");
        String out_dir = user_dir + "/out/templates/";


        ProcessBuilder processBuilder = new ProcessBuilder();

        String command = "wkhtmltopdf " + out_dir + "template1" + CvAppV2.session_ID + ".html " + out_dir + "template1" + CvAppV2.session_ID + ".pdf";


        if (OSValidator.isWindows()) {
            processBuilder.command("cmd.exe", "/c", command);
        } else if (OSValidator.isUnix()) {
            processBuilder.command("bash", "-c", command);
        }

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

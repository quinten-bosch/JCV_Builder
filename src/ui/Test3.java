package ui;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.JsonToJava;

import java.io.File;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {

            // JSON file to Java object
            JsonToJava staff = mapper.readValue(new File("D:\\Projects\\JCV_Builder\\out\\templates\\json\\test.json"), JsonToJava.class);

            // JSON string to Java object
           // String jsonInString = "{\"name\":\"mkyong\",\"age\":37,\"skills\":[\"java\",\"python\"]}";
            //Staff staff2 = mapper.readValue(jsonInString, Staff.class);

            // compact print
            System.out.println(staff.getId());

            // pretty print
            String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);

            System.out.println(prettyStaff1);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

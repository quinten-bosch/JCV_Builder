package ui;

import com.google.gson.*;
import domain.*;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String myJSONString = "{\"sessie_id\":\"90jpq2pbd6k75apmqlp4bgpl88\",\"skills\":{\"skill1\":{\"skill_name\":\"lopen\",\"level_value\":\"niet\"}},\"languages\":{\"language1\":{\"language_name\":\"Nederlands\",\"language_level\":\"Moedertaal\"}}}";
        JsonObject jobj = new Gson().fromJson(myJSONString, JsonObject.class);


        String skillLijst = jobj.get("skills").toString();
        String talenLijst = jobj.get("languages").toString();

        JsonObject skill = new Gson().fromJson(skillLijst, JsonObject.class);

        System.out.println(skillLijst);
        System.out.println(talenLijst);

        String naam = skill.get("skill1").toString();
        System.out.println(naam);
    }
}

package domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class JsonToJava {

    private String id;
    private String skill;
    private String level;

    @JsonProperty("sessie_id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//    @SuppressWarnings("unchecked")
//    @JsonProperty("skills")
//    private void unpackNested(Map<String,Object> skills) {
//        Map<String,String> skill0 = (Map<String,String>)skills.get("skill0");
//        this.skill = skill0.get("skill_name");
//        System.out.println(skill);
//    }
    @SuppressWarnings("unchecked")
    @JsonProperty("skills")
    private void unpackNested(Map<String,Object> skills) {
        Template2 tt1 = new Template2(getId());
        for (int i = 0; i < skills.size(); i++) {
            Map<String,String> skill0 = (Map<String,String>)skills.get("skill"+i);
            this.skill = skill0.get("skill_name");
            this.level = skill0.get("skill_level");

            Skills skillObj = new Skills(skill,level);

            tt1.addSkills(skillObj);
        }
        System.out.println(tt1.skillToHtml());
        tt1.createTemplateFile();
        tt1.writeSkillsToFile();
    }
}

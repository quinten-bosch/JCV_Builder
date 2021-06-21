package domain.model;

import domain.DomainException;

import java.util.ArrayList;

public class CV {

    private int id;
    private PersonalInfo info;
    private ArrayList<WorkExperience> workExperiences;
    private ArrayList<Education> educations;
    private ArrayList<Language> languages;
    private ArrayList<Skill> skills;

    public CV(int id, PersonalInfo info) {
        this.setId(id);
        this.setInfo(info);
        this.setWorkExperiences(new ArrayList<>());
        this.setEducations(new ArrayList<>());
        this.setLanguages(new ArrayList<>());
        this.setSkills(new ArrayList<>());
    }

    public CV() {
        this.setWorkExperiences(new ArrayList<>());
        this.setEducations(new ArrayList<>());
        this.setLanguages(new ArrayList<>());
        this.setSkills(new ArrayList<>());
    }

    public void addWorkExperience(WorkExperience w) {
        if (w == null) throw new DomainException();
        this.workExperiences.add(w);
    }

    public void addEducation(Education w) {
        if (w == null) throw new DomainException();
        this.educations.add(w);
    }

    public void addLanguage(Language w) {
        if (w == null) throw new DomainException();
        this.languages.add(w);
    }

    public void addSkill(Skill w) {
        if (w == null) throw new DomainException();
        this.skills.add(w);
    }

//    public void addObject(Object o) {
//        if (o == null) throw new DomainException();
//        if (o instanceof WorkExperience) this.workExperiences.add((WorkExperience) o);
//        if (o instanceof Education) this.educations.add((Education) o);
//        if (o instanceof Language) this.languages.add((Language) o);
//        if (o instanceof Skill) this.skills.add((Skill) o);
//        else {
//            throw new DomainException("CV ERROR JE PENSE!");
//        }
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PersonalInfo getInfo() {
        return info;
    }

    public void setInfo(PersonalInfo info) {
        this.info = info;
    }

    public ArrayList<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(ArrayList<WorkExperience> workExperiences) {
        this.workExperiences = workExperiences;
    }

    public ArrayList<Education> getEducations() {
        return educations;
    }

    public void setEducations(ArrayList<Education> educations) {
        this.educations = educations;
    }

    public ArrayList<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<Language> languages) {
        this.languages = languages;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }
}

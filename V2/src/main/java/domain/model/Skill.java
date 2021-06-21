package domain.model;

import domain.DomainException;

public class Skill implements HeeftLevel {

    private String naam;
    private Level level;

    public Skill(String naam, Level level) {
        if (naam == null || isEmptyString(naam)) throw new DomainException("Skill naam mag niet leeg zijn!");
        this.setNaam(naam);
        this.setLevel(level);
    }

    public Skill() {

    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public boolean isEmptyString(String s) {
        return s == null || s.trim().isEmpty();
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public Level getLevel() {
        return this.level;
    }
}

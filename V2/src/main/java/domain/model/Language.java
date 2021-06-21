package domain.model;

public class Language implements HeeftLevel {

    private String language;
    private Level level;

    public Language(String language, Level level) {
        this.setLanguage(language);
        this.setLevel(level);
    }

    public Language() {

    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public Level getLevel() {
        return this.level;
    }
}

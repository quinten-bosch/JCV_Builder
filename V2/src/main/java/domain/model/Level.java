package domain.model;

import domain.DomainException;

import java.util.Arrays;
import java.util.List;

public class Level {

    private final String name;
    private final boolean isLanguageLevel;

    private static final List<String> IS_VALID_LEVEL = Arrays.asList("zeer goed", "goed", "redelijk", "matig");
    private static final List<String> IS_VALID_LANGUAGE_LEVEL = Arrays.asList("zeer goed", "goed", "redelijk", "matig", "a1", "a2", "b1", "b2", "c1", "c2");

    public Level(String name, boolean isLanguageLevel) {
        if (name == null || name.trim().isEmpty()) throw new DomainException("Level name mag niet null zijn!");

        if (!isLanguageLevel) {
            if (!IS_VALID_LEVEL.contains(name.toLowerCase())) throw new DomainException("Level name is niet geldig!");
        } else {
            if (!IS_VALID_LANGUAGE_LEVEL.contains(name.toLowerCase())) throw new DomainException("Level name is niet geldig!");
        }
        this.name = name;
        this.isLanguageLevel = isLanguageLevel;
    }

    @Override
    public String toString() {
        return name;
    }
}

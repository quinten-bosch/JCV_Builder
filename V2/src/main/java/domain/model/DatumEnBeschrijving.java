package domain.model;

import domain.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public abstract class DatumEnBeschrijving {

    private Date from, until;
    private String description;
    private String place;
    SimpleDateFormat simpleformat = new SimpleDateFormat("MMMM yyyy", Locale.ENGLISH);

    public DatumEnBeschrijving(Date from, Date until, String description, String place) {
        if (until.before(from)) throw new DomainException("from kan niet na until zijn!");
        this.setFrom(from);
        this.setUntil(until);
        this.setDescription(description);
        this.setPlace(place);
    }

    public DatumEnBeschrijving() {

    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getFrom() {
        return simpleformat.format(from);
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public String getUntil() {
        return simpleformat.format(until);
    }

    public void setUntil(Date until) {
        this.until = until;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

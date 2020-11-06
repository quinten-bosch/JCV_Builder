package domain;

public class WorkExperience {
    String function, functionValue;
    String place, placeValue;
    String employer, employerValue;
    String fromMonth, fromMonthValue, fromYear, fromYearValue;
    String untilMonth, untilMonthValue, untilYear, untilYearValue;
    String description, descriptionValue;

    public WorkExperience(String function, String functionValue, String place, String placeValue, String employer, String employerValue, String fromMonth, String fromMonthValue, String fromYear, String fromYearValue, String untilMonth, String untilMonthValue, String untilYear, String untilYearValue, String description, String descriptionValue) {
        this.function = function;
        this.functionValue = functionValue;
        this.place = place;
        this.placeValue = placeValue;
        this.employer = employer;
        this.employerValue = employerValue;
        this.fromMonth = fromMonth;
        this.fromMonthValue = fromMonthValue;
        this.fromYear = fromYear;
        this.fromYearValue = fromYearValue;
        this.untilMonth = untilMonth;
        this.untilMonthValue = untilMonthValue;
        this.untilYear = untilYear;
        this.untilYearValue = untilYearValue;
        this.description = description;
        this.descriptionValue = descriptionValue;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getFunctionValue() {
        return functionValue;
    }

    public void setFunctionValue(String functionValue) {
        this.functionValue = functionValue;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlaceValue() {
        return placeValue;
    }

    public void setPlaceValue(String placeValue) {
        this.placeValue = placeValue;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getEmployerValue() {
        return employerValue;
    }

    public void setEmployerValue(String employerValue) {
        this.employerValue = employerValue;
    }

    public String getFromMonth() {
        return fromMonth;
    }

    public void setFromMonth(String fromMonth) {
        this.fromMonth = fromMonth;
    }

    public String getFromMonthValue() {
        return fromMonthValue;
    }

    public void setFromMonthValue(String fromMonthValue) {
        this.fromMonthValue = fromMonthValue;
    }

    public String getFromYear() {
        return fromYear;
    }

    public void setFromYear(String fromYear) {
        this.fromYear = fromYear;
    }

    public String getFromYearValue() {
        return fromYearValue;
    }

    public void setFromYearValue(String fromYearValue) {
        this.fromYearValue = fromYearValue;
    }

    public String getUntilMonth() {
        return untilMonth;
    }

    public void setUntilMonth(String untilMonth) {
        this.untilMonth = untilMonth;
    }

    public String getUntilMonthValue() {
        return untilMonthValue;
    }

    public void setUntilMonthValue(String untilMonthValue) {
        this.untilMonthValue = untilMonthValue;
    }

    public String getUntilYear() {
        return untilYear;
    }

    public void setUntilYear(String untilYear) {
        this.untilYear = untilYear;
    }

    public String getUntilYearValue() {
        return untilYearValue;
    }

    public void setUntilYearValue(String untilYearValue) {
        this.untilYearValue = untilYearValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionValue() {
        return descriptionValue;
    }

    public void setDescriptionValue(String descriptionValue) {
        this.descriptionValue = descriptionValue;
    }
}

package domain;

public class PersonalInfo {

    String firstName, lastName, firstNameValue, lastNameValue;
    String city, street, streetNr, zip, cityValue, streetValue, streetNrValue, zipValue;
    String age, birthDate, ageValue, birthDateValue;
    String phoneNumber, email, phoneNumberValue, emailValue;

    Boolean cityActive, streetActive,streetNrActive, zipActive;
    Boolean ageActive, birthDateActive;



    public PersonalInfo(String firstName, String lastName, String phoneNumber, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String generateHTML(){


        String startBlock = "<div class='personalInfo'> ";
        String firstName = "<div class='firstName'> " + this.firstName + " </div> ";
        String lastName = "<div class='lastName'> " + this.lastName+ " </div> ";
        String stopBlock = "</div>";



        return startBlock + firstName + lastName + stopBlock;


    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstNameValue() {
        return firstNameValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        this.firstNameValue = firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNr() {
        return streetNr;
    }

    public void setStreetNr(String streetNr) {
        this.streetNr = streetNr;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCityValue() {
        return cityValue;
    }

    public void setCityValue(String cityValue) {
        this.cityValue = cityValue;
    }

    public String getStreetValue() {
        return streetValue;
    }

    public void setStreetValue(String streetValue) {
        this.streetValue = streetValue;
    }

    public String getStreetNrValue() {
        return streetNrValue;
    }

    public void setStreetNrValue(String streetNrValue) {
        this.streetNrValue = streetNrValue;
    }

    public String getZipValue() {
        return zipValue;
    }

    public void setZipValue(String zipValue) {
        this.zipValue = zipValue;
    }

    public Boolean getCityActive() {
        return cityActive;
    }

    public void setCityActive(Boolean cityActive) {
        this.cityActive = cityActive;
    }

    public Boolean getStreetActive() {
        return streetActive;
    }

    public void setStreetActive(Boolean streetActive) {
        this.streetActive = streetActive;
    }

    public Boolean getStreetNrActive() {
        return streetNrActive;
    }

    public void setStreetNrActive(Boolean streetNrActive) {
        this.streetNrActive = streetNrActive;
    }

    public Boolean getZipActive() {
        return zipActive;
    }

    public void setZipActive(Boolean zipActive) {
        this.zipActive = zipActive;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAgeValue() {
        return ageValue;
    }

    public void setAgeValue(String ageValue) {
        this.ageValue = ageValue;
    }

    public String getBirthDateValue() {
        return birthDateValue;
    }

    public void setBirthDateValue(String birthDateValue) {
        this.birthDateValue = birthDateValue;
    }

    public Boolean getAgeActive() {
        return ageActive;
    }

    public void setAgeActive(Boolean ageActive) {
        this.ageActive = ageActive;
    }

    public Boolean getBirthDateActive() {
        return birthDateActive;
    }

    public void setBirthDateActive(Boolean birthDateActive) {
        this.birthDateActive = birthDateActive;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumberValue() {
        return phoneNumberValue;
    }

    public void setPhoneNumberValue(String phoneNumberValue) {
        this.phoneNumberValue = phoneNumberValue;
    }

    public String getEmailValue() {
        return emailValue;
    }

    public void setEmailValue(String emailValue) {
        this.emailValue = emailValue;
    }
}

package domain;

import java.io.FileWriter;
import java.io.IOException;

public class PersonalInfo {

    String firstName, lastName, firstNameValue, lastNameValue;
    String city, street, streetNr, zip, cityValue, streetValue, streetNrValue, zipValue;
    String age, birthDate, ageValue, birthDateValue;
    String phoneNumber, email, phoneNumberValue, emailValue;

    Boolean cityActive, streetActive,streetNrActive, zipActive;
    Boolean ageActive, birthDateActive;

    public PersonalInfo(String firstName, String lastName, String firstNameValue, String lastNameValue, String city, String street, String streetNr, String zip, String cityValue, String streetValue, String streetNrValue, String zipValue, String age, String birthDate, String ageValue, String birthDateValue, String phoneNumber, String email, String phoneNumberValue, String emailValue, Boolean cityActive, Boolean streetActive, Boolean streetNrActive, Boolean zipActive, Boolean ageActive, Boolean birthDateActive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.firstNameValue = firstNameValue;
        this.lastNameValue = lastNameValue;
        this.city = city;
        this.street = street;
        this.streetNr = streetNr;
        this.zip = zip;
        this.cityValue = cityValue;
        this.streetValue = streetValue;
        this.streetNrValue = streetNrValue;
        this.zipValue = zipValue;
        this.age = age;
        this.birthDate = birthDate;
        this.ageValue = ageValue;
        this.birthDateValue = birthDateValue;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.phoneNumberValue = phoneNumberValue;
        this.emailValue = emailValue;
        this.cityActive = cityActive;
        this.streetActive = streetActive;
        this.streetNrActive = streetNrActive;
        this.zipActive = zipActive;
        this.ageActive = ageActive;
        this.birthDateActive = birthDateActive;
    }

    public String generateAddressHTML(){
        String address = "";
        if(cityActive) {
            address = "   <div class='row'>" +
                    "<div class='col-12'>Address: "+ getCityValue() +"</div>" +
                    "</div>\n";
        }
        if(cityActive && streetActive) {
            address = "   <div class='row'>" +
                    "<div class='col-12'>Address: "+ getStreetValue() + " " + getStreetNrValue() + ", " + getZipValue() + " " + getCityValue() +"</div>" +
                    "</div>\n";
        }
        return address;
    }

    public String generateHTML(){
        String startBlock = "   <div class='row'>" + "\n";
        String name = "        <div class='col-12'><h1>" + getFirstNameValue() + " " + getLastNameValue() +"</h1></div>" + "\n" + "   </div>\n";
        String birth = "";
        if (birthDateActive) {
            birth = "        <div class='col'>BirthDate: " + getBirthDateValue() + "</div>\n";
        }
        String contactInfo = "   <div class='row row-cols-auto'>\n        <div class='col'>E-mail: "+ getEmailValue() +"</div>" + "\n" +
                "        <div class='col'>Gsm: "+ getPhoneNumberValue() +"</div>\n" +
                birth;
        String stopBlock = "   </div>\n" + generateAddressHTML();
        String horizontalLine = "<div class='row'><div class='col-12 border-bottom'></div></div>";

        return startBlock + name + contactInfo + stopBlock + horizontalLine;
    }

    public void writePersonalInfoToFile() {
        String textToAppend = generateHTML();
        String user_dir = System.getProperty("user.dir");
        String out_dir = user_dir + "/out/templates/";
        try {
            FileWriter myWriter = new FileWriter(out_dir+"template1.html", true);
            myWriter.write(textToAppend);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
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

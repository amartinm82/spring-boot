package es.amartinm.rest.model;

public class User {

    private String firstname;
    private String lastname;
    private String email;
    private String organization;

    //constructors
    public User(){
        super();
    }

    public User(String lastname, String firstname, String email, String organization) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.organization = organization;
    }

    //getters and setters
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    //toString
    @Override
    public String toString() {
        return String.format("User with firstName=%s, lastName=%s, email=%s and organization=%s",
                this.firstname,this.lastname,this.email,this.organization);
    }
}

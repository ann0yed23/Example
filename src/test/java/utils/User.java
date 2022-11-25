package utils;

import java.io.IOException;

public class User {
    private String emailName;
    private String emailDomain;
    private String password;
    private int randomNumber = (int) Math.floor(Math.random() * 1000);

    public User() throws IOException {
        this.emailName = PropertiesReader.readProperty("email.name");
        this.emailDomain = PropertiesReader.readProperty("email.domain");
        this.password = PropertiesReader.readProperty("email.password");
    }

    public String getEmailName() {
        return emailName+randomNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getFullEmail() {
        return getEmailName()+emailDomain;
    }
}

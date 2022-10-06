import java.util.*;

public class Professor {
    private String name;
    private String mail;

    public Professor(String nameP, String mailP){
        this.name = nameP;
        this.mail = mailP;
    }

    public void setName(String nameP){
        this.name = nameP;
    }

    public void setMail(String mailP){
        this.mail = mailP;
    }

    public String getName(){
        return this.name;
    }

    public String getMail(){
        return this.mail;
    }

    public String getContact(){
        return "Name: " + this.name + "\n" + "Mail: " + this.mail + "\n";
    }
}
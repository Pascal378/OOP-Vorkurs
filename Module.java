import java.util.*;

public class Module {

    private Professor prof;

    final private int maxStudent = 4; //Maximale Anzahl an Studenten ist 5
    private String name;

    List<String> students = new ArrayList<>();

    public Module(Professor profP, String nameP){
        this.prof = profP;
        this.name = nameP;
    }

    public Professor getProf(){
        return this.prof;
    }

    public String getName(){
        return this.name;
    }

    public void addStudent(String nameP){
        if(this.students.size() < maxStudent){
            this.students.add(nameP);
        }
        else {
            System.out.println("Maximale Anzahl von Studenten für dieses Modul erreicht.\n");
        }
    }

    public void getStudents(){
        for(String i : students){
            System.out.println(i + "\n");
        }
    }

}

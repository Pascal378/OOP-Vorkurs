import java.util.*;

public class University {

    private List<String> students;
    private List<Module> modules;

    public University(List<String> studentP, List<Module> modulesP){
        students = studentP;
        modules = modulesP;
    }

    public void enrollStudent(String studentP){
        students.add(studentP);
    }

    public void addModule(Module modulP){
        modules.add(modulP);
    }

    public List<String> getStudents(){
        return students;
    }

    public List<Module> getModules(){
        return modules;
    }

    public void moduleInfo(){
        int z = 1;

        for (Module i : modules){
            System.out.println(z + ". " + i.getName() + "\n");
            System.out.println(i.getProf().getContact());
            z++;
        }
    }

}

import java.util.*;


public class Main {
    public static void main(String[] args){

        // Create necessary objects
        Professor aProf = new Professor("Aprof","Aprof@uni.de");
        Professor bProf = new Professor("Bprof","Bprof@uni.de");
        Professor cProf = new Professor("Cprof","Cprof@uni.de");

        Module cs = new Module (aProf, "Informatik");
        Module math = new Module (bProf, "Mathematik");
        Module phys     = new Module (cProf, "Physik");

        List<Module> moduleList = new ArrayList<>();
        moduleList.add(cs);
        moduleList.add(math);
        moduleList.add(phys);

        //Just a String Array that helps me to fill the List
        String[] studenten = {"Paul","Kevin", "Björn", "Jan", "Pascal", "Matthias","Markus","Sandra","Ela","Max", "Mirko","Marie", "Giulia","Chris","Fabian" };

        List<String> students = new ArrayList<>();

        for(String i : studenten){
            students.add(i);
        }

        //Create uni with a set of students and modules
        University uni = new University(students, moduleList);


        //Main menu
        System.out.println(
                "Hochschulverwaltung\n" +
                "Bitte wählen Sie aus folgenden Optionen:\n" +
                "1. Informationen über Module abrufen\n" +
                "2. Student immatrikulieren\n" +
                "3. Student eintragen in Modul\n" +
                "4. Kontaktdaten von Professor abfragen\n"
        );

        Scanner myObj = new Scanner(System.in);

        int input = Integer.parseInt(myObj.nextLine());

        if (input == 1){
            uni.moduleInfo();
        } else if (input == 2) {
            System.out.println("Namen des zu immatrikulierenden Studenten angeben: ");
            String newStudent = myObj.nextLine();
            uni.enrollStudent(newStudent);
            System.out.println(newStudent + " wurde immatrikuliert.");

        } else if (input == 3) {
            uni.moduleInfo();

            System.out.println("Bitte wählen Sie das Modul in das Sie sich eintragen möchten: ");
            int moduleChosen = Integer.parseInt(myObj.nextLine());
            System.out.println("Namen des Studenten angeben: ");
            String newStudent = myObj.nextLine();
            uni.getModules().get(moduleChosen-1).addStudent(newStudent);
            System.out.println(newStudent + "wurde in das Modul " + moduleChosen + " eingetragen.");

        } else if (input == 4) {
            for(Module i : uni.getModules()){
                System.out.println(i.getProf().getContact());
            }

        }

    }
}

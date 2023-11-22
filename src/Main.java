import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        School school = new School("Vakkera","KG", LocalDate.of(2002,01,01));
        University university = new University("Manas","KG",LocalDate.of(2000,10,10));
        Collige collige = new Collige("Isito","KG",LocalDate.of(2000,10,01));

        Student student1 = new Student("Mika","TEst","FEMALE",
                LocalDate.of(2010,02,02),school);
        Student student2 = new Student("Mika","TEst","FEMALE",
                LocalDate.of(2009,02,02),collige);
        Student student3 = new Student("Gulum","Abysheva","female",
                LocalDate.of(2003,03,10),university);

        Student []students ={student1,student2,student3};
        student1.getStudentsEducationCenter(students);
        student2.getStudentsEducationCenter(students);
        student3.getStudentsEducationCenter(students);
        student1.getStudentsStudyingYear(students);

    }
}
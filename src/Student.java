import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Student implements Study {
    private String name;
    private String surname;
    private String gender;
    private LocalDate  dateOfStart;
    private EducationCenter educationCenter;

    public Student(String name, String surname, String gender,  LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(EducationCenter educationCenter) {
        this.educationCenter = educationCenter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfStart=" + dateOfStart +
                ", educationCenter=" + educationCenter +
                '}';
    }


    @Override
    public void getStudentsEducationCenter(Student []students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println("имя "+students[i].getName()+" учится "+students[i].getEducationCenter()+"\n");
        }

    }

    @Override
    public void getStudentsStudyingYear(Student []students) {
        LocalDate  localDate = LocalDate.now();
        for (int i = 0; i < students.length; i++) {
            LocalDate localDate1 = students[i].getDateOfStart();
            Period period = Period.between(localDate1,localDate);

            int s = period.getYears();
            int e = period.getMonths();
            int y = period.getDays();

            System.out.println("студент под именим "+students[i].getName()+"  учится в "+students[i].getEducationCenter()+" "+s+" "+e+" "+y);
        }
    }
}

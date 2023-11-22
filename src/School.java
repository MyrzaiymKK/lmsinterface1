import java.time.LocalDate;

public class School extends EducationCenter{
    public School(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", locatedCountry='" + locatedCountry + '\'' +
                ", foundationYear=" + foundationYear +
                '}';
    }
}

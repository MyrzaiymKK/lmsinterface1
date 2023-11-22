import java.time.LocalDate;

public class Collige extends  EducationCenter{
    public Collige(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }

    @Override
    public String toString() {
        return "Collige{" +
                "name='" + name + '\'' +
                ", locatedCountry='" + locatedCountry + '\'' +
                ", foundationYear=" + foundationYear +
                '}';
    }
}

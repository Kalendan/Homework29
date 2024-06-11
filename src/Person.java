import java.util.Objects;

public class Person extends Filter {
    public Person(String name, Useradmintype type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return type == person.type && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name);
    }

    private Useradmintype type;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Useradmintype getType(Useradmintype admin) {
        return type;
    }

    public void setType(Useradmintype type) {
        this.type = type;
    }




}


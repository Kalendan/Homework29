import java.util.Objects;

public class Person  {
    private UserType userType;
    private String name;

    public Person(UserType userType) {
        this.userType = userType;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "userType=" + userType +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return userType == person.userType && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userType, name);
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}







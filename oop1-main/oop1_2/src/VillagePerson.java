public class VillagePerson extends Person{
    public VillagePerson(String name, String surname, int age) {
        super(name, surname, age);
    }
    @Override
    public String Print() {
        return (getName() + " " + getSurname() + " " + getAge());
    }
}

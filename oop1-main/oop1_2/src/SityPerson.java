public class SityPerson extends Person{
    public SityPerson(String name, String surname, int age) {
        super(name, surname, age);
    }
    @Override
    public String Print() {
        return (getName() + " " + getSurname() + " " + getAge());
    }
}



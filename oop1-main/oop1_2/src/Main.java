public class Main {
    public static void main(String[] args) {
        SityPerson sityPerson = new SityPerson("Иван", "Иванов", 18);
        VillagePerson villagePerson = new VillagePerson("Саня", "Помидоры", 35);
        Place place = new Place("Coffee like", "Университетская 1");
        PersonInPlace personInPlace = new PersonInPlace(villagePerson, sityPerson, place);

        System.out.println(personInPlace);
    }
}

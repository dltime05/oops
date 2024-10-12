public class PersonInPlace{
    private Place place;
    private VillagePerson villagePerson;
    private SityPerson sityPerson;

    public PersonInPlace(VillagePerson villagePerson, SityPerson sityPerson, Place place){
        this.place = place;
        this.villagePerson = villagePerson;
        this.sityPerson = sityPerson;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
    public Place getPlace() {
        return place;
    }
    public SityPerson getSityPerson() {
        return sityPerson;
    }
    public VillagePerson getVillagePerson() {
        return villagePerson;
    }


    @Override
    public String toString() {
        return place.toString()  + "\n" + villagePerson.toString() + "\n" + sityPerson.toString() ;
    }
}

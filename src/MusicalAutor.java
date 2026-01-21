public class MusicalAutor extends Person {

    public MusicalAutor(String name, String surname, Gender gender) {
        super(name, surname, gender);
    }

    @Override
    public String toString() {
        return "MusicalAutor{" + "name='" + getName()
                + '\'' + ", surname='" +
                getSurname() + "}";
    }
}

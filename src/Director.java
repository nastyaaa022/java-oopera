
public class Director extends Person {
    private int numberOfShow;

    public Director(String name, String surname, Gender gender, int numberOfShow) {
        super(name, surname, gender);
        this.numberOfShow = numberOfShow;
    }

    @Override
    public String toString() {
        return "Director{" + "name='" + getName()
                + '\'' + ", surname='" +
                getSurname() + "}";
    }

    public int getNumberOfShow() {
        return numberOfShow;
    }

    public void setNumberOfShow(int numberOfShow) {
        this.numberOfShow = numberOfShow;
    }
}

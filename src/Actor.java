import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(getName(), actor.getName()) &&
                Objects.equals(getSurname(), actor.getSurname()) &&
                (height == actor.height);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (getName() != null) {
            hash += getName().hashCode();
        }
        hash *= 31;
        if (getSurname() != null) {
            hash += getSurname().hashCode();
        }
        hash *= 31 + Objects.hashCode(height);
        return hash;
    }

    @Override
    public String toString() {
        return "Actor{" + "name='" + getName()
                + '\'' + ", surname='" +
                getSurname() + '\'' +
                ", height=" + height + "}";
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

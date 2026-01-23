import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Actor actor = (Actor) o;
        return (height == actor.height);
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash *= 31 + Objects.hashCode(height);
        return hash;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", height=(" + height + ")}";
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

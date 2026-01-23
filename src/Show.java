import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors; // список актеров


    public Show(String title, int duration, Director director/*, ArrayList<String> listOfActors*/) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        } else {
            System.out.println("Актёр уже присутствует в списке." + actor);
        }
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void printDirector () {
        System.out.println("Режисер: " + director);
    }

    public void printShow () {
        System.out.println(this.toString());
    }

    public void replaceActor(Actor newActor, String oldSurname) {
        int actorNumber = 0;
        for (Actor actor: listOfActors) {
            if (actor.getSurname().equals(oldSurname)) {
                actorNumber++;
            }
        }

        if (actorNumber > 1) {
            System.out.println("В списке обнаружено более одного актера с такой фамилией, " +
                    "замена не будет произведена.");
            return;
        }

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.getSurname().equals(oldSurname)) {
                listOfActors.set(i, newActor);
                System.out.println("Замена Актера произведена успешно!");
                return;
            }
        }

        System.out.println("Актёр с указанной фамилией не найден в списке.");
    }

    @Override
    public String toString() {
        return "Show{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director +
                ", listOfActors=" + listOfActors +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }


    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }
}

import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        ArrayList<Actor> actorsList = new ArrayList<>();

        actorsList.add(new Actor("Игорь", "Лисичкин", Gender.MALE, 180));
        actorsList.add(new Actor("Мария", "Лаврова", Gender.FEMALE, 160));
        actorsList.add(new Actor("Ирина", "Фамильянова", Gender.FEMALE, 170));

        Director director1 = new Director("Дмитрий", "Валиков", Gender.MALE, 5);
        Director director2 = new Director("Екатерина", "Великая", Gender.FEMALE, 8);

        Choreographer choreographer = new Choreographer("Елена", "Тетрисовна", Gender.MALE);
        MusicalAutor musicalAutor1 = new MusicalAutor("Сергей", "Бзыков", Gender.FEMALE);

        MusicalShow theatricals = new MusicalShow("'Король Лев'", 20, director1, musicalAutor1,
                ".... Текст либретто к спектаклю Король лев");

        Ballet ballet = new Ballet("'Лебединное озеро'", 30, director2, musicalAutor1,
                ".... Текст либретто к лебединному озеру", choreographer);

        Opera opera = new Opera("'Синичка'", 60, director2, musicalAutor1,
                ".... Текстк либретто к опере Синичка ", 15);

        theatricals.addActor(actorsList.get(0));
        theatricals.addActor(actorsList.get(1));
        theatricals.addActor(actorsList.get(2));
        System.out.println("Спектакль: " + theatricals.getTitle());
        System.out.println("Режисер: " + theatricals.getDirector());
        theatricals.printActors();

        System.out.println("______________________________");
        System.out.println(" ");

        ballet.addActor(actorsList.get(1));
        ballet.addActor(actorsList.get(2));
        System.out.println("Балет: " + ballet.getTitle());
        System.out.println("Режисер: " + ballet.getDirector());
        ballet.printActors();
        ballet.PrintTextLibretto();

        System.out.println("______________________________");
        System.out.println(" ");

        opera.addActor(actorsList.get(0));
        System.out.println("Опера: " + opera.getTitle());
        System.out.println("Режисер: " + opera.getDirector());
        opera.printActors();
        opera.PrintTextLibretto();

        System.out.println("______________________________");
        System.out.println(" ");

        System.out.println("Спектакль: " + theatricals.getTitle());
        System.out.println("Режисер: " + theatricals.getDirector());
        System.out.println("Заменить Овчинникова на: " + actorsList.get(2));
        theatricals.replaceActor(actorsList.get(2), "Овчинников");
        //System.out.println("Спектакль :");
        theatricals.printActors();

        System.out.println("______________________________");
        System.out.println(" ");

        ballet.replaceActor(actorsList.get(0), "Лаврова");
        System.out.println("Балет: " + ballet.getTitle());
        System.out.println("Режисер: " + ballet.getDirector());
        System.out.println("Заменить актера с фамилией: Лаврова на актера: " + actorsList.get(0));
        ballet.printActors();
        ballet.PrintTextLibretto();

        System.out.println("______________________________");
        System.out.println(" ");
    }
}

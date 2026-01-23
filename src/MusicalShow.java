public class MusicalShow extends Show {
    protected MusicalAutor musicalAutor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director, MusicalAutor musicalAutor, String librettoText) {
        super(title, duration, director);
        this.musicalAutor = musicalAutor;
        this.librettoText = librettoText;
    }

    public void PrintTextLibretto() {
        System.out.println("Текст либретто: " + librettoText);
    }

    public MusicalAutor getMusicalAutor() {
        return musicalAutor;
    }

    public void setMusicalAutor(MusicalAutor musicalAutor) {
        this.musicalAutor = musicalAutor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", librettoText='" + librettoText + '\'' +
                ", musicalAutor=" + musicalAutor +
                '}';
    }
}

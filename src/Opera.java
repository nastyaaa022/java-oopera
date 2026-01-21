public class Opera extends MusicalShow {
    int choirSize;

    public Opera(String title, int duration, Director director,
                 MusicalAutor musicalAutor, String librettoText, int choirSize) {
        super(title, duration, director, musicalAutor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize()
    {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {

        this.choirSize = choirSize;
    }
}

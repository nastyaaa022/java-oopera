public class Opera extends MusicalShow {
   private int choirSize;

    public Opera(String title, int duration, Director director,
                 MusicalAutor musicalAutor, String librettoText, int choirSize) {
        super(title, duration, director, musicalAutor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize()
    {
        return choirSize;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", choirSize=" + choirSize +
                '}';
    }

    public void setChoirSize(int choirSize) {

        this.choirSize = choirSize;
    }
}

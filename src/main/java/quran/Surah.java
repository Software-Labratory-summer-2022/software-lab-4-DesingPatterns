package quran;

public class Surah {
    private final String[] ayahs;
    private final int id;

    public Surah(String[] ayahs, int id) {
        this.ayahs = ayahs;
        this.id = id;
    }

    String getAyah(int ayahId) {
        return ayahs[ayahId];
    }

    public void SetSurah(int ayahId, String s) {
        this.ayahs[ayahId] = s;
    }


    protected Surah clone() {
        String[] clonedAyahs = new String[ayahs.length];
        for (int i = 0; i < ayahs.length; i++)
            clonedAyahs[i] = ayahs[i];
        return new Surah(
                clonedAyahs,
                this.id
        );
    }
}

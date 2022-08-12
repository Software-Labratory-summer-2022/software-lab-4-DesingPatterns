package quran;

import org.junit.Assert;
import org.junit.Test;


public class QuranTest {
    @Test
    public void testQuranAPIImpl() {
        QuranAPI api = new QuranAPIImpl();
        Surah surah = api.getSurah(1);
        Assert.assertEquals(
                "\uFEFFIn the name of God, the Gracious, the Merciful.",
                surah.getAyah(0)
        );
    }

    @Test
    public void testCachedQuranAPIImpl() {
        QuranAPI api = new CachedQuranAPI(new QuranAPIImpl());
        Surah surah = api.getSurah(1);
        Assert.assertEquals(
                "\uFEFFIn the name of God, the Gracious, the Merciful.",
                surah.getAyah(0)
        );
        surah.SetSurah(0, "MODIFIED BY FIRST CLIENT");
        surah = api.getSurah(1);
        Assert.assertEquals(
                "\uFEFFIn the name of God, the Gracious, the Merciful.",
                surah.getAyah(0)
        );
    }
}

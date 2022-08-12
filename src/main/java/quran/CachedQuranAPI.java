package quran;

import java.util.HashMap;

public class CachedQuranAPI implements QuranAPI {
    private QuranAPI api;
    private HashMap<Integer, Surah> cache;

    public CachedQuranAPI(QuranAPI api) {
        this.api = api;
        this.cache = new HashMap<>();
    }

    @Override
    public Surah getSurah(int surahId) {
        if (!cache.containsKey(surahId)) {
            Surah surah = api.getSurah(surahId);
            cache.put(surahId, surah);
        }
        return cache.get(surahId).clone();
    }
}

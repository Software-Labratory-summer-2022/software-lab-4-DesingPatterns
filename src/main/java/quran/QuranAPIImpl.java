package quran;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class QuranAPIImpl implements QuranAPI {

    public static String getHTML(String urlToRead) throws Exception {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream()))) {
            for (String line; (line = reader.readLine()) != null; ) {
                result.append(line);
                result.append("\n");
            }
        }
        return result.toString();
    }

    public Surah getSurah(int surahId) {
        String url = String.format(
                "https://raw.githubusercontent.com/" +
                        "DanialErfanian/quran-nlp/main/quran_text/english/%03d.txt",
                surahId
        );
        try {
            String[] ayahs = getHTML(url).split("\n");
            return new Surah(ayahs, surahId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

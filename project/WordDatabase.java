import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordDatabase {
    private List<String> easyWords;
    private List<String> mediumWords;
    private List<String> hardWords;

    public WordDatabase() {
        easyWords = new ArrayList<>();
        mediumWords = new ArrayList<>();
        hardWords = new ArrayList<>();

        easyWords.add("oko");
        easyWords.add("kosz");
        easyWords.add("sofa");
        easyWords.add("woda");
        easyWords.add("arbuz");
        easyWords.add("mapa");
        easyWords.add("drzwi");
        easyWords.add("ziemia");
        easyWords.add("kot");
        easyWords.add("pies");

        mediumWords.add("lodówka");
        mediumWords.add("rower");
        mediumWords.add("ananas");
        mediumWords.add("poduszka");
        mediumWords.add("laptop");
        mediumWords.add("butelka");
        mediumWords.add("szklanka");
        mediumWords.add("kwiaty");
        mediumWords.add("rower");
        mediumWords.add("telefon");

        hardWords.add("ambiwalentny");
        hardWords.add("kompulsywny");
        hardWords.add("programowanie");
        hardWords.add("bohater");
        hardWords.add("pszenica");
        hardWords.add("czcionka");
        hardWords.add("reworwer");
        hardWords.add("europarlamentarzysta");
        hardWords.add("dylemat");
        hardWords.add("demokracja");
    }

    public String getRandomWord(String difficulty) {
        Random rand = new Random();
        switch (difficulty) {
            case "Łatwy":
                return easyWords.get(rand.nextInt(easyWords.size()));
            case "Średni":
                return mediumWords.get(rand.nextInt(mediumWords.size()));
            case "Trudny":
                return hardWords.get(rand.nextInt(hardWords.size()));
            default:
                throw new IllegalArgumentException("Nieznany poziom trudności: " + difficulty);
        }
    }

    public void addWord(String difficulty, String word) {
        switch (difficulty) {
            case "Łatwy":
                easyWords.add(word);
                break;
            case "Średni":
                mediumWords.add(word);
                break;
            case "Trudny":
                hardWords.add(word);
                break;
            default:
                throw new IllegalArgumentException("Nieznany poziom trudności: " + difficulty);
        }
    }

    public void removeWord(String difficulty, String word) {
        switch (difficulty) {
            case "Łatwy":
                easyWords.remove(word);
                break;
            case "Średni":
                mediumWords.remove(word);
                break;
            case "Trudny":
                hardWords.remove(word);
                break;
            default:
                throw new IllegalArgumentException("Nieznany poziom trudności: " + difficulty);
        }
    }
}

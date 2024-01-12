package AppToLearn;

public class NewsWord extends BookBase{

    public NewsWord() {super();}

    public NewsWord(String word,
                    String meaning,
                    Character foneticSynbol,
                    String ejemplos
    ) {
        super(word, meaning, foneticSynbol, ejemplos);
    }


    @Override
    public String toString() {
        return "NewsWord{" +
                "word='" + getWord() + '\'' +
                ", meaning='" + getMeaning() + '\'' +
                ", foneticSynbol=" + getFoneticSynbol() +
                ", ejemplos='" + getEjemplos() + '\'' +
                '}';
    }


}

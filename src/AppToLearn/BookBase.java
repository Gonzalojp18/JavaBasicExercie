package AppToLearn;

public class BookBase {

    //Attribute list
    public String word;
    public String meaning;
    public Character foneticSynbol;
    public String ejemplos;

    // Method list

    public void Favorite(){

    }

    public void Traslate(){

    }

    public void AddNote(){

    }

    public void DeleteWord(){

    }

    public BookBase() {
    }

    public String getWord() {
        return word;
    }

    public String getMeaning() {
        return meaning;
    }

    public Character getFoneticSynbol() {
        return foneticSynbol;
    }

    public String getEjemplos() {
        return ejemplos;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public void setFoneticSynbol(Character foneticSynbol) {
        this.foneticSynbol = foneticSynbol;
    }

    public void setEjemplos(String ejemplos) {
        this.ejemplos = ejemplos;
    }

    public BookBase(String word, String meaning, Character foneticSynbol, String ejemplos) {
        this.word = word;
        this.meaning = meaning;
        this.foneticSynbol = foneticSynbol;
        this.ejemplos = ejemplos;
    }


}

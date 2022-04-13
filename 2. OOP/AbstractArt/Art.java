package AbstractArt;

abstract class Art {
    String title;
    String author;
    String description;

    Art(String t, String a, String d){
        this.title = t;
        this.author = a;
        this.description = d;
    }

    abstract void viewArt();
}

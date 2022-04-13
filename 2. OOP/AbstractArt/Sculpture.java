package AbstractArt;

class Sculpture extends Art {
    String material;

    Sculpture(String t, String a, String d, String m) {
        super(t, a, d);
        this.material = m;
    }

    @Override
    void viewArt() {
        System.out.printf("* I am a %s *\n", this.getClass().getSimpleName());
        System.out.println("Title: " + this.title.toUpperCase());
        System.out.println("Author: " + this.author);
        System.out.println("Description: " + this.description);
        System.out.println("Material: " + this.material); 
    }
}

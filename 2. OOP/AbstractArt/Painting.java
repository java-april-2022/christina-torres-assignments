package AbstractArt;

class Painting extends Art {
    String paintType;

    Painting(String t, String a, String d, String p){
        super(t, a, d);
        this.paintType = p;
    }

    @Override
    void viewArt() {
        System.out.printf("* I am a %s *\n*", getClass().getSimpleName());
        System.out.println("Title: " + title.toUpperCase());
        System.out.println("Author: " + author);
        System.out.println("Description: " + description);
        System.out.println("Paint Type: " + paintType);
    }
}

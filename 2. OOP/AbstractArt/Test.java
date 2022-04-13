package AbstractArt;

class Test {
    public static void main(String[] args){
        Painting mona = new Painting("Mona Lisa", "Leonardo da Vinci", "Always staring at the viewer", "Oil");
        mona.viewArt();
        Painting  starNight = new Painting("The Starry Night", "Vincent van Gogh", "East facing view of his asylum", "Oil");
        Sculpture balloonD = new Sculpture("Balloon Dog", "Jeff Koons", "Large blue ballon animal in the shape of a dog.", "Stainless Steel with transparent coating.");
        Sculpture lincoln = new Sculpture("Lincoln Memorial", "Piccirilli Brothers", "19 foot tall depiction of Lincoln contemplation.", "Marble");
        Sculpture ballerina = new Sculpture("Seated Ballerina", "Jeff Koons", "45 foot tall inflatable sculpture.", "Nylon");

        Museum xtina = new Museum("Xtina");
        xtina.setExhibit(mona);
        xtina.setExhibit(starNight);
        xtina.setExhibit(balloonD);
        xtina.setExhibit(lincoln);
        xtina.setExhibit(ballerina);
        xtina.getExhibits();

    }
}

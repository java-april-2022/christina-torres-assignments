// -. .-. .-.   .-. .-. .-. .-. .-.  -  .-. .-..-.  .. .-. 
// \ \ /  \ \ /    \ \ / \ \ / \ \ /  \ \ /    \ \ / \ \ /   
// / \ \  / \ \    / \ \ / \ \ / \ \  / \ \    / \ \ / \ \
// ~ `-~  `-` `-~ `-~ `-~  `-` ~ `-~  `-` `-~ `-~ `-~  `-` 


/******************************************************************
 *                       STRING PRACTICE                          *
 * DNA SEQUENCING:                                                *
 * Composed of a series of nucleotides abbreviated as:            *
 * A : Adenine                                                    *
 * C : Cytosine                                                   *
 * G: Guanine                                                     *
 * T: Thymine                                                     *
 * To be considered a protein:                                    *
 * !. Begins with a "START CODON" : "ATG"                         *
 *      if .indexOf("ATG")                                        *
 * 2. Ends with a "STOP CODON" : "TGA"                            *
 *      if .indexOf("TGA")                                        *
 * 3. In between each codon - must be a sequence of 3 nucleotides *
 *      % 3 == 0                                                  *
******************************************************************/

class Dna {
    String sequence;
    int start;
    int stop;

    Dna(String e) {
        sequence = e;
        System.out.println("DNA SEQUENCE: " + sequence);
        start = e.indexOf("ATG");
        System.out.printf("Start: " + start);
        stop = e.indexOf("TGA");
        System.out.println(" Stop: " + stop);
    }

    void isProtein(){
        if (start != -1 & stop != -1 & (stop - start) % 3 == 0) {
            String protein = sequence.substring(start, stop + 3);
            System.out.println("Protein: " + protein);
        } else {
            System.out.println("not a protein");
        }
    }
    public static void main(String[] args) {
        Dna dna1 = new Dna("ATGCGATACGCTTGA");
        dna1.isProtein();
        Dna dna2 = new Dna("ATGCGATACGTGA");
        dna2.isProtein();
        Dna dna3 = new Dna("ATTAATATGTACTGA");
        dna3.isProtein();
    }

}

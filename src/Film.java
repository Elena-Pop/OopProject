public class Film {
    private String titlu;
    int anProductie;
    double rating;
    boolean potrivitPtCopii;

    public static void setUnText(){
        Film.unText = unText;
    }

    public static String unText="Toate filmele sunt frumoase";


    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getTitlu() {
        return titlu;


        }


    public Film(){
        this.titlu="unknown";
        this.anProductie=2000;
        this.rating= 10;
        this.potrivitPtCopii=false;
        System.out.println("Primul constructor e apelat");
    }

    public void afiseazaDacaEPotrivitPtCopii(){
        if (this.potrivitPtCopii) {
            System.out.println(this.titlu+  "e potrivit pt copii");
        }
        else {
            System.out.println(this.titlu+  "e potrivit pt copii");
        }
    }



    public Film(String titlu, int anProductie, boolean potrivitPtCopii) {
        this.titlu = titlu;
        this.anProductie = anProductie;
        this.potrivitPtCopii = potrivitPtCopii;


    }
    public String afiseazaRating() {
        return (this.titlu + "are rating " + this.rating);
    }
    public static String afiseazaUnText(){
        return(unText);

    }

}


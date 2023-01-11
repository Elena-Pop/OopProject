public class Animal {
    String nume="Unknown";
    String culoare="Unknown";
    boolean vegetarian= false;
    int nrPicioare=4;
    private String undeTraieste;

    public String getUndeTraieste() {
        return undeTraieste;
    }

    public void setUndeTraieste(String undeTraieste) {
        this.undeTraieste = undeTraieste;
    }

    public Animal(int nrPicioare) {
        this.nrPicioare = nrPicioare;
    }

    Animal(){
        nume="Known";
        culoare= "Maro";
        boolean vegetarian=false;

    }

    public Animal(String nume, String culoare, boolean vegetarian) {
        this.nume = nume;
        this.culoare = culoare;
        this.vegetarian = vegetarian;


    }

    public Animal(String nume, String culoare){
        this.nume=nume;
        this.culoare=culoare;
    }

    public Animal(String nume) {
        this.nume = nume;
    }

    public void mananca(){
        System.out.println("Ursul mananca");
    }

    public void doarme(){
        System.out.println("Ursul doarme");
    }
    public void afiseaza(){
        String numeAnimal= "Urs";
        String culoareAnimal="Maro";
        return;
    }
    public void afiseazaNrPicioare() {
        if (nrPicioare < 4) {
            System.out.println("Are doua picioare");
        } else if (nrPicioare == 4) {
            System.out.println("Are patru picioare");
        } else if (nrPicioare > 4) {
            System.out.println("Are alt nr de picioare");
        } else {
            System.out.println("Nu are picioare");
        }
    }






}

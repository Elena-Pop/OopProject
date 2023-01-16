public class Inotator extends Sportiv implements A,B{
    public Abilitate abilitateaInotatorului;

    public Inotator(String proba, String tara) {
        super(proba, tara);
    }

    void seAntreneaza() {
        System.out.println("Inotatorul se antreneaza");
    }
        public void seOdihneste(){
        super.seOdihneste();
            System.out.println("Inotatorul se odihneste");

    }
    public void ceTaraReprezinta(){
        System.out.println("Inotatorul reprezinta" + super.tara);
    }

    @Override
    public void metodaA() {

    }

    @Override
    public void metodaB() {

    }
}

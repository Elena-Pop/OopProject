public class SmartphoneIOS extends Smartphone{
    public SmartphoneIOS(String marca, int pret) {
        super(marca, pret);

    }

    void porneste() {
        System.out.println("Telefonul iOS porneste");

    }
    public void afiseazaMarca(){
        System.out.println("Telefonul este"  +super.marca);
    }



}

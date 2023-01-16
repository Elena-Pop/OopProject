public class Smartphone extends Device{

    @Override
    void porneste() {
        System.out.println("Telefonul porneste");
    }

    @Override
    void seOpreste() {
        System.out.println("Telefonul se opreste");

    }
    String marca= "no name";
     int pret= 2000;

    public Smartphone(String marca, int pret) {
        this.marca = marca;
        this.pret = pret;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }






}

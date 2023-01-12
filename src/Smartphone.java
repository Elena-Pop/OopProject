public class Smartphone extends Device{

    @Override
    void porneste() {
        System.out.println("Telefonul porneste");
    }

    @Override
    void seOpreste() {
        System.out.println("Telefonul se opreste");

    }
    private String marca= "no name";

    public void setMarca(String marca) {
        this.marca = marca;
    }



}

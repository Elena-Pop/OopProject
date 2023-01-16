abstract class Sportiv {
    public String proba;

    public Sportiv(String proba, String tara) {
        this.proba = proba;
        this.tara = tara;
    }

    public String tara;
    abstract void seAntreneaza();
    public void seOdihneste(){
        System.out.println("Sportivul se odihneste");
    }

}

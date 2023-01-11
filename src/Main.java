public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        Book book1 = new Book();

        System.out.println(book1.showAuthorAndTitle());
        //showILoveBooks;

        //creeaza un obiect nou din clasa Oop
        Oop object1 = new Oop();
        Oop object2 = new Oop();
        System.out.println(object1.x);
        object2.x = 10;
        System.out.println(object2.x);

        Car bmw = new Car();
        Car volvo = new Car();
        volvo.culoare = "albastru";
        volvo.anFabricatie = 2020;
        System.out.println(bmw.culoare + " " + bmw.anFabricatie);
        System.out.println(volvo.culoare + " " + volvo.anFabricatie);

        Persoana person1 = new Persoana();
        Persoana person2 = new Persoana("Maria", "Ionescu");
        Persoana person3 = new Persoana();
        System.out.println("Nume: " + person2.nume + " " + person2.prenume);
        System.out.println("Age:  " + person2.age);
        System.out.println("Gen:  " + person2.gen);
        System.out.println(person3.gen);

        Animal ierbivor= new Animal();
        Animal carnivor= new Animal();
        ierbivor.culoare="rosie";
        ierbivor.nume= "Vaca";
        carnivor.nume="Lupul";
        carnivor.culoare="negru";
        System.out.println(ierbivor.nume +" " +ierbivor.culoare);
        System.out.println(carnivor.nume+" "+carnivor.culoare);
        System.out.println(carnivor.nume+" "+"mananca"+" "+"si doarme");

        Animal caine=new Animal(4);
        Animal papagal= new Animal(2);
        Animal caracatita= new Animal(8);
        caracatita.nume= "Lola";
        caracatita.afiseazaNrPicioare();
        caracatita.setUndeTraieste("In apa");
        caracatita.getUndeTraieste();
        System.out.println(caracatita.getUndeTraieste());
        caine.nume="Toto";
        caine.afiseazaNrPicioare();
        caine.setUndeTraieste("Pe uscat");
        caine.getUndeTraieste();
        System.out.println(caine.getUndeTraieste());
        papagal.nume= "Papi";
        papagal.afiseazaNrPicioare();
        papagal.setUndeTraieste("Pe uscat");
        papagal.getUndeTraieste();
        System.out.println(papagal.getUndeTraieste());




        Film film1 = new Film ();
        film1.setTitlu("Avatar2");
        film1.getTitlu();
        film1.rating= 7.9;
        film1.potrivitPtCopii= false;
        Film film2= new Film ("Motanul incaltat", 2021, true);
        System.out.println(film2.rating);
        film2.afiseazaDacaEPotrivitPtCopii();
        film2.rating= 8.8;

        System.out.println(film1.afiseazaRating());
        System.out.println(film2.afiseazaRating());
        System.out.println(film1.afiseazaUnText());


    }
    public static void afiseaza(){
        System.out.println("Afiseaza");
    }




}
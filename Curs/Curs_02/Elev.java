public class Elev {
    // atributele pe care le are un elev
    // in java avem si specificatori de acces
    /*
     * toti specificatorii de acces:
     * - public : permite accesul la un atribut sau o metoda din clasa de oriunde, din orice clasa
     * - private: permite accesul doar din interiorul clasei in care este definit atributul sau metoda
     * - protected: permite accesul din interiorul clasei si din clasele derivate (subclase) sau din acelasi pachet
     * - (fara specificator): permite accesul doar din interiorul aceluiasi pachet 
     */

    private String numeElev;
    private int varstaElev = 10;
    private double medieElev = 5.0;

    // constructorul -> metoda speciala folosita pentru a initializa atributele unui obiect
    public Elev(){
        numeElev = "Daria";
        varstaElev = 16;
        medieElev = 9.75;
    }

    public Elev(String numeElev){
        this.numeElev = numeElev;
    }

    public Elev(String numeElev, int varstaElev, double medieElev){
        this.numeElev = numeElev;
        this.varstaElev = varstaElev;
        this.medieElev = medieElev;
    }

    // metoda toString -> metoda speciala care returneaza o reprezentare sub forma de sir de caractere a obiectului curent
    @Override
    public String toString(){
        return "Nume elev: " + numeElev + ", Varsta elev: " + varstaElev + ", Medie elev: " + medieElev;
    }

    // alte metode

    public void invata(){
        System.out.println("Elevul "  + numeElev + " invata.");
    }

    // getter si setter pentru atribute

    public double getMedieElev(){
        return medieElev;
    }

    // setter pentru medieElev
    public void setMedieElev(double medieElev){
        this.medieElev = medieElev;
    }
}

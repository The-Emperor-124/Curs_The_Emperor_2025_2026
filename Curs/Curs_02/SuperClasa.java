// ce inseamna mostenirea in Java
// O clasa poate mosteni campurile si metodele unei alte clase folosind cuvantul cheie "extends".

public class SuperClasa {
    public int super_x;         // accessibil oriunde
    private int super_y;       // accesibil doar in clasa SuperClasa
    protected int super_z;    // accesibil in pachet si in subclase
    int super_w;            // accesibil doar in pachet (default access)
}

class SubClasa extends SuperClasa {
    public void metoda(SuperClasa obiectSuperClasa){
        super_x = 10;      // accesibil
        // super_y = 20;      // nu este accesibil
        super_z = 30;      // accesibil
        super_w = 40;      // accesibil

        obiectSuperClasa.super_x = 50;   // accesibil
        // obiectSuperClasa.super_y = 60;   // nu este accesibil
        obiectSuperClasa.super_z = 70;   // accesibil
        obiectSuperClasa.super_w = 80;   // accesibil
    }
} 
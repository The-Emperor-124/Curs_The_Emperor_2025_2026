public class ClientElev {
    public static void main(String[] args) {
        // folosirea primului constructor
        Elev elev1 = new Elev();

        System.out.println(elev1.toString());

        elev1.invata();

        // folosirea celui de-al doilea constructor
        Elev elev2 = new Elev("Ionel");

        System.out.println(elev2.toString());

        elev2.setMedieElev(9.5);

        System.out.println("Media elev2: " + elev2.getMedieElev());

        // folosirea celui de-al treilea constructor
        Elev elev3 = new Elev("Ana", 15, 9.5);

        System.out.println(elev3.toString());
    }
}

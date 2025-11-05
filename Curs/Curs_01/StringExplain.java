public class StringExplain{
    public static void main(String [] args) {
        String nume1 = new String("Emperor");
        String nume2 = new String("Emperor");

        String s1 = "Emperor";
        String s2 = "Emperor";

        if(s1 == s2){
            System.out.println("Egale pt s1 si s2");
        }

        // referinte
        if(nume1 == nume2){
            System.out.println("Egale");
        }
        else{
            System.out.println("Nu sunt egale");
        }

        // sa comparam continutul
        if(nume1.equals(nume2)){
            System.out.println("Egale");
        }
        else{
            System.out.println("Nu sunt egale");
        }
    }
}
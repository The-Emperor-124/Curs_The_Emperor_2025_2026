public class ClientSuperclasa {
    public static void main(String [] args){
        SuperClasa obiectSuperClasa = new SuperClasa();
        SubClasa obiectSubClasa = new SubClasa();

        obiectSubClasa.metoda(obiectSuperClasa);


        System.out.println(obiectSubClasa.super_w);
    }
}

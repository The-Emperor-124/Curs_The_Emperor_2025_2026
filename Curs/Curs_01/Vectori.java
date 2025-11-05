public class Vectori{
    public static void main(String [] args){
        int numarRepetari = 5;

        for(int i = 0;  i < numarRepetari; i++){
            System.out.println("Iteratia " + (i + 1));
        }

        // array

        double [] viteze = {0.1, 0.3, -0.7, -0.35}; // are dim 4

        for(int i = 0; i < viteze.length; i++){
            System.out.println("Setam puterea motorului " + (i + 1) + " la " + viteze[i]);
        }

        System.out.println(viteze.length);
    }
}
class Recapitulare{
    public static void main(String[] args) {
        // pentru printare in terminal
        System.out.println("Primul meu program Java!");

        int sumaNumerePare = 0;

        // bucla cu nr finit(stiut de dinainte) de pasi
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                sumaNumerePare = sumaNumerePare + i;
                // sumaNumerePare += i;
            }   
        }

        System.out.println("Suma numerelor pare de la 0 la 9 este: " + sumaNumerePare);

        int i = 10;
        int sumaNumereImpare = 0;

        // bucla cu nr de pasi pe care nu il stim de dinainte
        while(i != 0){
            if(i % 2 != 0){
                sumaNumereImpare += i;
            }

            i--;
        }

        System.out.println("Suma numerelor impare de la 10 la 1 este: " + sumaNumereImpare);

        int c = 3;

        switch(c){
            case 1:
                System.out.println("Cazul 1");
                break;
            case 3:
                System.out.println("Cazul 3");
                break;
            case 2:
                System.out.println("Cazul 2");
                break;
            default:
                System.out.println("Cazul default");
                break;
        }
    }
}
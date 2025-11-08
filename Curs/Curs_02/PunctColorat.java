public class PunctColorat extends Punct{
    private String c;

    public PunctColorat(double x, double y, String c){
        // este apelat intotdeauna prima data in constructorul unei clase care mosteneste alta clasa
        super(x, y);
        this.c = c;
    }

    @Override
    public String toString(){
        // return "Punctul colorat are coordonatele : x = " + x + " si y = " + y + " si culoarea " + c;
        return super.toString() + " si culoarea " + c;
    }
}

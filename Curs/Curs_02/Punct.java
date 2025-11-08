public class Punct {
    private double x;
    private double y;

    public Punct(double x, double y){
        this.x =  x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "Punctul are coordonatele : x = " + x + " si y = " + y;
    }

    public static void main(String[] args) {
        Punct p = new Punct(10, 13);
        System.out.println(p.toString());

        PunctColorat pc = new PunctColorat(10,20, "rosie");
        System.out.println(pc.toString());
    }
}

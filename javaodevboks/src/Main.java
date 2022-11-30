public class Main {
    public static void main(String[] args) {

        Fighter f1=new Fighter("A",15,90,75,30);
        Fighter f2=new Fighter("B",10,100,75,35);

        Match altinKemer=new Match(f1,f2,65,75);

        altinKemer.run();

    }
}
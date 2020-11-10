public class Chicken extends Kød implements Refrigerator{

    @Override
    public void keepFresh() {
        System.out.println("Opbevar i køleskabet");
    }
}

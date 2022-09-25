public class Main {
    public static void main(String[] args) {


        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double totalDouble = (firstDouble + secondDouble) * 100.00;
        System.out.println("My values total = " + totalDouble);
        double firstRemainder = totalDouble % 40.00d;
        System.out.println("firstRemainder = " + firstRemainder);
        boolean newBoolean = (firstRemainder == 0.00d) ? true : false;
        System.out.println("New Boolean = " + newBoolean);
        if (newBoolean = false) {
            System.out.println("got some remainder!");
        }
    }
}
public class cycle {
    public static void main(String[] args) {
        int cycle = 10;
        int cycleWheels = cycle * 2;
        int totalWheels = 47;
        int tricycle = totalWheels - cycleWheels;
        int totalTricycle = tricycle / 3;

        System.out.println("The Total tricycles are: " + totalTricycle );
    }
}

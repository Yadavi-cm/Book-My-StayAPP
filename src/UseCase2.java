
public class UseCase2 {
    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("Book My Stay Application v2.1");
        System.out.println("Room Initialization");
        System.out.println("================================");

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("\nSingle Room Details:");
        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailable);

        System.out.println("\nDouble Room Details:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable);

        System.out.println("\nSuite Room Details:");
        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}

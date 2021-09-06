package lessons.lesson03092021;

public class InterfaceRunner {

    public static void main(String[] args) {
        InterfaceRunner interfaceRunner = new InterfaceRunner();
        interfaceRunner.doFlyAction(new Plane());
        interfaceRunner.doFlyAction(new WarPlane());
        interfaceRunner.doFlyAction(new Zeppelin());
        System.out.println(Flyable.INTERFACE_NAME);
        interfaceRunner.doDescriptionAction(new Plane());
        interfaceRunner.doDescriptionAction(new WarPlane());
        interfaceRunner.doDescriptionAction(new Zeppelin());
        Flyable flyable = new WarPlane();
        InterfaceTwo interfaceTwo = new WarPlane();
        InterfaceOne interfaceOne = new WarPlane();
    }

    private void doFlyAction(Flyable flyable) {
        flyable.fly();
    }

    private void doDescriptionAction(Flyable flyable) {
        flyable.printDescription();
    }
}

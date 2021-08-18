package lessons.lesson17082021;

public class SwitchExample {

    public static void main(String[] args) {
        String s = "new";
        switch (s) {
            case "new" :
                System.out.println("Match");
            case "not a new":
                System.out.println("Do not match");
                break;
            default:
                System.out.println("default");
        }

    }
}

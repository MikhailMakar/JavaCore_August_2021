package lessons.lesson20082021;

public class StringExample {

    private boolean flag;

    public StringExample(boolean flag) {
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }

    public static void main(String[] args) {
        String name = "John";
        name = name.substring(1);
        name = name + " Smith";
        System.out.println(name);
        StringExample stringExample1 = new StringExample(true);
        StringExample stringExample2 = new StringExample(false);
        StringExample runner = new StringExample(false);
        runner.checker(stringExample1);
        runner.checker(stringExample2);
    }

    public void checker(StringExample stringExample) {
        if (stringExample.isFlag()) {
            System.out.println("I am true");
        } else {
            System.out.println("I am not true");
        }
    }
}

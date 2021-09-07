package lessons.lesson12.collections;

import java.util.Stack;

public class StackEx {

  public static void main(String[] args) {
    Stack<String> stringStack = new Stack<>();
    stringStack.push("1");
    stringStack.push("2");
    stringStack.push("3");
    stringStack.push("4");

    System.out.println(stringStack);

    stringStack.peek();
    System.out.println(stringStack);

    stringStack.pop();
    System.out.println(stringStack);
    stringStack.remove("2");

    System.out.println(stringStack);

  }
}

package lessons.lesson12102021.java8.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReference {

    public static void main(String[] args) {
        //static method reference
        //([args]) -> ClassName.staticMethod([args])
        //() -> ClassName.staticMethod
        //ClassName::staticMethod

        Supplier<Thread> threadSupplierLambda = () -> Thread.currentThread();
        Supplier<Thread> reference = Thread::currentThread;

        //instance method reference
        //(arg, [rest...]) -> arg.instanceMethod([rest])
        //(arg) -> arg.instanceMethod()
        //ClassName::instanceMethod

        BiFunction<List<String>, String, Boolean> booleanBiFunctionLambda = (list, str) -> list.add(str);
        BiFunction<List<String>, String, Boolean> biFunctionReference = List::add;

        // expression method reference
        // (args) -> expression.instanceMethod(args)
        // expression::instanceMethod

        Predicate<String> lambdaPredicate = str -> getString().equals(str);
        Predicate<String> predicateReference = getString()::equals;


        // constructor method reference
        // ([args]) -> new ClassName([args])
        // ClassName::new

        Supplier<List<String>> listSupplierLambda = () -> new ArrayList<>();
        Supplier<List<String>> supplierReference = ArrayList::new;
    }

    private static String getString() {
        return "Bonjour!";
    }
}

package lessons.lesson7.pecs;

import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PECSExample<T> {

  T value;
  List<? extends Number> numbers;
  List<? super Integer> integers;
  //  ? param; //error
//  static T staticVal; //error

  public PECSExample() {
  }

  public static void main(String[] args) {

//    T value2 = null; //error
    List<? extends C2> list = new ArrayList<C2>();
    List<? extends C2> list2 = new ArrayList<D1>();
    List<? extends C2> list3 = new ArrayList<D2>();
    List<? extends C2> list4 = new ArrayList<E1>();
    List<? extends C2> list5 = new ArrayList<E2>();
    List<? extends C2> list6 = new ArrayList<E3>();
    List<? extends C2> list7 = new ArrayList<E4>();

//    List<? extends C2> list8 = new ArrayList<B2>(); //error
//    List<C2> listC2 = new ArrayList<D2>(); //error

    final C2 c2 = list.get(0);
    final C2 c21 = list2.get(0);
    final C2 c22 = list3.get(0);
    final A1 a1 = new A1() {

    };
//    list.add(a1); //error
//    list.add(new C2());//error

    List<? super C2> superList = new ArrayList<C2>();
//    List<? super C2> superList1 = new ArrayList<D1>(); //error
    List<? super C2> superList2 = new ArrayList<B2>();
    List<? super C2> superList3 = new ArrayList<B3>();
    List<? super C2> superList4 = new ArrayList<A1>();
    List<? super C2> superList5 = new ArrayList<A2>();
    List<? super C2> superList6 = new ArrayList<A3>();
    List<? super C2> superList7 = new ArrayList<A4>();
    final Object object = superList.get(0);
    final C2 c23 = new C2() {

    };
    superList.add(c23);
  }

  public  <T extends Writer> Number doLogic(List<? extends Comparable<T>> strings) {
    T value3;
    final Comparable<T> comparable = strings.get(0);
    final Comparable<T> comparable1 = strings.get(1);
    comparable.compareTo((T) comparable1);
    System.out.println(strings.get(0));
    return 0;
  }

  public void doLogic1(List<Integer> strings) {
    T value = null;
    System.out.println(strings.get(0));
  }

  private static void doLogic2(List<Long> strings) {
    System.out.println(strings.get(0));
  }

}

class Apecs<T> extends PECSExample<T> {

  @Override
  public void doLogic1(List<Integer> strings) {
    strings.add(1);
  }

  @Override
  public <T1 extends Writer> Integer doLogic(List<? extends Comparable<T1>> strings) {
    return (Integer) super.doLogic(strings);
  }
}
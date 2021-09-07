package lessons.lesson7.pecs;

import lessons.lesson7.enums.Days;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

  public static void main(String[] args) {
    final String value = Days.MONDAY.getValue();
//    List<? extends Doctor> list1 =
//        new ArrayList<MedicalStaff>(); // error
    List<? extends Doctor> list2 =
        new ArrayList<Doctor>();
    List<? extends Doctor> list3 =
        new ArrayList<HeadDoctor>();
    List<? extends Doctor> headOfHospitals =
        new ArrayList<HeadOfHospital>();

    List<? super Doctor> doctorsSuper =
        new ArrayList<MedicalStaff>();
    List<? super Doctor> doctorSuper2 =
        new ArrayList<Doctor>();
    List<? super Doctor> doctorSuper3 =
        new ArrayList<Object>();
//    List<? super Doctor> doctorSuper4 =
//        new ArrayList<HeadDoctor>(); //error

    doctorSuper2.add(new Doctor());
    doctorSuper2.add(new HeadDoctor());
//    doctorsSuper.add(new MedicalStaff()); //error
//    doctorSuper2.add(new MedicalStaff()); //error

    final Doctor doctor = headOfHospitals.get(0);
  }

  private static void soutDoctors(List<? extends Doctor> doctors) {
    final Doctor doctor = doctors.get(0);
//    doctors.add(new Doctor());//error
  }

  private static void printDocs(List<? super Doctor> list) {
//    list.add(new MedicalStaff()); //error
  }

  //PECS - Producer Extends, Consumer Super
  private static void copy(List<? super Doctor> dest, List<? extends Doctor> source) {
    for (int i = 0; i < source.size(); i++) {
      dest.add(source.get(i));
    }
  }
}

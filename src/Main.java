import java.util.*;

public class Main {
    public static void main(String[] args) {
        people();
    }
    public static void people(){
        Phonebook phonebook = new Phonebook();
        Phonebook.add("Иван","11111");
        Phonebook.add("Василий","22222");
        Phonebook.add("Евгений","33333");
        Phonebook.add("Николай","44444");
        Phonebook.add("Иван","55555");
        Phonebook.add("Николай","66666");
        Phonebook.add("Иван","77777");

        System.out.println(Phonebook.getAll());


    }



}





//public static void main(String[] args) {
//    Phonebook p1 = new Phonebook("Иван", "Иванов", 11111);
//    Phonebook p2 = new Phonebook("Василий", "Васильевич", 22222);
//    Phonebook p3 = new Phonebook("Евгений", "Евгениевич", 33333);
//    Phonebook p4 = new Phonebook("Николай", "Николаевич", 44444);
//    Phonebook p5 = new Phonebook("Иван", "Иванов", 55555);
//    Phonebook p6 = new Phonebook("Николай", "Николаевич", 66666);
//    Phonebook p7 = new Phonebook("Николай", "Николаевич", 77777);
//
//    Set<Phonebook> set = new HashSet<>();
//    set.add(p1);
//    set.add(p2);
//    set.add(p3);
//    set.add(p4);
//    set.add(p5);
//    set.add(p6);
//    set.add(p7);
//
//    System.out.println(set);
//
//}
//
//static void task1(){
//    Pasports_sem5 pasportsSem5 = new Pasports_sem5();
//    pasportsSem5.add("123456","Иванов");
//    pasportsSem5.add("321456","Васильев");
//    pasportsSem5.add("234561","Петрова");
//    pasportsSem5.add("234432","Иванов");
//    pasportsSem5.add("654321","Петрова");
//    pasportsSem5.add("345678","Иванов");
//
//    System.out.println(pasportsSem5.getAll());
//    System.out.println(pasportsSem5.getByLastName("Иванов"));
//    System.out.println(pasportsSem5.getByPassNum("234561"));
//}

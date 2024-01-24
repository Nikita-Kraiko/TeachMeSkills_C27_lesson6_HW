package com.tms.lesson6_HW.Runner;

import com.tms.lesson6_HW.Service.CreditCard;
import com.tms.lesson6_HW.Student.Student;

public class Run {
    public static void main(String[] args) {
        //Task1
        CreditCard card1 = new CreditCard("Q123", 1000.1);
        CreditCard card2 = new CreditCard("R811", 973);
        CreditCard card3 = new CreditCard("R021", 12.32);

        card1.addMoney(249.9);
        card2.addMoney(27);
        card3.withdrawMoney(13);

        card1.showInfo();
        card2.showInfo();
        card3.showInfo();
        System.out.println("-------");

        //Task2
        Student st1 = new Student("Артем", "Астапчик", "A001", "C27");
        Student st2 = new Student("Алина", "Илькевич", "A002", "C27");
        Student st3 = new Student("Анастасия", "Иргалиева", "A003", "C27");
        Student st4 = new Student("Артем", "Каральчук", "A004", "C27");
        Student st5 = new Student("Никита", "Крайко", "A005", "C27");
        Student st6 = new Student("Олег", "Манеев ", "A006", "C27");
        Student st7 = new Student("Иван", "Михновецкий", "A007", "C27");
        Student st8 = new Student("Кирилл", "Паляница", "A008", "C27");
        Student st9 = new Student("Руслан", "Рябухин", "A009", "C27");
        Student st10 = new Student("Евгений", "Саркисов", "A010", "C27");
        Student st11 = new Student("Павел", "Свинко", "A011", "C27");
        Student st12 = new Student("Руслан", "Семенчик", "A012", "C27");
        Student st13 = new Student("Руслан", "Третьяк", "A013", "C27");
        Student st14 = new Student("Александр", "Хамицкий", "A014", "C27");
        Student st15 = new Student("Даниил", "Чаботько", "A015", "C27");
        Student st16 = new Student("Алексей", "Шубин", "A016", "C27");
        Student st17 = new Student("Владислав", "Колос", "A017", "C27");


        Student[] arrStudent = new Student[]{st1, st2, st3, st4, st5, st6, st7, st8, st9, st10, st11, st12, st13, st14, st15, st16, st17};
        for (Student student: arrStudent){
            System.out.println(student.name + " " + student.surname + " " + student.passNum + " " + student.groupName);
        }
    }
}

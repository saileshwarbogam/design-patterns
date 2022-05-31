package com.sailesh.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {

        Student student1 = new Student(1,"Sailesh","CSE");

        System.out.println(student1.toString());;

        System.out.println("\n");

        Student student2 = (Student)student1.getClone();

        student2.setId(2);

        student2.setName("Mahesh");

        System.out.println(student2.toString());;
    }
}

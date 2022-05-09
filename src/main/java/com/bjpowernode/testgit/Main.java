package com.bjpowernode.testgit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Git1!");

        Student student = new Student();
        student.setId(1001);
        student.setName("东方不败");
        student.setAge(27);
        student.setAddress("日月神教");
        System.out.println(student);


        System.out.println("谎言和誓言的区别!");
        System.out.println("master");
        System.out.println("hot-fix");
        System.out.println("push test");
    }
}

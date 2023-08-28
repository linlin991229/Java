package com.lin.design_patterns.iterator;

public class Main {
    public static void main(String[] args) {
        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("张三", "001"));
        studentAggregate.addStudent(new Student("李四", "002"));
        studentAggregate.addStudent(new Student("王五", "003"));
        StudentIterator studentIterator = studentAggregate.getStudentIterator();

        while (studentIterator.hasNext()){
            Student next = studentIterator.next();
            System.out.println(next);
        }
    }
}

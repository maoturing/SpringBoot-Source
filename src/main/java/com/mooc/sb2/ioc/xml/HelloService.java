package com.mooc.sb2.ioc.xml;

import org.springframework.stereotype.Component;

/**
 * @author mao  2021/3/8 23:59
 */
public class HelloService {
    private Student student;

    private Animal animal;

    public String hello() {

//        return student.toString();
        return "hello" + animal.getName();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}

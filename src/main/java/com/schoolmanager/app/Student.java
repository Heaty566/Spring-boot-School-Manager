package com.schoolmanager.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;

@Entity
@Table(name = "student")
public class Student implements Comparable<Student> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "name")
    String name;

    @NotNull
    @Max(value = 120)
    @Min(value = 1)
    @Column(name = "age")
    int age;

    @NotNull
    @Max(value = 2050)
    @Min(value = 1950)
    @Column(name = "year")
    int year;

    @NotNull
    @Max(value = 10)
    @Min(value = 0)
    @Column(name = "math")
    double math;

    @NotNull
    @Max(value = 10)
    @Min(value = 0)
    @Column(name = "physical")
    double physical;

    @NotNull
    @Max(value = 10)
    @Min(value = 0)
    @Column(name = "chemistry")
    double chemistry;

    @Override
    public String toString() {

        return "Name:" + this.getName() + "\nAge: " + this.getAge() + "\nYear: " + this.getYear() + "\nMath: "
                + this.getMath() + "\nChemistry: " + this.getChemistry() + "\nPhysical: " + this.getPhysical();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysical() {
        return physical;
    }

    public void setPhysical(double physical) {
        this.physical = physical;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public String getGpa() {
        return String.format("%.2f", this.getScore());
    }

    public double getScore() {
        double total = this.chemistry + this.math + this.physical;
        return total / 3;
    }

    @Override
    public int compareTo(Student obj) {
        double totalCurrent = this.chemistry + this.math + this.physical;
        double total = obj.chemistry + obj.math + obj.physical;
        double compare = total - totalCurrent;
        return (int) Math.round(compare);
    }

}
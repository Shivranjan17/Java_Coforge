package com.coforge;

public class Student {

    private int id;
    private String name;
    private int m1;
    private int m2;
    private int m3;
    private String mobile;
    private String email;
    private String branch;

    public Student(int id, String name, int m1, int m2, int m3,
                   String mobile, String email, String branch) {

        this.id = id;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.mobile = mobile;
        this.email = email;
        this.branch = branch;
    }

    public void generateReport() {

        int total = m1 + m2 + m3;
        double avg = total / 3.0;

        System.out.println("Student Id : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Branch     : " + branch);
        System.out.println("Mobile     : " + mobile);
        System.out.println("Email      : " + email);
        System.out.println("Total      : " + total);
        System.out.println("Average    : " + avg);
        System.out.println("-------------------------");
    }
}
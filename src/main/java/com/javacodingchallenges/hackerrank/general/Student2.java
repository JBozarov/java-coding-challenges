package com.javacodingchallenges.hackerrank.general;

import java.util.*;

class Student implements Comparator<Student> {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compare(Student s1, Student s2) {

        if (s1.getCgpa() == s2.getCgpa()) {
            if (s1.getFname().compareTo(s2.getFname()) == 0) {
                if (s1.getId() > s2.getId()) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (s1.getFname().compareTo(s2.getFname()) > 0 ) {
                return 1;
            } else {
                return -1;
            }

        } else if (s1.getCgpa() < s2.getCgpa()) {
            return 1;
        }
        return -1;
    }
}


//Complete the code
class Solution {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
//
//        List<Student> studentList = new ArrayList<Student>();
//        while (testCases > 0) {
//            int id = in.nextInt();
//            String fname = in.next();
//            double cgpa = in.nextDouble();
//
//            Student st = new Student(id, fname, cgpa);
//            studentList.add(st);
//
//            testCases--;
//        }

        Student student1 = new Student(33, "Rumpa", 3.36);
        Student student2 = new Student(85, "Ashis", 3.98);
        Student student3 = new Student(56, "Samiha", 3.75);
        Student student4 = new Student(19, "Samara", 3.75);
        Student student5 = new Student(22, "Fahim", 3.75);
        Student student6 = new Student(23, "Fahim", 3.75);


        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);

        Collections.sort(studentList, new Student());

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}

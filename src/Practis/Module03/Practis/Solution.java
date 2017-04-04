package Practis.Module03.Practis;

import java.util.Date;

/**
 * Created by user on 15.03.2017.
 */
public class Solution {
    public static void main(String[] args) {

        Date startDate = new Date(2016,5,25);
        Date startDate1 = new Date(2017,5,26);
        Date startDate2 = new Date(2017,5,27);
        Date startDate3 = new Date(2017,5,28);
        Date startDate4 = new Date(2017,5,29);


        Course course =  new Course(startDate,"Course1");
        Course course1 = new Course("Course_2",20,"Pipeck");
        Course course2 = new Course("Zenia",100,"Vasia");
        Course course3 = new Course(startDate3,"Course3");
        Course course4 = new Course(startDate4,"Course4");



        Course[] coursesTaken = new Course[3];
        coursesTaken[0] = new Course(startDate,"sss");
        coursesTaken[1] = course1;
        coursesTaken[2] = course2;

        Student student = new Student("Dudu",coursesTaken);

        ColledgStudent colledgStudent = new ColledgStudent("Vasia","Pupkin",5,"Fufu",10,6164L);


        System.out.println(colledgStudent);


    }
}

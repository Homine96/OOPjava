package Seminar_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import Seminar_3.Interfaces.AfterSchool;
import Seminar_3.Interfaces.InLove;
import Seminar_3.Interfaces.Playable;
import Seminar_3.Interfaces.Smokable;
import Seminar_3.Students.PrimaryStudent;
import Seminar_3.Students.SecondaryStudent;
import Seminar_3.Students.SeniorStudent;
import Seminar_3.Students.Base.Student;

public class Program {
    public static void main(String[] args) {
        List <Student> students = new ArrayList<>();
        students.add(new SecondaryStudent());
        students.add(new PrimaryStudent());
        students.add(new SeniorStudent());

        Collections.sort(students);

        for (Student student : students) {
            demo(student);
            System.out.println("-----");
        }
    }

    public static void demo(Student obj) {
        System.out.println(obj);
        obj.study();
        if (obj instanceof Playable) {
            ((Playable) obj).playing();
        }
        if (obj instanceof Smokable) {
            ((Smokable) obj).startSmoking();
            ((Smokable) obj).smoking();
            ((Smokable) obj).stopSmoking();
        }
        if (obj instanceof InLove) {
            ((InLove) obj).fallInLove();
        }
        if (obj instanceof AfterSchool) {
            ((AfterSchool) obj).afterSchool();
        }
    }
}
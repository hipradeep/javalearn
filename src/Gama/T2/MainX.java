package Gama.T2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainX {
    public static void main(String[] args) {
        List<Student> eList = getListOfStudents();

        Map<String, Integer> mapNameToAge = eList.stream()
                .collect(Collectors.toMap(Student::getName
                        ,Student::getAge
                        ,(oldValue,newValue)->oldValue
                ));
        System.out.println(mapNameToAge);
    }
    private static List<Student> getListOfStudents(){

        List<Student> listOfStudents = new ArrayList<>();
        Student st1 = new Student("Stenny",24);
        Student st2 = new Student("Rucha",22);
        Student st3 = new Student("Vihaan",21);
        Student st4 = new Student("Stenny",22);

        listOfStudents.add(st1);
        listOfStudents.add(st2);
        listOfStudents.add(st3);
        listOfStudents.add(st4);

        return listOfStudents;
    }
}

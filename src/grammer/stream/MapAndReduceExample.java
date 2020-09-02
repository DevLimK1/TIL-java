package grammer.stream;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("임경원", 10),
                new Student("임주원", 20),
                new Student("원더우먼", 30)
        );

        double avg= studentList.stream()
                .mapToInt(Student::getScore)//중간처리 -> 학점 Stream
                .average() //최종처리 -> 평균 구함
                .getAsDouble();

        System.out.println("평균 점수:"+avg);
    }
}

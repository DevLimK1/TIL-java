package grammer.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//스트림 병렬 예제
public class ParallelExample {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("홍길동","임주원","임경원","아루","슈퍼맨");

        //순차 처리
        Stream<String> stream=list.stream();
//        stream.forEach(name->print(name));
        stream.forEach(ParallelExample::print);//람다 메서드 참조

        System.out.println("--------------");

        //병렬 처리
        Stream<String> parallelStream=list.parallelStream();
        parallelStream.forEach(ParallelExample::print);
    }

    private static void print(String name) {
        System.out.println(name+":"+Thread.currentThread().getName());//현재 쓰레드 이름
    }
}

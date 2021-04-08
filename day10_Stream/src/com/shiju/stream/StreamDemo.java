package com.shiju.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shiju
 * @date 2021/04/02 10:45
 **/
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("张无忌","张翠山","赵四","刘能","谢广坤","蔡徐坤"));
        list.stream().filter(s -> s.startsWith("张") && s.length() == 3)
                .forEach(s -> System.out.println(s));
    }
}

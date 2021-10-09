package com.znl.java.lambdaz;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package: com.znl.java.lambdaz
 * @ClassName: LambdaTest
 * @Author Frank
 * @Data 2021-08-08-0:32
 * @Description:
 */
public class LambdaTest {

    public static void main(String[] args) {

        Person p = ()->{
            System.out.println("eat");
        };
        p.eat();
    }

}

@FunctionalInterface
interface Person{
    void eat();
}



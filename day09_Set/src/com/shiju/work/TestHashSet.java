package com.shiju.work;

import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 * 五、双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
 * 红色球号码从1—33中选择；蓝色球号码从1—16中选择；
 * 请随机生成一注双色球号码。（要求同色号码不重复）
 *
 * @author shiju
 * @date 2021/03/31 21:22
 **/
public class TestHashSet {
    public static void main(String[] args) {
        HashSet<Integer> red = new HashSet<>();
        Random r = new Random();
        while (red.size() < 6) {
            red.add(r.nextInt(33) + 1);
        }
        int blueNumber = r.nextInt(16) + 1;
        String redNumber = "";
        for (Integer i : red) {
            redNumber += i;
        }
        String number = redNumber + blueNumber;
        System.out.println("本期双色球号码为:" + number);
    }
}

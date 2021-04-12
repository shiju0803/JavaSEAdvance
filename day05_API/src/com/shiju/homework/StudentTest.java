package com.shiju.homework;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : StudentTest
 * @Date 2021/3/26 18:59
 * @Description:
 * 有以下学员信息：
		"张三","男",20,79.5
		"李四","女",21,80.2
		"王五","男",22,77.9
		"周六","男",20,55.8
		"赵七","女",21,99.9
	请定义学员类，属性：姓名、性别、年龄、分数
	请编写测试类，创建5个对象，分别存储上述值，并计算5名学员的“平均分”(四舍五入到小数点后2位)。
 **/
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("张三","男",20,79.5);
        Student s2 = new Student("李四","女",21,80.2);
        Student s3 = new Student("王五","男",22,77.9);
        Student s4 = new Student("周六","男",20,55.8);
        Student s5 = new Student("赵七","女",21,99.9);
        double sum = s1.getScore() + s2.getScore() + s3.getScore() + s4.getScore() + s5.getScore();
        BigDecimal avg = BigDecimal.valueOf(sum).divide(BigDecimal.valueOf(5),2, RoundingMode.HALF_UP);
        System.out.println("平均数: " + avg);
    }
}

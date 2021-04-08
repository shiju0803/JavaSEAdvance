package com.shiju.test;

import com.shiju.dao.PetDao;
import com.shiju.domain.Pet;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author 时距
 * @PackageName:com.shiju.test
 * @ClassName : PetManage
 * @Date 2021/3/17 20:36
 * @Description:
 **/
public class PetManage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PetDao dao = new PetDao();
        ArrayList<Pet> list = new ArrayList<>();
        lo:
        while (true) {
            System.out.println("----欢迎使用宠物管理系统------");
            System.out.println("     へ　　　　　／|");
            System.out.println("    /＼7　　　 ∠＿/");
            System.out.println("　 /　│　　 ／　／");
            System.out.println("  /　│　　 ／　／");
            System.out.println("  │　Z ＿,＜　／　　 /`ヽ");
            System.out.println("  │　　　　　ヽ　　 /　　〉");
            System.out.println("　 Y　　　　　`　  /　　/");
            System.out.println("　ｲ●　､　●　　⊂⊃ 〈　　/");
            System.out.println(" () へ　　　　|　  ＼〈");
            System.out.println("　　>ｰ ､_　 ィ　 │ ／／");
            System.out.println("　 / へ　　 /　ﾉ＜| ＼＼");
            System.out.println("　 Y　　　　　`　 /　　/");
            System.out.println("　 ヽ_ﾉ　　(_／　 │／／");
            System.out.println("　　7　　　　　　　|／");
            System.out.println("　　＞―r￣￣`ｰ―＿)");
            System.out.println("\t1.添加宠物");
            System.out.println("\t2.删除宠物");
            System.out.println("\t3.修改宠物");
            System.out.println("\t4.查看所有宠物");
            System.out.println("\t5.退出系统");
            System.out.println("请输入你的选择o(*￣▽￣*)ブ皮卡皮卡~:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("添加宠物,φ(゜▽゜*)♪皮卡~");
                    dao.addPet(list);
                    break;
                case 2:
                    System.out.println("删除宠物,(╯°□°）╯︵ ┻━┻皮卡丘~");
                    dao.deletePet(list);
                    break;
                case 3:
                    System.out.println("修改宠物,(づ￣ 3￣)づ皮~");
                    dao.updatePet(list);
                    break;
                case 4:
                    System.out.println("查看所有宠物,༼ つ ◕_◕ ༽つ");
                    dao.queryPet(list);
                    break;
                case 5:
                    System.out.println("欢迎再次使用(╯‵□′)╯炸弹！•••*～●");
                    break lo;
                default:
                    System.out.println("你的输入有误,请重新输入( *^-^)ρ(*╯^╰)");
                    break;
            }
        }
    }
}

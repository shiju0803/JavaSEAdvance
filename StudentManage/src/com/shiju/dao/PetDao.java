package com.shiju.dao;

import com.shiju.domain.Pet;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @Author 时距
 * @PackageName:com.shiju.dao
 * @ClassName : PetDao
 * @Date 2021/3/17 21:21
 * @Description:
 **/
public class PetDao {
    Scanner sc = new Scanner(System.in);
    public void addPet(ArrayList<Pet> list) {
        String no;
        System.out.println("请输入编号:");
        no = sc.next();
        int index = getIndex(list,no);
        if(index == -1){

        }else{

        }
    }

    public void deletePet(ArrayList<Pet> list) {
    }

    public void updatePet(ArrayList<Pet> list) {
    }

    public void queryPet(ArrayList<Pet> list) {
    }
    public int getIndex(ArrayList<Pet> list,String str){
        //宠物不存在
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Pet p = list.get(i);
            if(str.equals(p.getNo())){
                index = i;
            }
        }
        return index;
    }
}

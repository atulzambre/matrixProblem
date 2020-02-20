package com.matrixproblem.util;

import com.matrixproblem.entity.RoleTableModel;

import java.util.HashMap;

public class test {

    public static void main(String[] args) {
        HashMap<RoleTableModel,String> roleTableModelStringHashMap=new HashMap<>();
        RoleTableModel roleTableModel= new RoleTableModel();
        roleTableModel.setAccessTable("atul zambre");
        roleTableModel.setUserRole("admin");
        roleTableModelStringHashMap.put(roleTableModel,"yes");

        RoleTableModel roleTableModel1= new RoleTableModel();
        roleTableModel1.setUserRole("admin");
        roleTableModel1.setAccessTable("atul zambre");
        System.out.print(roleTableModelStringHashMap.get(roleTableModel1));
    }
}

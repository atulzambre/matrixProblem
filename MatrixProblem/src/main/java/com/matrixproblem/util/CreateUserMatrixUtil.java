package com.matrixproblem.util;

import com.matrixproblem.entity.RoleTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Component
public class CreateUserMatrixUtil {

    public static HashMap<RoleTableModel, String> roleTableModelStringHashMap = new HashMap<>();

    @Autowired
    private UserRoleProperties userRoleProperties;

    @Bean
    private void setRoleTableModelStringHashMap() {
        String properties = userRoleProperties.getUserRoleProperties();
        List<String> stringToken = Arrays.asList(properties.split(":"));
        for (String str : stringToken) {
            String strings[] = str.split(",");
            RoleTableModel roleTableModel = new RoleTableModel();
            roleTableModel.setUserRole(strings[0]);
            roleTableModel.setAccessTable(strings[1]);
            roleTableModelStringHashMap.put(roleTableModel, strings[2]);
        }
    }
}


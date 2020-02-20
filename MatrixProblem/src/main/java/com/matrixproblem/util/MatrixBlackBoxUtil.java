package com.matrixproblem.util;

import com.matrixproblem.entity.RoleTableModel;
import com.matrixproblem.entity.UserRoleEntity;
import com.matrixproblem.repository.UserRoleRepository;
import com.matrixproblem.service.SaveUserRoleService;
import com.sun.org.apache.bcel.internal.generic.ATHROW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Component
public class MatrixBlackBoxUtil {

    @Autowired
    private SaveUserRoleService userRoleRepository;

    public Boolean getUserValidation(String user, String table, String access) {


        RoleTableModel roleTableModel = new RoleTableModel();
        UserRoleEntity role=userRoleRepository.getUser(user);
        roleTableModel.setUserRole(role.getUser_role());
        roleTableModel.setAccessTable(table);
        String accessCheck = CreateUserMatrixUtil.roleTableModelStringHashMap.get(roleTableModel);
        if (accessCheck.isEmpty() || !accessCheck.contains(access)) {
            return Boolean.FALSE;
        } else {
            return Boolean.TRUE;
        }
    }
}

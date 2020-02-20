package com.matrixproblem.service;

import com.matrixproblem.entity.UserRoleEntity;

public interface SaveUserRoleService {

    public String saveUserRole(UserRoleEntity userRoleEntity);

    public UserRoleEntity getUser(String user);
}

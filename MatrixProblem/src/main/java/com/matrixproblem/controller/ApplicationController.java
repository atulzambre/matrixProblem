package com.matrixproblem.controller;

import com.matrixproblem.entity.CheckAccessModel;
import com.matrixproblem.entity.UserRoleEntity;
import com.matrixproblem.service.SaveUserRoleService;
import com.matrixproblem.util.MatrixBlackBoxUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @Autowired
    private SaveUserRoleService saveUserRoleService;

    @Autowired
   private MatrixBlackBoxUtil matrixBlackBoxUtil;

    @GetMapping("/ping")
    public String getPing() {
        return "Successfull!";
    }

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody UserRoleEntity userRoleEntity) {
        return saveUserRoleService.saveUserRole(userRoleEntity);
    }

    @PostMapping("/checkAccess")
    public Boolean checkUserAccess(@RequestBody CheckAccessModel checkAccessModel) {


        return matrixBlackBoxUtil.getUserValidation(checkAccessModel.getUser(), checkAccessModel.getTable(), checkAccessModel.getAccess());
    }
}

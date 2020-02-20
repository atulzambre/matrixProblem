package com.matrixproblem.serviceimpl;

import com.matrixproblem.entity.UserRoleEntity;
import com.matrixproblem.repository.UserRoleRepository;
import com.matrixproblem.service.SaveUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveUserRoleServiceImpl implements SaveUserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public String saveUserRole(UserRoleEntity userRoleEntity) {
        userRoleRepository.save(userRoleEntity);
        return "user entity saved";
    }

    @Override
    public UserRoleEntity getUser(String user) {
        UserRoleEntity role=userRoleRepository.findByuserid(user);
        return role;
    }


}

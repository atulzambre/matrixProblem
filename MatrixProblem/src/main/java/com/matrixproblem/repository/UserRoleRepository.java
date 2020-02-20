package com.matrixproblem.repository;

import com.matrixproblem.entity.UserRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRoleEntity, String> {

    public UserRoleEntity findByuserid(String user);
}

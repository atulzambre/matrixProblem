package com.matrixproblem.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserRoleProperties {

    @Value("${user.role}")
    private String userRoleProperties;

    public String getUserRoleProperties() {
        return userRoleProperties;
    }

    public void setUserRoleProperties(String userRoleProperties) {
        this.userRoleProperties = userRoleProperties;
    }
}

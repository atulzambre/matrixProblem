package com.matrixproblem.entity;

import org.springframework.util.StringUtils;

import java.math.BigInteger;
import java.util.Objects;

public class RoleTableModel {

    private String userRole;
    private String accessTable;

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getAccessTable() {
        return accessTable;
    }

    public void setAccessTable(String accessTable) {
        this.accessTable = accessTable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoleTableModel)) return false;
        RoleTableModel that = (RoleTableModel) o;
        return Objects.equals(getUserRole(), that.getUserRole()) &&
                Objects.equals(getAccessTable(), that.getAccessTable());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserRole(), getAccessTable());
    }
}

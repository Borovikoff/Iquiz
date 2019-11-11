package com.iquiz.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "roles", schema = "netcrecker")
public class RolesEntity {
    private int idRoles;
    private String role;

    @Id
    @Column(name = "id_roles")
    public int getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(int idRoles) {
        this.idRoles = idRoles;
    }

    @Basic
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RolesEntity that = (RolesEntity) o;

        if (idRoles != that.idRoles) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRoles;
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }
}

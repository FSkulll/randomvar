package edu.randomvar.mvc.domain;

/**
 * Created by FSkul on 29.10.2016.
 */
import javax.persistence.*;


@Entity(name = "user_roles")
@Table(name = "user_roles")
public class UserRoles {
    private int userRoleId;
    private String role;
    private String username;

    @Id
    @Column(name = "user_role_id")
    @GeneratedValue
    public int getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    @Basic
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRoles userRoles = (UserRoles) o;

        if (userRoleId != userRoles.userRoleId) return false;
        if (role != null ? !role.equals(userRoles.role) : userRoles.role != null) return false;
        if (username != null ? !username.equals(userRoles.username) : userRoles.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userRoleId;
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }
}

package org.example.sweater.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name ="usr")
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long id;
    private String username;
    private String password;
    private boolean isActive;

@ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
@CollectionTable(name ="user_role", joinColumns = @JoinColumn(name = "user_id"))
@Enumerated(EnumType.STRING)
    private Set<Role> roles;

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return isActive;
    }

    public Set<Role> getRoles() {
        return roles;
    }
}

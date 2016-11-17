package org.pnv.mobileshop.dao.usermanagement;

import java.io.Serializable;

public class User implements Serializable {

    //TODO: mapping database
    private int id;
    private String username;
    private String password;
    private String address;
    private String role;
    
    
    /**
     * @param id
     * @param username
     * @param password
     * @param address
     * @param role
     */
    public User(int id, String username, String password, String address, String role) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
        this.role = role;
    }
    
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password= *******"  + ", address=" + address + ", role=" + role + "]";
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    
}

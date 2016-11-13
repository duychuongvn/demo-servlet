package org.pnv.mobileshop.businesslogic.usermanagement;

/**
 * Created by huynhduychuong on Nov 12, 2016.
 *
 */
public class UserModel {

    private int id;
    private String username;
    private String address;
    private String role;

    public UserModel(int id, String username, String address, String role) {
        super();
        this.id = id;
        this.username = username;
        this.address = address;
        this.role = role;
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

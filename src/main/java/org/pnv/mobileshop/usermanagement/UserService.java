package org.pnv.mobileshop.usermanagement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huynhduychuong on Nov 12, 2016.
 *
 */
public class UserService {

    public List<UserModel> getUserList() {
        List<UserModel> userModels = new ArrayList<UserModel>();
        userModels.add(new UserModel(1,  "UserName 1", "Thanh Khe"));
        userModels.add(new UserModel(2,  "UserName 2", "Hai Chau"));
        userModels.add(new UserModel(3,  "UserName 3", "Son Tra"));


        return userModels;
        
    }
}

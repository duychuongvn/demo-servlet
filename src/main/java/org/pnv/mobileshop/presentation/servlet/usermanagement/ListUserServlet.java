package org.pnv.mobileshop.presentation.servlet.usermanagement;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pnv.mobileshop.businesslogic.usermanagement.UserService;
import org.pnv.mobileshop.businesslogic.usermanagement.UserServiceImpl;

/**
 * Created by huynhduychuong on Nov 13, 2016.
 *
 */
public class ListUserServlet extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 7461997915535072526L;
    private UserService userService;
    
    public ListUserServlet() {
        userService = new UserServiceImpl();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setAttribute("userModels", userService.getUserList());
       getServletContext().getRequestDispatcher("/jsp/usermanagement/list-user.jsp").forward(req, resp);
    }
    

}

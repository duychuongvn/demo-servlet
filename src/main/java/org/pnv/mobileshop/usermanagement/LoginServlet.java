package org.pnv.mobileshop.usermanagement;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pnv.mobileshop.usermanagement.dao.domain.User;

public class LoginServlet extends HttpServlet {

    private UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if ("admin".equalsIgnoreCase(username) && "admin".equals(password)) {
            req.setAttribute("userModels", userService.getUserList());
            getServletContext().getRequestDispatcher("/jsp/home.jsp").forward(req, resp);
        } else {
            req.setAttribute("error", "Wrong Username Or Password");
            getServletContext().getRequestDispatcher("/").forward(req, resp);
        }

    }

}

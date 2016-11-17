package org.pnv.mobileshop.presentation.servlet.usermanagement;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.pnv.mobileshop.businesslogic.ServiceFactory;
import org.pnv.mobileshop.businesslogic.usermanagement.UserService;
import org.pnv.mobileshop.dao.exception.UserNotFoundException;
import org.pnv.mobileshop.dao.usermanagement.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = -2253548733814099606L;
    private Logger logger = LoggerFactory.getLogger(LoginServlet.class);
    private UserService userService =  ServiceFactory.getService(UserService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/jsp/usermanagement/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        logger.info("Start processing login");

        boolean isValidUser = false;
        try {
            User user = userService.findByUsername(username);
            if (StringUtils.isNotBlank(password) && password.equals(user.getPassword())) {
                isValidUser = true;
            }
        } catch (UserNotFoundException e) {
            isValidUser = false;
        }
        if (isValidUser) {
            req.setAttribute("userModels", userService.getUserList());
            getServletContext().getRequestDispatcher("/jsp/home.jsp").forward(req, resp);
        } else {
            req.setAttribute("errorDetail", "Wrong Username Or Password");
            getServletContext().getRequestDispatcher("/jsp/usermanagement/login.jsp?error").forward(req, resp);
        }
        logger.info("End processing login");
    }

}

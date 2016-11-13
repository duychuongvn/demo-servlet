package org.pnv.mobileshop.presentation.servlet.usermanagement;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterUserServlet extends HttpServlet{

    /**
     * 
     */
    private static final long serialVersionUID = -591771596715157692L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      getServletContext().getRequestDispatcher("/jsp/usermanagement/register-user.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //TODO: handle post register user form
        super.doPost(req, resp);
    }

    
}

package com.zensar.Controllers;
/**
 * @author Priya mirchandani
 * @version 2.0
 * @creation_date 21 sep 2019 5.23 pm
 * @modification_date 28 sep 2019 11.50 am
 * @copyright Zensar Technologies ,All rights reserved
 * @description- it is a controller class.
 *
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.daos.UserDao;
import com.zensar.daos.UserDaoImpl;
import com.zensar.entities.User;
import com.zensar.exceptions.ServiceException;

import com.zensar.services.UserService;
import com.zensar.services.UserServiceImpl;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/checkuser")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//call business layer component
		private UserService userService;
		
	    

		public void setUserService(UserService userService) {
			this.userService = userService;
		}

        @Override
        public void init() throws ServletException {
        	
             UserDao userDao=new UserDaoImpl();
             UserService userService=new UserServiceImpl();
             ((UserServiceImpl) userService).setUserDao(userDao);
             setUserService(userService);
        }

		

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			PrintWriter out=response.getWriter();
			String username=request.getParameter("username");
			String password=request.getParameter("passwd");
			User clientUser=new User();
			clientUser.setUsername(username);
			clientUser.setPassword(password);
			System.out.println(userService);
			
		try {
			if(userService.validateUser(clientUser))
				{
				//out.print("<p>dear " + username + " welcome to online shopping </p>");	
				RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
				rd.forward(request, response);
				
				}
			
			else
			{
					out.println("<p> sorry! Invalid username or password </p>");
					RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
					rd.include(request, response);
					
				
			}
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}






















}

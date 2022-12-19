package com.codegym.controller;

import com.codegym.dao.IUserRepository;
import com.codegym.dao.UserRepository;
import com.codegym.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "UserServlet", value = "/users")
public class UserServlet extends HttpServlet {
    private IUserRepository userRepository = new UserRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                request.getRequestDispatcher("user/create.jsp").forward(request,response);
                break;
            case "edit":
                showEditForm(request,response);
                break;
            case "delete":
                deleteUse(request,response);
                break;
            case "selectbyid":
                findUserByID(request,response);
                break;
            case "findbycountry":
                findUserByCountry(request,response);
                break;
            case "orderByName":
                orderByName(request,response);
                break;
            default:
                listUser(request,response);
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                this.addUser(request,response);
                break;
            case "edit":
                updateUser(request,response);
                break;
        }
    }


    private void updateUser(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String country = request.getParameter("country");

            User book = new User(id, name, email, country);

            userRepository.updateUser(book);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/edit.jsp");
            requestDispatcher.forward(request,response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void listUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<User> users = this.userRepository.selectAllUsers();
        request.setAttribute("listUser", users);
        request.getRequestDispatcher("user/list.jsp").forward(request, response);
    }

    private void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String country = request.getParameter("country");
            User user = new User(name, email,country);
            this.userRepository.insertUser(user);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/create.jsp");
            requestDispatcher.forward(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private void deleteUse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            userRepository.deleteUser(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        User existingUser = userRepository.selectUser(id);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/edit.jsp");
        request.setAttribute("user", existingUser);
        requestDispatcher.forward(request,response);
    }
    private void findUserByID(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User > findUser = new ArrayList<>();
        int findID = Integer.parseInt(request.getParameter("findid"));
        System.out.println(findID);
        findUser.add(this.userRepository.selectUser(findID));
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/searchresult.jsp");
        request.setAttribute("findUser", findUser);
        requestDispatcher.forward(request,response);
    }

    private void findUserByCountry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
        int a= 0;

//        cách 1:
//        String inputCountry = request.getParameter("country");
//        cách 2:
        String inputCountry = request.getParameter("inputcountry");

        System.out.println(inputCountry);
        List<User> findUser = this.userRepository.selectUserByCountry(inputCountry);
        for (User user: findUser){
            System.out.println(user.toString() + a++);
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/searchresult.jsp");
        request.setAttribute("findUser", findUser);
        requestDispatcher.forward(request,response);
    }
    private void orderByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
        List<User> listUser = userRepository.orderByName();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/list.jsp");
        request.setAttribute("listUser", listUser);
        requestDispatcher.forward(request,response);
    }
}

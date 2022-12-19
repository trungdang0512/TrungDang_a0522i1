package controller;

import model.Payment;
import model.Room;
import repository.IPaymentRepository;
import repository.IRoomRepository;
import repository.impl.PaymentRepositoryImpl;
import repository.impl.RoomRepositoryImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletRoom", value = "/room")
public class ServletRoom extends HttpServlet {
    private IRoomRepository roomRepository = new RoomRepositoryImpl();
    private IPaymentRepository paymentRepository = new PaymentRepositoryImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                showCreate(request, response);
                break;
            case "list":
                list(request, response);
                break;
            case "delete":
                delete(request,response);
                break;
            case "search":
                search(request,response);
                break;
            case "searchPhone":
                searchPhone(request,response);
                break;
            case "searchId":
                searchId(request,response);
                break;
            default: list(request,response);
        }
    }

    private void searchPhone(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int searchAccount = Integer.parseInt(request.getParameter("searchNumberPhone"));
        System.out.println(searchAccount);
        List<Room> rooms = roomRepository.searchPhone(searchAccount);
        request.setAttribute("roomList", rooms);
        List<Payment> paymentList = paymentRepository.findAll();
        request.setAttribute("paymentList", paymentList);
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }

    private void searchId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String searchClassId = request.getParameter("idPayment_rom");

        List<Room> rooms = roomRepository.searchID(searchClassId);
        request.setAttribute("roomList", rooms);
        List<Payment> paymentList = paymentRepository.findAll();
        request.setAttribute("paymentList", paymentList);
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }

    private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String searchName = request.getParameter("searchName");


        List<Room> rooms = roomRepository.search(searchName);
        request.setAttribute("roomList", rooms);
        List<Payment> paymentList = paymentRepository.findAll();
        request.setAttribute("paymentList", paymentList);
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int deleteId = Integer.parseInt(request.getParameter("deleteId"));
        System.out.println(deleteId);
        try {
            roomRepository.delete(deleteId);
        }catch (SQLException e){
            e.printStackTrace();
        }
        request.setAttribute("mess", "Delete Successfully");
        list(request,response);

    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Payment> paymentList = paymentRepository.findAll();
        request.setAttribute("paymentList", paymentList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("create.jsp");
        try{
            requestDispatcher.forward(request,response);
        }catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Room> roomList = roomRepository.findAll();
        List<Payment> paymentList = paymentRepository.findAll();
        request.setAttribute("roomList", roomList);
        request.setAttribute("paymentlist", paymentList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                insert(request,response);
                break;

        }
    }

    private void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nameCustomer = request.getParameter("nameCustomer");
        int Phone = Integer.parseInt(request.getParameter("numberPhone"));
        String date = request.getParameter("ngayBatDau");
        int idPayment = Integer.parseInt(request.getParameter("idPayment_room"));
        String note = request.getParameter("Note");
        Room room = new Room(nameCustomer,Phone, date,idPayment,note);
        roomRepository.insert(room);
        String mess ="Successfully Added New";
        request.setAttribute("mess", mess);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}

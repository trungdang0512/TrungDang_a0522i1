package controller;

import model.BenhAn;
import model.BenhNhan;
import repository.IBenhAnRepository;
import repository.IBenhNhanRepository;
import repository.impl.BenhAnRepositoryImpl;
import repository.impl.BenhNhanRepositoryImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "BenhAnController", value = "/bv")
public class BenhAnController extends HttpServlet {
    private IBenhAnRepository benhAnRepository = new BenhAnRepositoryImpl();
    private IBenhNhanRepository benhNhanRepository = new BenhNhanRepositoryImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "list":
                showList(request,response);
                break;
            case "edit":
                showEdit(request,response);
                break;
            case "delete":
                delete(request,response);
                break;
            default: showList(request,response);
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("deleteId");
        try {
            benhAnRepository.deleteBenhAn(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        showList(request,response);
    }

    private void showEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String id = request.getParameter("id");
        BenhAn benhAn = benhAnRepository.selectBenhAn(id);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("edit.jsp");
        request.setAttribute("benhan", benhAn);
        request.setAttribute("benhnhan", benhNhanRepository.findAll());
        requestDispatcher.forward(request,response);
    }

    private void showList(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        List<BenhAn> benhAnList = this.benhAnRepository.findAll();
        request.setAttribute("benhan", benhAnList);
        request.setAttribute("benhnhan", benhNhanRepository.findAll());
        request.getRequestDispatcher("list.jsp").forward(request,response);
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
            case "edit":
                edit(request,response);
                break;
        }
    }

    private void edit(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException  {
        String idBA = request.getParameter("id");
        String idBN = request.getParameter("idBN");
        String nameBN = request.getParameter("nameBN");
        String ngaynhap = request.getParameter("ngaynhapvien");
        String ngayra = request.getParameter("ngayravien");
        String lydo = request.getParameter("lydo");
        BenhNhan newBenhNhan = new BenhNhan(idBN,nameBN);
        BenhAn newBenhAn = new BenhAn(idBA, newBenhNhan, ngaynhap, ngayra, lydo);
        benhNhanRepository.updateBenhNhan(newBenhNhan);
        benhAnRepository.updateBenhAn(newBenhAn);
        showList(request,response);
    }
}

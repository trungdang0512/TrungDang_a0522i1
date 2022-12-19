package controller;

import dao.ICategoryRepository;
import dao.IProductRepository;
import dao.impl.CategoryRepositoryImpl;
import dao.impl.ProductRepositoryImpl;
import model.Category;
import model.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ProductController", value = "/product")
public class ProductController extends HttpServlet {
    private IProductRepository productRepository = new ProductRepositoryImpl();
    private ICategoryRepository categoryRepository = new CategoryRepositoryImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action= "";
        }
        switch (action){
            case "list":
                listProduct(request,response);
                break;
            case "create":
                showCreate(request,response);
                break;
            case "edit":
                showEdit(request,response);
                break;
            case "findbyname" :
                findByName(request,response);
                break;
            case "delete":
                deleteProduct(request,response);
                break;
            default:
                listProduct(request,response);
        }
    }

    private void findByName(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String inputName = request.getParameter("inputname");
        List<Product> findProduct = this.productRepository.findProductByName(inputName);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("searchresult.jsp");
        request.setAttribute("findProduct", findProduct);
        requestDispatcher.forward(request,response);
    }

    private void showEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String id = request.getParameter("id");
        Product chooseProduct = productRepository.selectProduct(id);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("edit.jsp");
        request.setAttribute("product", chooseProduct);
        request.setAttribute("categories", categoryRepository.findAll());
        requestDispatcher.forward(request,response);
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String id = request.getParameter("id");
        try {
            productRepository.deleteProduct(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        listProduct(request,response);
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setAttribute("categories", categoryRepository.findAll());
        request.getRequestDispatcher("create.jsp").forward(request,response);
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Product> products = this.productRepository.findAll();
        request.setAttribute("products", products);
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action= "";
        }
        switch (action){
            case "create":
                addProduct(request,response);
                break;
            case "edit":
                updateProduct(request,response);
                break;
        }
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        Double price = Double.valueOf(request.getParameter("price"));
        int quantity = Integer.valueOf(request.getParameter("quantity"));
        String color = request.getParameter("color");
        String description = request.getParameter("description");
        int categoryId = Integer.parseInt(request.getParameter("category"));
        Category category = this.categoryRepository.findById(categoryId);

        Product updatedProduct = new Product(id,name,price,quantity,color,description,category);
        productRepository.updateProduct(updatedProduct);
        listProduct(request,response);
    }

    private void addProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        Double price = Double.valueOf(request.getParameter("price"));
        int quantity = Integer.valueOf(request.getParameter("quantity"));
        String color = request.getParameter("color");
        String description = request.getParameter("des");
        int categoryId = Integer.parseInt(request.getParameter("category"));
        Category category = this.categoryRepository.findById(categoryId);
        Product newProduct = new Product(id,name,price,quantity,color,description,category);
        this.productRepository.addNewProduct(newProduct);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("create.jsp");
        requestDispatcher.forward(request,response);
    }
}

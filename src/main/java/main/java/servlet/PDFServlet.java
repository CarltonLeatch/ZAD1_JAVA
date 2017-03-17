package main.java.servlet;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Carlton Leatch on 13.03.2017.
 */
@WebServlet("/PDFServlet")
public class PDFServlet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/pdf");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {



    }
}

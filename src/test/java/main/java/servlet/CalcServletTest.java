package main.java.servlet;

import org.junit.Test;
import org.mockito.Mockito;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Carlton Leatch on 17.03.2017.
 */
public class CalcServletTest extends Mockito {
@Test
    public void servlet_should_not_greet_when_inputs_are_empty() throws IOException, ServletException {

        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PrintWriter writer = mock(PrintWriter.class);
        when(response.getWriter()).thenReturn(writer);
        CalcServlet servlet = new CalcServlet();

        when(request.getParameter("kkredytu")).thenReturn("");

        servlet.doPost(request,response);

        verify(response).sendRedirect("/");

    }

    public void servlet_should_not_greet_when_the_for_is_null() throws IOException, ServletException{
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PrintWriter writer = mock(PrintWriter.class);
        when(response.getWriter()).thenReturn(writer);
        CalcServlet servlet = new CalcServlet();

        when(request.getParameter("kkredytu")).thenReturn(null);

        servlet.doPost(request,response);

        verify(response).sendRedirect("/");

    }

}

package main.java.servlet;


import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    ServletOutputStream sOut;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String kkredytu = request.getParameter("kkredytu");
        String ilosc_rat = request.getParameter("ilosc_rat");
        String oprocentowanie = request.getParameter("oprocentowanie");
        String oplata_stala = request.getParameter("oplata_stala");
        double rata;
        float czkapitalowa;
        float czodsetkowa;
        float kredyt;
        String typ = request.getParameter("typ");

        response.setContentType("text/html");
      //  response.getWriter().println("<a href = '/PDFServlet'> Click Here to Download your content </a>");
        kredyt = Float.parseFloat(kkredytu);


        if (typ.equals("malejaca")) {

            czkapitalowa = Integer.parseInt(kkredytu) / Integer.parseInt(ilosc_rat);

            for (int i = 1; i <= Integer.parseInt(ilosc_rat); i++) {
                if (i == 1) {

                    czodsetkowa = ((Integer.parseInt(kkredytu) * (Float.parseFloat(oprocentowanie) / 100)) / 12);
                    rata = czkapitalowa + czodsetkowa;

                    response.getWriter().println("<table><tr><th>Rata numer: " + i + "</th></tr>"
                            + "<tr><td>wyniesie: "
                            + Math.round(rata * 100.0) /100.0 + "</td></tr></table><br><br>");
                } else if (i > 1) {
                    kredyt -= czkapitalowa;
                    czodsetkowa = (((kredyt - czkapitalowa) * (Float.parseFloat(oprocentowanie) / 100)) / 12);
                    rata = czkapitalowa + czodsetkowa;
                    response.getWriter().println("<table><tr><th>Rata numer: " + i + "</th></tr>"
                            + "<tr><td>wyniesie: "
                            + Math.round(rata * 100.0) /100.0 + "</td></tr></table><br><br>");
                } else {
                    response.getWriter().println("Error");
                }
            }
        } else {
            if (typ.equals("stala")) {
                float irat = Float.parseFloat(ilosc_rat);
                float procent = Float.parseFloat(oprocentowanie);
                float q = 1 + ((procent / 100) / 12);

                rata = (kredyt * (Math.pow(q, irat) * (q - 1))) / (Math.pow(q, irat) - 1);

                for (int i = 1; i <= irat; i++)
                    response.getWriter().println("<table><tr><th>Rata numer: " + i + "</th></tr>"
                            + "<tr><td>wyniesie: "
                            + Math.round(rata * 100.0) / 100.0 + "</td></tr></table><br><br>");




            }
        }

    }


}





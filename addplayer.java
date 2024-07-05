package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addplayer")
public class addplayer extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html>");
        out.println("<body>");

        ArrayList<String> li = (ArrayList<String>) request.getAttribute("error");
        if (li != null) {
            Iterator<String> itr = li.iterator();
            out.println("<ul>");
            while (itr.hasNext()) {
                out.println("<li>" + itr.next() + "</li>");
            }
            out.println("</ul>");
        }

        out.println("<h2>add player details</h2>");
        out.println("<form action='addplayercon' method='post'>");
        out.println("Name: <input type='text' name='name'> <br><br>");
        out.println("Age: <input type='text' name='age'> <br><br>");
        out.println("Rank: <input type='text' name='rank'> <br><br>");
        out.println("<input type='submit' value='submit'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}

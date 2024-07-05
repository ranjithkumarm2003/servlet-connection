package view;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addplayercon")
public class addplayercon extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Do nothing or redirect to the addplayer form if needed
        response.sendRedirect("addplayer");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name").trim();
        String age = request.getParameter("age").trim();
        String rank = request.getParameter("rank").trim();
        ArrayList<String> li = new ArrayList<>();

        if (name.isEmpty()) {
            li.add("Name can't be empty");
        }
        if (age.isEmpty()) {
            li.add("Age can't be empty");
        }
        if (rank.isEmpty()) {
            li.add("Rank can't be empty");
        }

        if (!li.isEmpty()) {
            request.setAttribute("error", li);
            RequestDispatcher rd = request.getRequestDispatcher("addplayer");
            rd.forward(request, response);
        } 
        else {
            Player m = new Player(name, age, rank);
            playerdao n = new playerdao();
            n.storeData(m);

            RequestDispatcher rd = request.getRequestDispatcher("successplayer.html");
            rd.forward(request, response);
        }
    }
}

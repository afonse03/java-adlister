import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PageHitCounter", urlPatterns = "/count")
public class PageHitCounter extends HttpServlet {
    private int hitCount;
    public void init() {
        hitCount = 0;
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        hitCount++;
        PrintWriter out = response.getWriter();
        String title = "Total number of views on page";
        out.println("<h1>Hello</h1>");
    }

}

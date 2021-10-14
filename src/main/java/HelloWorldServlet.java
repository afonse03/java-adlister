import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// Hey Tomcat, whenever someone requests the url /hello, load and execute this servlet
// The webservlet annotation maps a url to a servlet and its code
@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter(); // PrintWriter enables a flow of data from the server to the client
        out.println("<h1>Hello, world!</h1>");
    }
}

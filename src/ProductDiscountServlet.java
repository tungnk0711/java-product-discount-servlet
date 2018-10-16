import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountServlet", urlPatterns = "/display-discount")
public class ProductDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String des = request.getParameter("description");
        String price = request.getParameter("price");
        String discount = request.getParameter("discount");

        double discountAmount = Double.parseDouble(price) * Double.parseDouble(discount) * 0.01;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");


        writer.println("<h1>Discount Amount: " + discountAmount + "</h1>");
        writer.println("<h1>Price after Discount: " + (Double.parseDouble(price) - discountAmount) + "</h1>");


        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

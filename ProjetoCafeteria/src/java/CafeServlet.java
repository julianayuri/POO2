import cafe.dominio.Cafe;
import cafe.dominio.Expresso;
import cafe.dominio.Cappuccino;
import cafe.dominio.adicionais.Creme;
import cafe.dominio.adicionais.Chocolate;
import cafe.dominio.adicionais.Marshmallow;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CafeServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

            Cafe cafe = null;
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Cafe</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Cafeteria!</h1>");

            String tipo_cafe = request.getParameter("tipo_cafe");
            if (tipo_cafe.equalsIgnoreCase("Cappuccino")) {
                cafe = new Cappuccino();
            } else if (tipo_cafe.equalsIgnoreCase("Expresso")) {
                cafe = new Expresso();
            }

            if (request.getParameterMap() != null) {
                if (request.getParameterMap().containsKey("Chocolate")) {
                    cafe = new Chocolate(cafe);
                }
                if (request.getParameterMap().containsKey("Creme")) {
                    cafe = new Creme(cafe);
                }
                if (request.getParameterMap().containsKey("Marshmallow")) {
                    cafe = new Marshmallow(cafe);                    
                }
            }

            out.println("Custo Total " + cafe.cost());
            out.println("</body>");
            out.println("</html>");

            /* TODO output your page here. You may use following sample code.
            
            Festa festa = new FestaCrianca();
            System.out.println(festa.getDescription()
                    + " $ " + festa.cost()
            );

            Festa cappuccino = new FestaCrianca();  // custo 
            cappuccino = new Creme(cappuccino);
            cappuccino = new Creme(cappuccino);
            cappuccino = new Chocolate(cappuccino);

            System.out.println(cappuccino.getDescription() + " $ " + cappuccino.cost());
             */
        } finally {
            out.close();
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Cafe Servlet";
    }

}

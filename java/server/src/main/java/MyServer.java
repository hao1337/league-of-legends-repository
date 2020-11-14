import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class MyServer {
    public static void main(String[] args) {
        System.out.println("hello world");
        Server server = new Server(8000);
        ServletContextHandler restContext = new ServletContextHandler(ServletContextHandler.Sessions);
        {
            restContext.setContextPath("/");

            ServletHolder servlet = new ServletHolder(new ServletContainer());
            servlet.setInitParameter(ServerProperties.PROVIDER_PACKAGES, "ws"); // add in packages
            servlet.setInitOrder(1);
            restContext.addServlet(servlet, "/*"); // make endpoints that don't exist return nothing
        }

        server.setHandler(restContext);

        server.start();
    }
}

package app;

import java.io.IOException;

import org.apache.jasper.servlet.JspServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ServidorJetty {
	private static Server server;
	
	public void iniciarServidor() {
		try {
			server = new Server(Constantes.PORTA);
			server.setHandler(getServletContextHandler());			

			System.setProperty("java.home", Constantes.JDK_DIR);
			System.setProperty("server.java-config.java-home", Constantes.JDK_DIR);
			System.setProperty("org.apache.jasper.compiler.disablejsr199", "false");						
			
			server.start();		
			server.join();			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void pararServidor() {
		server.setStopAtShutdown(true);
		try {
			server.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
    private static ServletContextHandler getServletContextHandler() {
        ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS); // SESSIONS requerido para JSP 
        contextHandler.setErrorHandler(null);
        
        try {
			contextHandler.setResourceBase(new ClassPathResource(Constantes.WEBAPP_DIR).getURI().toString());
		} catch (IOException e) {
			e.printStackTrace();
		}        
        contextHandler.setContextPath(Constantes.CONTEXT_PATH);
        
        // JSP
        contextHandler.setClassLoader(Thread.currentThread().getContextClassLoader());
        contextHandler.addServlet(JspServlet.class, "*.jsp");  
        
        // Manipulacao de erros
		ServidorJettyErroHandler erroHandler = new ServidorJettyErroHandler();	        
        contextHandler.setErrorHandler(erroHandler);        
        
        // Spring MVC
        WebApplicationContext webAppContext = getWebApplicationContext();
        DispatcherServlet dispatcherServlet = new DispatcherServlet(webAppContext);
        ServletHolder springServletHolder = new ServletHolder("mvc-dispatcher", dispatcherServlet);
        contextHandler.addServlet(springServletHolder, Constantes.MAPPING_URL);
        contextHandler.addEventListener(new ContextLoaderListener(webAppContext));
        
        return contextHandler;
    }
    
	private static WebApplicationContext getWebApplicationContext() {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.setConfigLocation(Constantes.PACOTE_CONFIGURACAO);
		return context;
	}    
	
}

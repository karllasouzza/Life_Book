package app;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.ErrorHandler;

public class ServidorJettyErroHandler extends ErrorHandler {
	
	@Override
	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) {
		try {
			response.sendRedirect("/erro");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
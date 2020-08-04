package br.com.rdevs.util;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rdevs.model.Modulo;
import br.com.rdevs.service.ModuloService;


@WebServlet("/modulos")
public class ModuloTreinamentoServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res){
		
		try {

			ModuloService service = new ModuloService();
			List<Modulo> listaModulo = service.listarModulos();
			
			req.setAttribute("modulos", listaModulo);
			
			RequestDispatcher rd = req.getRequestDispatcher("/consultar-modulos.jsp");
		
			rd.forward(req,res);
			 
		}catch(IOException e) {
			System.out.println("Erro ao executar servlet");
		}catch (ServletException e) {
			e.printStackTrace();
		}

	}
}

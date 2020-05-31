package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dbHelp.ReadAMovie;
import model.Movie;
/**
 * Servlet implementation class MovieServlet
 */
@WebServlet(description = "processes the information about movies", urlPatterns = { "/MovieServlet" })
public class MovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReadAMovie read1 = new ReadAMovie("AMC", "root", "nakbocha2510","A Beautiful Day in The Neighborhood");
		ReadAMovie read2 = new ReadAMovie("AMC", "root", "nakbocha2510","Charlie's Angels");
		ReadAMovie read3 = new ReadAMovie("AMC", "root", "nakbocha2510","Doctor Sleep");
		ReadAMovie read4 = new ReadAMovie("AMC", "root", "nakbocha2510","Ford v Ferrari");
		ReadAMovie read5 = new ReadAMovie("AMC", "root", "nakbocha2510","Frozen II");
		ReadAMovie read6 = new ReadAMovie("AMC", "root", "nakbocha2510","Joker");
		ReadAMovie read7 = new ReadAMovie("AMC", "root", "nakbocha2510","Last Christmas");
		ReadAMovie read8 = new ReadAMovie("AMC", "root", "nakbocha2510","Midway");
		ReadAMovie read9 = new ReadAMovie("AMC", "root", "nakbocha2510","Playing With Fire");
		ReadAMovie read10 = new ReadAMovie("AMC", "root", "nakbocha2510","The Good Liar");

		read1.doRead();
		read2.doRead();
		read3.doRead();
		read4.doRead();
		read5.doRead();
		read6.doRead();
		read7.doRead();
		read8.doRead();
		read9.doRead();
		read10.doRead();

		request.setAttribute("rogers", read1.getMovie());
		request.setAttribute("angels", read2.getMovie());
		request.setAttribute("doctor", read3.getMovie());
		request.setAttribute("ford", read4.getMovie());
		request.setAttribute("frozen", read5.getMovie());
		request.setAttribute("joker", read6.getMovie());
		request.setAttribute("christmas", read7.getMovie());
		request.setAttribute("midway", read8.getMovie());
		request.setAttribute("playing", read9.getMovie());
		request.setAttribute("liar", read10.getMovie());

		
		
		String url= "/Movies.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}

package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Calculator;

/**
 * Servlet implementation class addTwoNumbersServlet
 */
@WebServlet("/addTwoNumbersServlet")
public class addTwoNumbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addTwoNumbersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double double1 = Double.parseDouble(request.getParameter("num1"));
		double double2 = Double.parseDouble(request.getParameter("num2"));
		
		Calculator calc = new Calculator();
		double result = calc.addTwoNumbers(double1, double2);
		calc.setNum1(double1);
		calc.setNum2(double2);
		calc.setResult(result);
		request.setAttribute("calc", calc);
		getServletContext().getRequestDispatcher("/response.jsp").forward(request, response);
	}

}

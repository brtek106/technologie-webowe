package pl.javastart.mvc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.math.BigDecimal;

@WebServlet("/convert")
public class ExchangeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String valueString = request.getParameter("value");
        BigDecimal value = new BigDecimal(valueString);
        String exchangeString = request.getParameter("exchange");
        ExchangeType exchangeType = ExchangeType.valueOf(exchangeString);
        ExchangeResult exchangeResult = ExchangeCalculator.exchange(value, exchangeType);
        request.setAttribute("result", exchangeResult);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}

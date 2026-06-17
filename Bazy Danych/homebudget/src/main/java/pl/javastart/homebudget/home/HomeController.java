package pl.javastart.homebudget.home;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pl.javastart.homebudget.budget.BudgetItem;
import pl.javastart.homebudget.budget.BudgetItemDao;
import pl.javastart.homebudget.budget.BudgetItemType;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

@WebServlet("")
public class HomeController extends HttpServlet {
    private BudgetItemDao budgetItemDao = new BudgetItemDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<BudgetItem> incomes = budgetItemDao.findAllItemsByType(BudgetItemType.INCOME);
        List<BudgetItem> expenses = budgetItemDao.findAllItemsByType(BudgetItemType.EXPENSE);
        BigDecimal incomesSum = getSum(incomes);
        BigDecimal expensesSum = getSum(expenses);
        BigDecimal balance = incomesSum.subtract(expensesSum);
        req.setAttribute("incomes", incomes);
        req.setAttribute("expenses", expenses);
        req.setAttribute("balance", balance);
        req.setAttribute("incomesSum", incomesSum);
        req.setAttribute("expensesSum", expensesSum);
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }

    private BigDecimal getSum(List<BudgetItem> items) {
        return items.stream()
                .map(BudgetItem::getValue)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
    }
}

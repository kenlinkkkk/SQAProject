package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SeasonScore extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String key = req.getParameter("kyhoc");
			int nam = Integer.valueOf(key.substring(0,4));
			int ky = Integer.valueOf(key.substring(4));
			if ((ky > 0) && (ky <=3) && (nam <= Integer.valueOf(java.time.Year.now().toString()))) {
				req.getSession().setAttribute("kyhoc", key);
				req.getRequestDispatcher("/SeasonScoreDetail.jsp").forward(req, resp);
			} else {
				req.setAttribute("falseInfo", "Kỳ học không đúng");
				req.getRequestDispatcher("/SeasonScore.jsp").forward(req, resp);
				return;
			}
			
	}
}

package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SinhVien;
import controller.*;

public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		SinhVien sVien = new SinhVien(username.toUpperCase(),password);
		
		MainCtr ctr = new MainCtr(sVien);
		
		
		try {			
			if (ctr.checkInfo() == false) {
				req.setAttribute("falseInfo", "Tài khoản hoặc mật khẩu không đúng");
				req.getRequestDispatcher("/Login.jsp").forward(req, resp);
				return;
			} else {
				sVien = ctr.getInfo();
				req.getSession().setAttribute("sVien", sVien);
				req.getRequestDispatcher("/SeasonScore.jsp").forward(req, resp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responses;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.SinhVien;
import services.MainServices;

/**
 *
 * @author macos
 */
public class LoginResponse extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		SinhVien sVien = new SinhVien();
		sVien.setMasv(username);
		sVien.setPassword(password);
		
		MainServices mainServices = new MainServices();
		
		try {
			if (mainServices.login(sVien.getMasv(),sVien.getPassword()) == null) {
				req.setAttribute("falseInfo", "Tài khoản hoặc mật khẩu không đúng");
				req.getRequestDispatcher("/Login.jsp").forward(req, resp);
				return;
			} else {
				sVien = mainServices.login(sVien.getMasv(), sVien.getPassword());
				req.getSession().setAttribute("sVien", sVien);
				req.getRequestDispatcher("/SeasonScore.jsp").forward(req, resp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.doPost(req, resp);
	}   
}

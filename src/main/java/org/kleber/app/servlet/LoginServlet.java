package org.kleber.app.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import org.kleber.app.model.usuario.UsuarioDao;
import org.kleber.app.model.usuario.Usuario;

public class LoginServlet extends HttpServlet {
  private UsuarioDao usuario;

  public void init() {
    usuario = new UsuarioDao();
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String nextJSP = "/WEB-INF/jsp/signin.jsp";
    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
    dispatcher.forward(request,response);
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String login = request.getParameter("login");
    String senha = request.getParameter("senha");

    for(Usuario target : usuario.select())
      if(target.getUsername().equals(login))
        if(target.getPassword().equals(senha)) {
          String nextJSP = "/WEB-INF/jsp/admin.jsp";
          RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
          request.setAttribute("usuario", target);
          dispatcher.forward(request,response);
        }
  }
}

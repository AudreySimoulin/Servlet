/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettest.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjoutFilmsServlet", urlPatterns = {"/ajout_films_servlet"})
public class AjoutFilmsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Film f = new Film();
        f.setTitre(req.getParameter("titre"));
        f.getGenre().setNom(req.getParameter("genre"));
        f.getPays().setNom(req.getParameter("pays"));
        f.setAnnee(Long.parseLong(req.getParameter("annee")));
        f.setSynopsis(req.getParameter("synopsis"));
        
    }


}

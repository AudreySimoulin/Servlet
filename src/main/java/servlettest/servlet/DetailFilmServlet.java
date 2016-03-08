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
import streaming.service.FilmServiceMockImpl;

/**
 *
 * @author admin
 */
@WebServlet(name = "DetailFilmServlet", urlPatterns = {"/detail_film"})
public class DetailFilmServlet extends HttpServlet {
    
    FilmServiceMockImpl filmService = new FilmServiceMockImpl();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Film f = filmService.findById(Long.parseLong(req.getParameter("idFilm")));

        req.setAttribute("monFilm", f);
        
        req.getRequestDispatcher("detail_film.jsp").forward(req, resp);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettest.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;
import streaming.service.FilmServiceMockImpl;

/**
 *
 * @author admin
 */
public class FilmController {

    FilmServiceMockImpl filmService = new FilmServiceMockImpl();

    public void afficherFilm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Film> f = filmService.listerTous();
        req.setAttribute("mesFilms", f);
        req.getRequestDispatcher("lister_films.jsp").include(req, resp);
    }

    public void detailsFilm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Film f = filmService.findById(Long.parseLong(req.getParameter("idFilm")));
        req.setAttribute("monFilm", f);
        req.getRequestDispatcher("detail_film.jsp").include(req, resp);
    }

}

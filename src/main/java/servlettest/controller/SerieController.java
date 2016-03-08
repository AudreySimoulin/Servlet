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
import streaming.entity.Serie;
import streaming.service.SerieServiceMockImpl;

/**
 *
 * @author admin
 */
public class SerieController {

    SerieServiceMockImpl serieService = new SerieServiceMockImpl();

    public void afficherSerie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Serie> s = serieService.listerTous();
        req.setAttribute("mesSeries", s);
        req.getRequestDispatcher("lister_series.jsp").include(req, resp);
    }

    public void detailsSerie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Serie s = serieService.findById(Long.parseLong(req.getParameter("idSerie")));
        req.setAttribute("maSerie", s);
        req.getRequestDispatcher("detail_serie.jsp").include(req, resp);
    }

}

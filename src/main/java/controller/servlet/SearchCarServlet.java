package controller.servlet;

import service.CarManagementService;
import service.CarModelManagementService;
import service.impl.CarManagementServiceImpl;
import service.impl.CarModelManagementServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static utils.Namespace.*;

@WebServlet(name = "SearchCarServlet",value = "/search")
public class SearchCarServlet extends HttpServlet {

    CarModelManagementService carModelManagementService;
    CarManagementService carManagementService;


    @Override
    public void init() throws ServletException {
        this.carManagementService = new CarManagementServiceImpl();
        this.carModelManagementService = new CarModelManagementServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String fromLocation = req.getParameter(FROM_LOCATION);
        String toLocation = req.getParameter(TO_LOCATION);

        Long idFromLocation = Long.parseLong(fromLocation);
        Long idToLocation = Long.parseLong(toLocation);

        String dateFromString = req.getParameter(START_DATE);
        LocalDate dateFrom = LocalDate.parse(dateFromString);

        String dateToString = req.getParameter(END_DATE);
        LocalDate dateTo = LocalDate.parse(dateToString);


    }


}

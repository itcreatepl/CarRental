package controller.servlet;

import model.CarModel;
import model.Location;
import service.CarModelManagementService;
import service.LocationManagementService;
import service.impl.CarModelManagementServiceImpl;
import service.impl.LocationManagementServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static utils.Namespace.*;

@WebServlet(name = "StartServlet", urlPatterns = {"", "/carslist"})
public class StartServlet extends HttpServlet {

    CarModelManagementService carModelManagementService;
    LocationManagementService locationManagementService;

    @Override
    public void init() throws ServletException {
        carModelManagementService = new CarModelManagementServiceImpl();
        locationManagementService = new LocationManagementServiceImpl();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<CarModel> allCarModels = carModelManagementService.getAllCarModels();
        req.setAttribute(CAR_MODEL_LIST, allCarModels);

        List<Location> allLocation = locationManagementService.getAllLocation();
        req.setAttribute(LOCATION_LIST, allLocation);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}


package controller.servlet;

import model.CarModel;
import service.CarModelManagementService;
import service.impl.CarModelManagementServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static utils.Namespace.*;

@WebServlet(name = "CarDetailServlet", value = "/car")
public class CarDetailServlet extends HttpServlet {

    CarModelManagementService carModelManagementService;

    @Override
    public void init() throws ServletException {
        carModelManagementService = new CarModelManagementServiceImpl();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idString = req.getParameter("id");
        if (idString == null) {
            req.getRequestDispatcher("/").forward(req, resp);
            return;
        }
        Pattern numberPat = Pattern.compile("\\b\\d+\\b");
        Matcher matcher1 = numberPat.matcher(idString);
        if (!matcher1.find() && idString.isEmpty()) {
            req.getRequestDispatcher("/").forward(req, resp);
            return;
        }
        Long idCarModel = Long.parseLong(idString);
        CarModel carModel = carModelManagementService.getCarModelById(idCarModel);

        req.setAttribute(CAR_MODEL, carModel);
        req.getRequestDispatcher("carDetail.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }


}

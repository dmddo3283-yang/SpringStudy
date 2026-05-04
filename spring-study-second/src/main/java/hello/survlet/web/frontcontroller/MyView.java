package hello.survlet.web.frontcontroller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MyView {
    private String viewPath;

    public MyView(String viewPath) {
        this.viewPath = viewPath;
    }

    public void render(HttpServletRequest reqeust, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = reqeust.getRequestDispatcher(viewPath);
        dispatcher.forward(reqeust, response);

    }
}

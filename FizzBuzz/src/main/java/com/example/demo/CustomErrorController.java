package com.example.demo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomErrorController implements ErrorController, getErrorInterface {


    @RequestMapping("/error")
    @ResponseBody
    public String handleError(HttpServletRequest request) {
        // Get the error status code
        Integer statusCode = (Integer) request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        // Get the error message, or set a default message if empty
        String errorMessage = (String) request.getAttribute(RequestDispatcher.ERROR_MESSAGE);
        if (errorMessage == null || errorMessage.isEmpty()) {
            errorMessage = "An error occurred";
        }

        // Construct the error response
        String errorResponse = "<h1>Error occurred</h1>";
        errorResponse += "<p>Status Code: " + statusCode + "</p>";
        errorResponse += "<p>Error Message: " + errorMessage + "</p>";

        return errorResponse;
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
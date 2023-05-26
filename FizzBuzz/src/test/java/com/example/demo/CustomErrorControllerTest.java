package com.example.demo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(CustomErrorController.class)
class CustomErrorControllerTest {
    @MockBean
    private RequestDispatcher requestDispatcher;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void handleError_ReturnsErrorResponse() throws Exception {
        int statusCode = 404;
        String errorMessage = "Page not found";

        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);

        Mockito.when(request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE)).thenReturn(statusCode);
        Mockito.when(request.getAttribute(RequestDispatcher.ERROR_MESSAGE)).thenReturn(errorMessage);

        mockMvc.perform(get("/error").requestAttr(RequestDispatcher.ERROR_STATUS_CODE, statusCode)
                        .requestAttr(RequestDispatcher.ERROR_MESSAGE, errorMessage))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("<h1>Error occurred</h1>")))
                .andExpect(content().string(containsString("Status Code: " + statusCode)))
                .andExpect(content().string(containsString("Error Message: " + errorMessage)));
    }
}


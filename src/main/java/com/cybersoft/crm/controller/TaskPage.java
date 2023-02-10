package com.cybersoft.crm.controller;

import com.cybersoft.crm.model.TaskModel;
import com.cybersoft.crm.service.TaskService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "taskPage", urlPatterns = {"/task"})
public class TaskPage extends HttpServlet {
    private TaskService taskService = new TaskService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("tasks", taskService.getAllTasks());
        req.getRequestDispatcher("/task.jsp").forward(req, resp);
    }
}

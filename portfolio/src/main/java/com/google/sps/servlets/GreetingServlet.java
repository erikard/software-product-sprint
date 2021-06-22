package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/greeting")
public class GreetingServlet extends HttpServlet {
    
    /*
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
      const greetings = ['Hope you are having an awesome day!', 'Remember to smile!', 'Some people only talk to you, so that they can talk about you. Don\'t give them that power!', 'Life is beautiful :)'];

      const greeting = greetings[Math.floor(Math.random() * greetings.length)];
      
    response.setContentType("text/html;");
    response.getWriter().println(greeting);
    */
      @Override
      public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;");
        response.getWriter().println("Smile! :)");
      }
  }
}

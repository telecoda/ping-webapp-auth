package controllers;

import java.io.IOException;

import play.mvc.Controller;

public class Authenticated extends Controller {
    public static void authenticated() {
        renderTemplate("Authenticated/authenticated.html");
    }
    
    public static void logout() {
        renderTemplate("Authenticated/logout.html");
    }

    public static void pingAssertionCallback(String body) {
        renderTemplate("Authenticated/assertion.html", request, body);
    }
}
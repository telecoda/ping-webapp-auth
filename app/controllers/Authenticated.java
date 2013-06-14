package controllers;

import play.mvc.Controller;

public class Authenticated extends Controller {
    public static void authenticated() {
        renderTemplate("Authenticated/authenticated.html");
    }
    
    public static void logout() {
        renderTemplate("Authenticated/logout.html");
    }

}
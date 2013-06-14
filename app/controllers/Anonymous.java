package controllers;

import play.mvc.Controller;

public class Anonymous extends Controller {

    public static void anonymous() {
        renderTemplate("Anonymous/anonymous.html");
    }
    
    public static void login() {
        renderTemplate("Anonymous/login.html");
    }

}
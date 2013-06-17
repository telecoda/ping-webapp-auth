package controllers;

import play.Play;
import play.mvc.Controller;

public class Anonymous extends Controller {

    public static void anonymous() {
        renderTemplate("Anonymous/anonymous.html");
    }
    
    public static void login() {
    	
    	String pingLoginUrl = Play.configuration.getProperty("ping.login.url");
    	redirect(pingLoginUrl);
    }

}
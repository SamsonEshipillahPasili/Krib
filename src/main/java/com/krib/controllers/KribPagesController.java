/*
 * This is a contoller class for all the web pages used
 * used by Krib. It has methods that map requested pages
 * to the resources hosted on the server 
 */
package com.krib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Eshipillah Pasili Samson
 */
@Controller
public class KribPagesController {

    // this is the page suffix to be used by the user when sending a 
    // request e.g home.hmtl, home.php (meh :-(, haha), home.asp
    private String pageSuffix = ".html";

    @GetMapping
    public String tenantDashboard() {
        return "user_dashboard";
    }
}

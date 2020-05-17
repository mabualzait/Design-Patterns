package com.company.proxy;

import java.util.Arrays;
import java.util.List;

public class Executor {

    public static void main(String[] args) {
         List<String> mySites = Arrays.asList("malikabualzait", "speak2geek", "twitter", "youtube", "facebook");

        InternetServiceProvider isp = new InternetProxy();

        for(String site : mySites){
            System.out.println(isp.serveSite(site));
        }
    }
}

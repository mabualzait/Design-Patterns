package com.company.proxy;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements InternetServiceProvider {

    private List<String> blockedSites = Arrays.asList("twitter", "youtube", "facebook");

    @Override
    public String serveSite(String url) {
        InternetLog(url);
        if(blockedSites.contains(url))
            return "This website is blocked!!";
        return new Zain().serveSite(url);
    }

    private void InternetLog(String url) {
        System.out.printf("[%d] -- %s  requested\n",System.currentTimeMillis(),url);
    }
}

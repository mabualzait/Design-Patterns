package com.company.proxy;

public class Zain implements InternetServiceProvider {

    private int browsingSpeed = 10;

    @Override
    public String serveSite(String url) {
        return String.format("https://%s.com", url);
    }

    public int getBrowsingSpeed() {
        return browsingSpeed;
    }
}

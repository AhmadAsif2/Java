package com.ahmad;

// Abstraction and Coupling Concepts
public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress(address, true);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    // Abstraction and Coupling
    // Hiding unnecessary details (internal details)
    private String findIpAddress(String address, boolean cache) {
        return "127.0.0.1";
    }

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }
}

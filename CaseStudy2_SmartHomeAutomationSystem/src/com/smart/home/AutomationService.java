package com.smart.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutomationService {

    @Autowired
    private User user;

    @Autowired
    private Device device;

    public void run() {
        System.out.println("Welcome, " + user.getName() + " (Home ID: " + user.getHomeId() + ")");
        System.out.println("Controlling device: " + device.getDeviceType());
        device.turnOn();
        device.turnOff();
    }
}

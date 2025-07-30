package com.smart.home;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name = "Swathi";
    private String homeId = "H001";

    public String getName() {
        return name;
    }

    public String getHomeId() {
        return homeId;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", homeId=" + homeId + "]";
    }
}

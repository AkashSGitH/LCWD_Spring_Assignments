package com.core.assignment1.controller;

import com.core.assignment1.service.IUserService;

public class UserController {

    private IUserService userService;

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public void handleUserRequest() {
        System.out.println("Handling the user's request");
        userService.someUserService();
    }

}

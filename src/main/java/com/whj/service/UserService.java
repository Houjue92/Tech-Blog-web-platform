package com.whj.service;

import com.whj.po.User;

public interface UserService {

    User checkuser(String username, String password);
}

package cn.nuke666.canteencomment.service;

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);

}

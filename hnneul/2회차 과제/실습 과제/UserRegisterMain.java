package practice.UserRester;

import java.util.ArrayList;
import java.util.Scanner;

public class UserRegisterMain {
    public static void main(String[] args){
        User user = new User();
        UserRegisterService service = new UserRegisterService();

        service.start();

        service.register();

    }
}

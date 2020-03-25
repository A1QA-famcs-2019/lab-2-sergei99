package driver;

import java.util.ResourceBundle;

public class TestRes {
    private static ResourceBundle testRes = ResourceBundle.getBundle("TestRes");

    public static String getLogin()
    {
        return testRes.getString("login");
    }

    public static String getPassword()
    {
        return testRes.getString("password");
    }

}

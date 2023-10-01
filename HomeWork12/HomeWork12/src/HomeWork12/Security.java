package HomeWork12;

public class Security {
    //static String login = "dom";
    //static String password = "san";
    //static String confirmPassword;

    static public boolean registration(String login, String password, String confirmPassword) {
        try {
            if (login.length() < 20 && login.trim().indexOf(" ") == -1) {
                if (password.length() < 20 && password.indexOf(" ") == -1 && password.equals(confirmPassword)) {
                    System.out.println("Registration done");
                    return true;
                } else throw new WrongPasswordException("Password length is more than 20" +
                        "or contains spaces or is missing at least one digit or passwords or passwords don't match");
                //System.out.println("never login");
            } else throw new WrongLoginException("Login length is more than 20 or contains spaces");
        } catch (WrongLoginException |
                 WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}


        /*if (login.equalsIgnoreCase("dom")) {//проверка на правильность ввода логина
            this.login = login;
            System.out.println("done");
        } else {
            System.out.println("neverniy login");
        }
       *//* public String getLogin () {
            return login;*//*
        }
    }*/

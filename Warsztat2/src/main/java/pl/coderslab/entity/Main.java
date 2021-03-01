package pl.coderslab.entity;

public class Main {
    public static void main(String[] args) {

    }

    public static String userToString(User user) {
        String result = "{User} : \nName: " + user.getUserName() +
                "\nEmail: " + user.getEmail() +
                "\nPassword: " + user.getPassword();
        return result;
    }

}

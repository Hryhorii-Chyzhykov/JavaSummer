package code.model.data;

public class LoginAlreadyExistsException extends Exception {
    private String loginData;

    public String getLoginData() {
        return loginData;
    }

    public LoginAlreadyExistsException(String message, String loginData) {
        super(message);
        this.loginData = loginData;
    }

}

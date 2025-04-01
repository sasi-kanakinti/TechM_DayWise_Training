class Authenticator {
    private class Validator {
        private String correctPassword = "admin123";
        public boolean validate(String password) {
            return correctPassword.equals(password);
        }
    }
    
    public void login(String password) {
        Validator validator = new Validator();
        if (validator.validate(password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Incorrect Password");
        }
    }

    public static void main(String[] args) {
        Authenticator auth = new Authenticator();
        auth.login("admin123");
    }
}

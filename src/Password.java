public class Password {
    String password;

    public String getPassword() {
        String tmp = this.password;
        reversePassword(tmp);
        return tmp;
    }

    public void setPassword(String password) {
        reversePassword(password);
        this.password = password;
    }

    @Override
    public String toString() {
        return "Das Password ist: " + this.password;
    }

    private static String reversePassword(String password) {
        String[] temp = password.split("");
        password = "";
        for (int i = temp.length - 1; i >= 0; i--) {
            password += temp[i];
        }
        return password;
    }
}

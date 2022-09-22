package nikhil.nani.code.examples.sealed.classes;

public sealed class Admin implements User permits SuperAdmin {
    public String changePassword() {
        return "Password changed";
    }
}

package nikhil.nani.code.examples.sealed.classes;

public sealed interface User permits Owner, Admin, Resident {
    default String login() {
        return "Logged in";
    }
}

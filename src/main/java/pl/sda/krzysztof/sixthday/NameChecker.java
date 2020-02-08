package pl.sda.krzysztof.sixthday;

public class NameChecker {

    public String checkGender(String name) {
        return name.endsWith("a") ? "GIRL" : "BOY";
    }
}

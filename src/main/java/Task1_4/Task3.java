package Task1_4;

public class Task3 {
    public static void main(String[] args) {
        String email1 = "user@example.com";
        String email2 = "Invalid email";

        System.out.println(validateEmail(email1));
        System.out.println(validateEmail(email2));
    }

    public static boolean validateEmail(final String email) {

        if (!email.contains("@")) {
            return false;
        }

        String[] parts = email.split("@");

        if (parts.length != 2 || parts[1].isEmpty()) {
            return false;
        }

        if (!parts[1].contains(".")) {
            return false;
        }

        String[] domainParts = parts[1].split("\\.");

        if (domainParts.length < 2) {
            return false;
        }

        for (String domainPart : domainParts) {
            if (domainPart.isEmpty()) {
                return false;
            }
        }

        return true;
    }
}


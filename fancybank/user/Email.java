/*
 * User attribute email, provide a simple checker to validate email address
 */
package fancybank.user;

public class Email {
    private String email;

    public Email() {
        this.email = "";
    }

    public Email(String email) {
        this.email = email;
    }

    public String get() {
        return email;
    }

    public void set(String email) {
        if (email.contains("@")) {
            this.email = email;
        }
    }

    public String toString() {
        return email;
    }

}

/*
 * User attribute username
 */
package fancybank.user;

public class Username {
    private String username;

    public Username() {
        this.username = "";
    }

    public Username(String username) {
        this.username = username;
    }

    public String get() {
        return username;
    }

    public void set(String username) {
        this.username = username;
    }

    public String toString() {
        return username;
    }

}

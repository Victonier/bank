/*
 * Base class for any kind of user, including customer and manager
 * They all have a sort of basic infomation, such as UID, username, name, address, email, password
 */
package fancybank.user;

public abstract class User {
    private UID UID;
    private Username username;
    private Name name;
    private Address address;
    private Email email;
    private Password password;

    public User() {
        this.UID = new UID();
        this.username = new Username();
        this.name = new Name();
        this.address = new Address();
        this.email = new Email();
    }

    public User(UID UID, Username username, Name name, Address address, Email email, Password password) {
        this.UID = UID;
        this.username = username;
        this.name = name;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public User(int uid, String username, String firstName, String middleName, String lastName, String street,
            String city, String state, String zip, String country, String email, String password) {
        this.UID = new UID(uid);
        this.username = new Username(username);
        this.name = new Name(firstName, middleName, lastName);
        this.address = new Address(street, city, state, zip, country);
        this.email = new Email(email);
        this.password = new Password(password);
    }

    public UID getUID() {
        return UID;
    }

    public void setUID(UID UID) {
        this.UID = UID;
    }

    public Username getUsername() {
        return username;
    }

    public void setUsername(Username username) {
        this.username = username;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public String toString() {
        return "UID: " + UID + "Username: " + username + " Name: " + name + " Address: " + address + " Email: " + email;
    }

}

/*
 * An important user attribute password
 * we store the salted hash of the password and the salt
 * the salt is randomly generated to prevent rainbow table attack
 */

package fancybank.user;

import java.util.Random;

import org.apache.commons.codec.digest.DigestUtils;

public class Password {
    private String password;
    private String salt;

    public String getRandomSalt() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 32;
        Random random = new Random(System.currentTimeMillis());
// @formatter:off
        String generatedString = random.ints(leftLimit, rightLimit + 1)
            .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
            .limit(targetStringLength)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();
// @formatter:on
        return generatedString;
    }

    public String getEncryptedPassword(String password) {
        String re = DigestUtils.sha256Hex(salt + String.format("%-32s", password));
        return re;

    }

    public Password() {
        this.salt = getRandomSalt();
        this.password = "";
    }

    public Password(String password) {
        this.salt = getRandomSalt();
        if (!checkPassword(password)) {
            this.password = "";
            return;
        }
        set(password);
    }

    public boolean checkPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        if (password.length() > 32) {
            return false;
        }
        return true;
    }

    public void set(String password) {
        this.password = getEncryptedPassword(password);
    }

    public boolean validate(String password) {
        return this.password.equals(getEncryptedPassword(password));
    }

}

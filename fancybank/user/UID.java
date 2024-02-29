/*
 * User attribute UID
 */
package fancybank.user;

public class UID {
    private int UID;

    public UID() {
        this.UID = 0;
    }

    public UID(int UID) {
        if (UID < 0) {
            this.UID = 0;
            return;
        }
        this.UID = UID;
    }

    public int get() {
        return UID;
    }

    public void set(int UID) {
        if (UID < 0) {
            return;
        }
        this.UID = UID;
    }
}

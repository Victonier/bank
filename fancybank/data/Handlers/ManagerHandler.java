package fancybank.data.Handlers;

import fancybank.user.Address;
import fancybank.user.Email;
import fancybank.user.Manager;
import fancybank.user.Name;
import fancybank.user.Password;
import fancybank.user.UID;
import fancybank.user.Username;

/**
 * @author Haodong Chen hjc5283@bu.edu
 *         Class for maintaining the managers' list.
 */
public class ManagerHandler implements ArrayAppend<Manager> {

    private Manager[] managers;

    public Manager[] getManagers() {
        return managers;
    }

    public ManagerHandler() {
        managers = new Manager[0];
    }

    public void setManagers(Manager[] managers) {
        this.managers = managers;
    }

    public Manager addManager(Username username, Name name, Address address, Email email, Password password) {
        int maxId = -1;
        for (Manager c : managers) {
            maxId = (c.getUID().get() > maxId ? c.getUID().get() : maxId);
        }
        Manager managerNew = new Manager(new UID(maxId + 1), username, name, address, email, password);
        managers = addElement(managers, managerNew);
        return managerNew;
    }

}

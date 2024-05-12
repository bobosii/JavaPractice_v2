package InsuranceManagementSystem;

import java.util.List;

public class AddressManager {
    private User user;

    public AddressManager(User user) {
        super();
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void addAddress(Address address) {
        this.user.getAddressList().add(address);
    }

    public void deleteAddress(Address address) {
        user.getAddressList().remove(address);
    }

}

package srp.modem_srp_solution;

public class ConnectionManagerImpl implements IConnectionManager{
    @Override
    public void dial(String phoneNumber) {
        System.out.println("connected successfully");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected successfully");
    }
}

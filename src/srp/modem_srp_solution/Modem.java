package srp.modem_srp_solution;

public class Modem implements IConnectionManager, IDataManager{

        private IConnectionManager connection;
        private IDataManager dataChannel;

        public Modem(IConnectionManager connection, IDataManager dataChannel) {
            this.connection = connection;
            this.dataChannel = dataChannel;
        }

        @Override
        public void dial(String phoneNumber) {
            connection.dial(phoneNumber);
        }

        @Override
        public void disconnect() {
            connection.disconnect();
        }

        @Override
        public void send(String str) {
            dataChannel.send(str);
        }

        @Override
        public int receive() {
            return dataChannel.receive();
        }
}

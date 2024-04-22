package patterns.bridge;

public class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void setChannel(int channel) {
        device.setChannel(channel);
    }
}
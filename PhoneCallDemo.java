abstract class PhoneCall {
    private String phoneNumber;
    private double price;

    public PhoneCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.price = 0.0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getPrice() {
        return price;
    }

    public abstract void displayInfo();
}

class IncomingPhoneCall extends PhoneCall {
    public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        setPrice(0.02);
    }

    @Override
    public void displayInfo() {
        System.out.println("Incoming Call - Phone Number: " + getPhoneNumber() + ", Rate: " + getPrice() + " per call");
    }
}

class OutgoingPhoneCall extends PhoneCall {
    private int minutes;

    public OutgoingPhoneCall(String phoneNumber, int minutes) {
        super(phoneNumber);
        this.minutes = minutes;
        setPrice(0.04 * minutes);
    }

    @Override
    public void displayInfo() {
        System.out.println("Outgoing Call - Phone Number: " + getPhoneNumber() + ", Rate: " + 0.04 + " per minute, Minutes: " + minutes + ", Total Price: $" + getPrice());
    }
}

public class PhoneCallDemo {
    public static void main(String[] args) {
        PhoneCall incomingCall = new IncomingPhoneCall("123-456-7890");
        incomingCall.displayInfo();

        PhoneCall outgoingCall = new OutgoingPhoneCall("987-654-3210", 10);
        outgoingCall.displayInfo();
    }
}

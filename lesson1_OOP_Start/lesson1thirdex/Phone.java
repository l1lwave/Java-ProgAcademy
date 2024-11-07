package lesson1thirdex;

public class Phone {
    private String phoneNumber;
    private String model;
    private Network network;
    
    public Phone(String phoneNumber, String model) {
        this.phoneNumber = phoneNumber;
        this.model = model;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void register(Network network) {
        network.register(this);
        this.network = network;
    }
    
    public void takeCall(String phone) {
        if (network.isRegistered(this.phoneNumber) && network.isRegistered(phone)) {
            System.out.println("You are calling number: " + phone);
            Phone phoneout = network.getPhoneByNumber(phone);
            if (phoneout != null) {
                connect(this, phoneout);
            } else {
                System.out.println("The recipient's phone is not available.");
            }
        } else {
            System.out.println("This number isn't registered.");
        }
    }
    
    private void getCall(String number) {
        System.out.println("Number " + number + " is calling you on " + this.toString());
    }
    
    private void connect(Phone inPhone, Phone outPhone) {
        System.out.println("Connecting with " + outPhone + "....");
        outPhone.getCall(inPhone.getPhoneNumber());
    }
    
    @Override
    public String toString() {
        return "Phone [phoneNumber=" + phoneNumber + ", model=" + model + "]";
    }
}

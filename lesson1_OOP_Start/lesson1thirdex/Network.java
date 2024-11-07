package lesson1thirdex;

import java.util.Arrays;

public class Network {
    private Phone[] numbers = new Phone[0];
    
    public void register(Phone number) {
        if (number.getPhoneNumber() != null && !number.getPhoneNumber().isEmpty()) {
            numbers = Arrays.copyOf(numbers, numbers.length + 1);
            numbers[numbers.length - 1] = number;
        }
    }
    
    public boolean isRegistered(String number) {
        for (Phone phone : numbers) {
            if (number.equals(phone.getPhoneNumber())) {
                return true;
            }
        }
        return false;
    }
    
    public Phone getPhoneByNumber(String phoneNumber) {
        for (Phone phone : numbers) {
            if (phone.getPhoneNumber().equals(phoneNumber)) {
                return phone;
            }
        }
        return null;
    }
}

package designPatterns.creational;


// when client needs to work with multiple types of objects
// when object creation is needed at runtime
public class Factory {
    public static void main(String[] args) {
        LogisticService logisticService = new LogisticService();
        logisticService.send("Air");
    }

}

interface Logistics {
    void send();

//    void send(String mode);
}

// Factory Pattern
class Road implements Logistics {

    @Override
    public void send() {
        System.out.println("Sending by road");
    }
}

class Air implements Logistics {

    @Override
    public void send() {
        System.out.println("Sending by air");
    }
}

class LogisticFactory {
    public static Logistics getLogistics(String mode) {
        if (mode.equals("Air")) {
            return new Air();
        } else if (mode.equals("Road")) {
            return new Road();
        }
        return new Air(); // default value
    }
}

class LogisticService {
    Logistics logistics;
    public void send(String mode) {
        this.logistics = LogisticFactory.getLogistics(mode);
        logistics.send();
    }
}

// wrong way
class LogisticsImpl implements Logistics {
    public void send() {

    }

    // wrong way
//    @Override
//    public void send(String mode) {
//        if(mode.equals("Air")) {
//
//        } else if(mode.equals("Road")) {
//
//        }
//    }
}

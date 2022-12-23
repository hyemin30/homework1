public class Transportation {

    int num = 0;
    int oil = 100;
    int speed;
    int maxPassenger;
    int currentPassengers = 0;
    int charge;
    String status;


    void driveEnd() {
        this.status = "차고지행";
    }

    void setOil(int oil) {

    }

    void setSpeed(int speed) {
        this.speed += speed;
    }

    void setStatus(String status) {
        this.status = status;
    }

    void addPassenger(int passenger) {
    }



}

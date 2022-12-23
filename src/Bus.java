public class Bus extends Transportation{

    static int busNum = 0;
    int num;     {
        ++busNum;
        num = busNum;
    }
    public Bus() {
        maxPassenger = 30;
        status = "운행";
        charge = 1000;
        System.out.println(num + "번 버스객체 만들어짐!");
    }

    @Override
    void drive() {
        status = "운행";
    }

    @Override
    void setOil(int oil) {
        this.oil += oil;

        System.out.println("주유량: " + this.oil);
        if (this.oil < 10) {
            this.status = "차고지행";
            System.out.println("주유가 필요합니다");
            System.out.println("상태: " + status);
        }
    }

    @Override
    void addPassenger(int passenger) {
        if (currentPassengers + passenger > maxPassenger) {
            System.out.println("최대 승객 수를 초과했습니다");
        } else {
            System.out.println("탑승 승객수는 = " + passenger);
            System.out.println("잔여 승객수는 = " + (maxPassenger - currentPassengers - passenger));
            System.out.println("요금 확인 = " + charge * passenger);
            currentPassengers += passenger;
        }

    }
}

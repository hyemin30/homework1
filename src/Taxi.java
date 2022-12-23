public class Taxi extends Transportation {

    static int taxiNum = 0;
    int num;     {
        ++taxiNum;
        num = taxiNum;
    }

    int chargeByDistance;
    int distance;
    int totalCharge;

    int income;

    public Taxi() {
        maxPassenger = 4;
        charge = 3000;
        chargeByDistance = 1000;
        distance = 1;
        speed = 0;
        status = "일반";
        drive();
        System.out.println(num + "번 택시 생성!");
    }

    void drive() {
        if (oil < 10) {
            setStatus("운행불가");
        }
    }

    @Override
    void setOil(int oil) {
        this.oil += oil;

        if (this.oil <= 0) {
            setStatus("운행불가");
            System.out.println("주유량 : " + this.oil);
            System.out.println("주유 필요");

        } else {
            setStatus("일반");
            System.out.println("주유량 : " + this.oil);
        }

    }

    void addPassenger(int passenger, String destination, int distanceToDestination) {

        if (passenger > maxPassenger) {
            System.out.println("최대 승객 수를 초과했습니다");
        } else if (status.equals("일반")) {
            totalCharge = charge + (distanceToDestination - 1) * chargeByDistance;
            setStatus("운행중");

            income += totalCharge;
            System.out.println("탑승 승객 수 = " + passenger);
            System.out.println("잔여 승객 수 = " + (maxPassenger - passenger));
            System.out.println("기본 요금 확인 = " + charge);
            System.out.println("목적지 = " + destination);
            System.out.println("목적지까지 거리 = " + distanceToDestination + "km");
            System.out.println("지불할 요금 = " + totalCharge);
            System.out.println("상태 = " + status);
        } else {
            System.out.println("탑승불가");
        }


    }
}

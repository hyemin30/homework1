public class Main {
    public static void main(String[] args) {
//        Bus bus1 = new Bus();
//        Bus bus2 = new Bus();
//
//        bus1.addPassenger(2);
//        bus1.setOil(-50);
//        bus1.setStatus("차고지행");
//        bus1.setOil(10);
//        bus1.addPassenger(45);
//        bus1.addPassenger(5);
//        bus1.setOil(-55);

        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();

        System.out.println("주유량: " + taxi1.oil);
        System.out.println("상태: " + taxi1.status);

        taxi1.addPassenger(2, "서울역", 2);
        taxi1.setOil(-80);
        System.out.println("누적요금 = " + taxi1.income);
        taxi1.addPassenger(5, "서울역", 2);
        taxi1.addPassenger(3, "구로디지털단지역", 12);
        taxi1.setOil(-20);
        System.out.println("상태: " + taxi1.status);
        System.out.println("누적 요금: " + taxi1.income);
    }
}
package _05_class._interface;

// 움직임에 대한 인터페이스
interface Move {
    void moveforward();
    void movebackword();
}

// 전원에 대한 인터페이스
interface Power {
    void powerOn();
    void powerOff();
}

// 인터페이스는 인터페이스를 상속 받을 수 있음
// - extands 키워드 사용
// - 인터페이스 다중 상속 가능
interface Car extends Move, Power {
    void changeGear(int gear);
}

class Suv implements Car {
    @Override
    public void moveforward() {
        System.out.println("앞으로 움직인다.");
    }

    @Override
    public void movebackword() {
        System.out.println("뒤로 움직인다.");
    }

    @Override
    public void powerOn() {
        System.out.println("시동 on");
    }

    @Override
    public void powerOff() {
        System.out.println("시동 off");
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("기여 변경" + gear);
    }
}

public class InterfaceEx02 {
    public static void main(String[] args) {
        Suv mySuv = new Suv();
        mySuv.powerOn();
        mySuv.changeGear(5);
        mySuv.moveforward();
        mySuv.movebackword();
        mySuv.moveforward();
        mySuv.powerOff();
    }
}

package _05_class._access_modifier._pack03;

import _05_class._access_modifier._pack05.Person;

public class B {
    public void method() {
        A a = new A();
        a.field1 = 11; // o
        a.field2 = 22; // o
//        a.field3 = 33; // x : private field 이므로 같은 클래스에서만 접근 가능

        // 메소드 호출
        a.method1(); // o
        a.method2(); // o
//        a.method3(); // x : private 메소드이므로 같은 클래스에서만 호출 가능
    }
}

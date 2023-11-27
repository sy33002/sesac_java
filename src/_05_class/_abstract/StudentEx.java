package _05_class._abstract;

public class StudentEx {
    public static void main(String[] args) {
        Kim bumsu = new Kim("김범수", "ABC 고등학교", 17, 20220001);
        Baek younghee = new Baek("백영희", "XYZ 고등학교", 18, 20220002);
        System.out.println("=== " + bumsu.getName() + " ===");
        System.out.println("학교: " + bumsu.getSchool());
        System.out.println("나이: " + bumsu.getAge());
        bumsu.todo();

        System.out.println("---------------------------");
        System.out.println("=== " + younghee.getName() + " ===");
        System.out.println("학교: " + younghee.getSchool());
        System.out.println("나이: " + younghee.getAge());
        bumsu.todo();
    }
}

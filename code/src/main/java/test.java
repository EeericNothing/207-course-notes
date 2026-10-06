class SuperClass {
    String value = "SuperField";
    void show() {
        System.out.println("SuperMethod");
    }
}

class SubClass extends SuperClass {
    String value = "SubField";
    @Override
    void show() {
        System.out.println("SubMethod");
    }
}

public class test {
    public static void main(String[] args) {
        SuperClass item = new SubClass();
        System.out.println(item.value);
        item.show();
    }
}
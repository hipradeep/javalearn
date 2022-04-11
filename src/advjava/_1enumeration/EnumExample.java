package advjava._1enumeration;

public class EnumExample {

    //Enumerations serve the purpose of representing a group of named constants in a programming language.

    public static void main(String[] args) {

        Days days=Days.MONDAY;
        System.out.println(days.name());
        System.out.println(days.getValue());
        for (Days d: Days.values()) {
            System.out.println(d.name());
        }
        System.out.println("HI");
    }

}


enum Days{
     MONDAY("1"), TUESDAY("2"),WEDNESDAY("3"), THURSDAY("4"), FRIDAY("5"), SATURDAY("6"),SUNDAY("7");

   private String value;

    Days(String value) {
        this.value=value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
enum Colors{
    RED, GREEN, YELLOW;
}
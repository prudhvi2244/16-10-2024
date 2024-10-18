public class StringDemo1 {

    public static void main(String[] args) {

        String city="Hyderabad";
        String employeeName=new String("Raj Prudhvi");
        String customerName=new String("Raj Prudhvi");
        String s6=customerName;
        String s7="Raj Prudhvi";
        String s8="Raj Prudhvi";

        System.out.println(city==employeeName);

        System.out.println(customerName==s6);

        System.out.println(employeeName==s7);
        System.out.println(s8==s7); // true



    }
}

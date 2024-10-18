public class StringDemo3 {
    public static void main(String[] args) {

        String str = "HelloWorld";
        System.out.println(" Length of the String : "+str.length());
        System.out.println(" Is 'str' String empty? "+str.isEmpty());
        System.out.println("Character at index position '5' : "+str.charAt(5));

        String password="capgemini";
        String confirmPassword="Capgemini";

        System.out.println("Password and confirm password are same ?: "+password.equals(confirmPassword));
        System.out.println("Password and confirm password are same  ?: "+password.equalsIgnoreCase(confirmPassword));

        String email="prudhviraj.p@capgemini.com";

        System.out.println("email staring with 'p' ?"+ email.startsWith("p"));
        System.out.println("email ending with 'capgemini.com' ?"+ email.endsWith("capgemini.com"));

        System.out.println("Index position of 'l' is :"+str.indexOf("l"));
        System.out.println("Last Index position of 'l' is :"+str.lastIndexOf("l"));
        System.out.println("Index position of 'o' Staring from position '5' is :"+str.indexOf("o",5));


        String url="www.facebook.com";
        String[] s= url.split("[.]");

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        String s10="a";
        String s11="Z";

        String uppercaseString=s10.toUpperCase();
        String lowerString=s11.toLowerCase();

        System.out.println(uppercaseString);
        System.out.println(lowerString);


    }
}

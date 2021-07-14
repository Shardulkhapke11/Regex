import java.util.Scanner;

public class UserRegistration {
    public static void main( String[] args ) {
        UserRegistration userregistration = new UserRegistration();
        Scanner scanner = new Scanner(System.in);

        //System.out.println(firstName("Shardul"));

        String firstName = scanner.nextLine();
        userregistration.firstName(firstName);
        System.out.println(userregistration.firstName(firstName));

        //System.out.println(lastName("Khapke"));

        String lastName = scanner.nextLine();
        userregistration.lastName(lastName);
        System.out.println(userregistration.lastName(lastName));

        //System.out.println(Email("shardulkhapke04@bl.co.in"));

        String Email = scanner.nextLine();
        userregistration.Email(Email);
        System.out.println(userregistration.Email(Email));

        //System.out.println(MobileNo("+918888888888"));

        String MobileNo = scanner.nextLine();
        userregistration.MobileNo(MobileNo);
        System.out.println(userregistration.MobileNo(MobileNo));

        //System.out.println(Password("1S@hardul"));

        String Password = scanner.nextLine();
        userregistration.Password(Password);
        System.out.println(userregistration.Password(Password));

    }

    // validate First Name

    public static boolean firstName( String firstName ) {
        return firstName.matches( "[A-Z][a-z]*" );
    }

    // validate Last Name

    public static boolean lastName( String lastName ) {
        return lastName.matches( "[A-Z][a-z]*" );
    }

    // validate Email

    public static boolean Email( String Email ) {
        return Email.matches( "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" );
    }

    // validate MobileNo

    public static boolean MobileNo( String MobileNo ) {
        return MobileNo.matches( "^\\+([0-9\\-]?){9,11}[0-9]$" );
    }

    // validate Password

    public static boolean Password( String Password ) {
        return Password.matches("^[0-9A-Z]{2}+@([a-z]{6,})*$" );
    }

}

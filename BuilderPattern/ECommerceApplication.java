package BuilderPattern;

public class ECommerceApplication {
    public static void main (String[] args){
        // In-order sample
        User HannahCondada = new User.userBuilder()
                .firstName("Hannah")
                .lastName("Condada")
                .email("hannah.condada@neu.edu.ph")
                .address("Eastwood Residences, Phase 1-A, Rodriguez Rizal")
                .phone("+63 966 496 9386")
                .age(21)
                .build();

        System.out.println(HannahCondada.firstName);
        System.out.println(HannahCondada.lastName);
        System.out.println(HannahCondada.email);
        System.out.println(HannahCondada.address);
        System.out.println(HannahCondada.phone);
        System.out.println(HannahCondada.age);

        System.out.println();

        //Jumbled order sample
        User JaneDoe = new User.userBuilder()
                .phone("+63 123 456 7890")
                .firstName("Jane")
                .address("Nowhere St. Nonexistent Area X01")
                .lastName("Doe")
                .age(25)
                .email("JDoe@gmail.com")
                .build();

        System.out.println(JaneDoe.firstName);
        System.out.println(JaneDoe.lastName);
        System.out.println(JaneDoe.email);
        System.out.println(JaneDoe.address);
        System.out.println(JaneDoe.phone);
        System.out.println(JaneDoe.age);
    }
}

package BuilderPattern;

public class User {
    //I've learned that protected attributes are only visible within the class and its subclasses!
    //Since this is a protected attribute, it is represented as # in the UML diagram,
    //You will notice that in the "Symbols Panel" of GitHub it will not show these,
    //because "protected" indicates the visibility of the attributes.
    protected final String firstName;
    protected final String lastName;
    protected final String email;
    protected final String address;
    protected final String phone;
    protected final Integer age;

    private User(userBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
    }

    protected static class userBuilder{
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private String phone;
        private Integer age;

        public userBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public userBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public userBuilder email(String email){
            this.email = email;
            return this;
        }

        public userBuilder address(String address){
            this.address = address;
            return this;
        }

        public userBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public userBuilder age(Integer age){
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}

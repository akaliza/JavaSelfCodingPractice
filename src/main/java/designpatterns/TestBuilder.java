package designPatterns;

/**
 * Created by florakalisa on 10/4/16.
 */
public class TestBuilder {
    Person person = new Person.Builder("firstName", "lastName").buildMarried(true).build();
}

class Person{
    private String firstName;
    private String lastName;
    private int age;
    private boolean married;

    Person(Builder builder){
        firstName  = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
        married = builder.married;

    }

    public static class Builder {
        //required field
        private String firstName;
        private String lastName;
        // optional fied
        private int age;
        private boolean married;

        public Builder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder buildFirstName(String val){
            firstName = val;
            return this;
        }

        public Builder buildLastName(String val){
            lastName = val;
            return this;
        }
        public Builder buildAge(int val){
            age = val;
            return this;
        }
        public Builder buildMarried(boolean val){
            married = val;
            return this;
        }


        public Person build(){
            return new Person(this);
        }
    }
}

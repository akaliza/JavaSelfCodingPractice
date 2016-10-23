package designPatterns;

/**
 * Created by florakalisa on 10/4/16.
 */
public class TestBuilder {

    public static void main(String[] args) {
        Person person = new Person.Builder("firstName", "lastName").buildMarried(true).build();
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean married;

    Person(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
        married = builder.married;

    }

    public static class Builder {
        //required field - creation via the constructor
        private String firstName;
        private String lastName;
        // optional field - creation via method invocation
        private int age;
        private boolean married;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder buildAge(int val) {
            age = val;
            return this;
        }

        public Builder buildMarried(boolean val) {
            married = val;
            return this;
        }


        public Person build() {
            return new Person(this);
        }
    }
}

interface Builder<T> {
    public T build();
}

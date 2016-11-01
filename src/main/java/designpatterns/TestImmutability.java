package designpatterns;

/**
 * Created by florakalisa on 10/19/16.
 * Immutable cannot change after object creation
 * The only to change the object is to create a new one.
 * Immutables are stable and fault tolerant and can be shared freely
 * Immutables may lead to performance issue
 * => all variables finales,
 * => no setter methods,
 * => for any change, we need to create a new object
 * => protect the class to be extended
 * => Ensure exclusive access to any mutable attributes
 *
 *
 */
public class TestImmutability {

    public static void main(String[] args) {

        ImmutableAccount immutableAccount = new ImmutableAccount(8000);
        immutableAccount =  immutableAccount.withdraw(2000);
        System.out.println(immutableAccount.getBalance());
    }
}

final class ImmutableAccount {


    private final long balance;

    public ImmutableAccount (long balance){
        validate(balance);
        this.balance = balance;
    }

    private void validate(long balance) {
        if(balance < 0)
            throw new IllegalArgumentException("Balance cannot be negative");
    }


    public ImmutableAccount withdraw(long amount){
        long newBalance = this.balance - amount;
        return new ImmutableAccount(newBalance);
    }

    public long getBalance() {
        return balance;
    }
}

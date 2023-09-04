package com.sv;
public class ThrowThrowsDemo {

    public static void main(String[] args) {
        try {
            checkAge(15);  // Try changing this value to see different outputs
        } catch (NotEligibleForVotingException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws NotEligibleForVotingException {
        if (age < 18) {
            throw new NotEligibleForVotingException("Age " + age + " is not eligible for voting");
        } else {
            System.out.println("Eligible for voting");
        }
    }
}

// Our custom exception
class NotEligibleForVotingException extends Exception {
    public NotEligibleForVotingException(String message) {
        super(message);
    }
}

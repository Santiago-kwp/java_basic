package javabasic_02.test.loop_array;

public class InsufficientBalanceException extends RuntimeException {
    private final int currentBalance;
    private final int requestedAmount;

    public InsufficientBalanceException(String message, int currentBalance, int requestedAmount ) {
        super(message);
        this.currentBalance = currentBalance;
        this.requestedAmount = requestedAmount;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }
    public int getRequestedAmount() {
        return requestedAmount;
    }

}

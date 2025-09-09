package RuleEngine.Models;

// Ideally made using a builder pattern
public class Expense {
    // simple keeping the input me jo diya uska types simple.
    private final String expenseId;
    private final String tripId;
    private final Double amountUsd;
    private final String vendorName;
    // ExpenseType is simple ENUM because currently in the requirement we only have
    // the limited types
    private final ExpenseType expenseType;

    public Expense(String expenseId, String tripId, Double amountUsd, ExpenseType expenseType, String vendorName) {
        this.expenseId = expenseId;
        this.tripId = tripId;
        this.amountUsd = amountUsd;
        this.expenseType = expenseType;
        this.vendorName = vendorName;
    }

    public String getExpenseId() {
        return expenseId;
    }

    public String getTripId() {
        return tripId;
    }

    public Double getAmountUsd() {
        return amountUsd;
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }

    public String getVendorName() {
        return vendorName;
    }
}
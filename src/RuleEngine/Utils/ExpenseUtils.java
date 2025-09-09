package RuleEngine.Utils;

import java.util.List;

import RuleEngine.Models.Expense;

public class ExpenseUtils {

    // NOW WE CAN HAVE THE STATIC VALIDATORS UTILL FUNCs
    public static boolean areAllExpensesFromSameTrip(List<Expense> expenses) {
        if (expenses == null || expenses.isEmpty()) {
            return false;
        }
        // SIMPLE utility function to check if all expenses belong to the same trip
        String tripId = expenses.get(0).getTripId();
        for (Expense expense : expenses) {
            if (!expense.getTripId().equals(tripId)) {
                return false;
            }
        }
        return true;
    }
}

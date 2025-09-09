package RuleEngine.Services.Rules;

import java.util.List;
import java.util.Optional;

import RuleEngine.Violation;
import RuleEngine.Models.Expense;
import RuleEngine.Services.Rules.Interfaces.ITripRule;
import RuleEngine.Utils.ExpenseUtils;

public class TripTotalMaxRule implements ITripRule {

    // for one trip some max limit is there
    private final double MaxTripSupportedAmount;

    public TripTotalMaxRule(double maxTripSupportedAmount) {
        this.MaxTripSupportedAmount = maxTripSupportedAmount;
    }

    @Override
    public Optional<Violation> check(List<Expense> expenses) {
        // HERE WE GET THE LIST of expense hence some algorithmic operation can be
        // performed
        // NOW HERE WE need is some thing first we only need to take the expenses with
        // same trip id
        // and we need to calculate the total of thos expenses only and check for total
        // trip expense simple

        // TO VALIDATE THE TRIP ID WE CAN WRITE SOME UTILL FUNCTIONS (AGAIN DEPENDSON US
        // HOW WE WANT TO DESIGN IT)
        if (!ExpenseUtils.areAllExpensesFromSameTrip(expenses)) {
            return Optional.of(Violation.of("Expenses are not of the same trip"));
        }

        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmountUsd();
        }
        if (total > MaxTripSupportedAmount) {
            return Optional.of(Violation.of("Total trip expense exceeds the maximum limit" + total
                    + " that is more than " + MaxTripSupportedAmount));
        }
        return Optional.empty();
    }
}
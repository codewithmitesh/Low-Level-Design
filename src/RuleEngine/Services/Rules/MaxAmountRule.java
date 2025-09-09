package RuleEngine.Services.Rules;

import java.util.Optional;

import RuleEngine.Violation;
import RuleEngine.Models.Expense;
import RuleEngine.Services.Rules.Interfaces.IExpenseRule;

public class MaxAmountRule implements IExpenseRule {
    private final double MaxSupportedAmount;

    public MaxAmountRule(double maxSupportedAmount) {
        this.MaxSupportedAmount = maxSupportedAmount;
    }

    @Override
    public Optional<Violation> check(Expense e) {
        if (e.getAmountUsd() > MaxSupportedAmount) {
            return Optional.of(Violation
                    .of("Expense amount " + e.getAmountUsd() + " exceeds limit for expense id: " + e.getExpenseId()));
        }
        return Optional.empty();
    }
}

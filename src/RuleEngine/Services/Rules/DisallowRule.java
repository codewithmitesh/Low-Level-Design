package RuleEngine.Services.Rules;

import java.util.Optional;

import RuleEngine.Services.Rules.Interfaces.IExpenseRule;
import RuleEngine.Violation;
import RuleEngine.Models.Expense;

public class DisallowRule implements IExpenseRule {
    @Override
    public Optional<Violation> check(Expense e) {
        return Optional
                .of(Violation.of("Expense type " + e.getExpenseType() + "id:" + e.getExpenseId() + " is not allowed"));
    }
}

package RuleEngine.Services.Rules.Interfaces;

import java.util.Optional;

import RuleEngine.Models.Expense;
import RuleEngine.Violation;

public interface IExpenseRule {
    // We need to keep the return as Optional as we can return no violation means
    // null or empty
    // we keep optional to avoid the nullpointer expection simple!
    Optional<Violation> check(Expense e);
}

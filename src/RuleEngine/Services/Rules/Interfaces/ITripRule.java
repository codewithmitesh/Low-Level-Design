package RuleEngine.Services.Rules.Interfaces;

import java.util.List;
import java.util.Optional;

import RuleEngine.Violation;
import RuleEngine.Models.Expense;

public interface ITripRule {
    // here in one trip there will be multiple expenses hence list
    Optional<Violation> check(List<Expense> expenses);
}

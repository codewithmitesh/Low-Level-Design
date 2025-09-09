package RuleEngine.Services.Interfaces;

import java.util.List;
import java.util.Map;

import RuleEngine.Violation;
import RuleEngine.Models.Expense;
import RuleEngine.Models.ExpenseType;
import RuleEngine.Services.Rules.Interfaces.IExpenseRule;
import RuleEngine.Services.Rules.Interfaces.ITripRule;

// LETS SAY WE WANT MULTIPLE TYPE OR KIND OF RULE ENGINE THEN WE CAN SIMPLE
// IMPLEMENT THIS SIMPLE (JUST multiple clients in the strategy pattern simple
public interface IRuleEngine {
    List<Violation> evaluateRules(List<Expense> expenses, Map<ExpenseType, List<IExpenseRule>> registry,
            List<IExpenseRule> allExpenseRulesRegistry, // all expense rules registry
            List<ITripRule> tripRulesRegistry) // all trip rules registry simple
    ;
}

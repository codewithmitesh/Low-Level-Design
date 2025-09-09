package RuleEngine.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import RuleEngine.Violation;
import RuleEngine.Models.Expense;
import RuleEngine.Models.ExpenseType;
import RuleEngine.Services.Interfaces.IRuleEngine;
import RuleEngine.Services.Rules.Interfaces.IExpenseRule;
import RuleEngine.Services.Rules.Interfaces.ITripRule;

public class SimpleRuleEngine implements IRuleEngine {

    private void checkExpenseAgainstRules(Expense currExpense, List<IExpenseRule> rules,
            List<Violation> violationsResult) {
        for (IExpenseRule rule : rules) {
            Optional<Violation> violation = rule.check(currExpense);
            if (violation.isPresent()) {
                violationsResult.add(violation.get());
            }
        }
    }

    @Override
    public List<Violation> evaluateRules(List<Expense> expenses, Map<ExpenseType, List<IExpenseRule>> registry,
            List<IExpenseRule> allExpenseRulesRegistry, List<ITripRule> tripRulesRegistry) {
        // SIMPLE WE HAVE THE MULTILE REGISTRY WE CAN USE WHAT EVER WE WANT SIMPLE

        // THIS IS SIMPLE
        List<Violation> result = new ArrayList<>();

        // NOW WE NEED TO CHECK THE ALL EXPENSE AS WELL AS TRIP RULES HENCE CHECK
        for (Expense expense : expenses) {
            // get all expense rule simple
            List<IExpenseRule> rules = registry.getOrDefault(expense.getExpenseType(), List.of());

            // SO its simple we get all list of the rules simple
            // EXPENSETYPE -> RULE
            // RESTAURANT -> ALL RULES
            // WE are fetching simple like if the in the current expense the type is
            // RESTAURANT
            // then find all the rules with key restaurant from map registery simple
            // now for the current expense simple check all rules if any violates return
            // violation
            // we first fetch from the rules with expense type
            checkExpenseAgainstRules(expense, rules, result);
            // simple now try for all rules simple
            checkExpenseAgainstRules(expense, allExpenseRulesRegistry, result);
        }

        // 2. check the all trip rules simple
        // we pass the list of expense to tripRule list and try to map simple
        for (ITripRule tripRule : tripRulesRegistry) {
            Optional<Violation> violation = tripRule.check(expenses);
            if (violation.isPresent()) {
                result.add(violation.get());
            }
        }
        return result;
    }
}

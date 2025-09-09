package RuleEngine;

import java.rmi.server.ExportException;
import java.util.List;
import java.util.Map;

import RuleEngine.Models.Expense;
import RuleEngine.Models.ExpenseType;
import RuleEngine.Registry.RuleRegistery;
import RuleEngine.Services.Interfaces.IRuleEngine;
import RuleEngine.Services.Rules.Interfaces.IExpenseRule;
import RuleEngine.Services.Rules.Interfaces.ITripRule;

// this is just a runner function simple to run the whole rule enginer which we want agains the 
// list of expense simple 
public class RuleRunnerManager {
    private final IRuleEngine ruleEngine;

    public RuleRunnerManager(IRuleEngine ruleEngine) {
        this.ruleEngine = ruleEngine;
    }

    public void run(List<Expense> expenses) {
        Map<ExpenseType, List<IExpenseRule>> expenseRulesRegistry = RuleRegistery.getRulesRegistry();
        List<IExpenseRule> allExpenseRulesRegistry = RuleRegistery.getAllExpenseRulesRegistry();
        List<ITripRule> tripRulesRegistry = RuleRegistery.getAllTripRulesRegistry();

        List<Violation> violationsFinal = ruleEngine.evaluateRules(expenses, expenseRulesRegistry,
                allExpenseRulesRegistry, tripRulesRegistry);

        for (Violation vio : violationsFinal) {
            System.out.println(vio.getMessage());
        }
    }

}

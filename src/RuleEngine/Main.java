package RuleEngine;

import java.util.ArrayList;
import java.util.List;

import RuleEngine.Models.Expense;
import RuleEngine.Models.ExpenseType;
import RuleEngine.Services.SimpleRuleEngine;

public class Main {
    public static void main(String[] args) {
        List<Expense> expenses = new ArrayList<>();

        expenses.add(new Expense("1", "1", 100.0, ExpenseType.RESTAURANT, "Ramus"));
        expenses.add(new Expense("2", "1", 50.0, ExpenseType.RESTAURANT, "DMart"));
        expenses.add(new Expense("3", "1", 100.0, ExpenseType.RESTAURANT, "MacD"));

        RuleRunnerManager ruleRunner = new RuleRunnerManager(new SimpleRuleEngine());
        ruleRunner.run(expenses);
    }
}

package RuleEngine.Registry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import RuleEngine.Models.ExpenseType;
import RuleEngine.Services.Rules.Interfaces.IExpenseRule;
import RuleEngine.Services.Rules.Interfaces.ITripRule;
import RuleEngine.Services.Rules.DisallowRule;
import RuleEngine.Services.Rules.MaxAmountRule;
import RuleEngine.Services.Rules.TripTotalMaxRule;

public class RuleRegistery {
    // this will be static functions as w t need to create object of this class
    // as this is kind of a config.json file just for mapping
    public static Map<ExpenseType, List<IExpenseRule>> getRulesRegistry() {
        Map<ExpenseType, List<IExpenseRule>> registry = new HashMap<>();
        // populate the rules map

        // HERE WE WILL BE ADDING THE RULES which we want to apply for each expense type
        // this can be read from a config file also
        // this can be fetch from some sort of secret manager or config data or like
        // from
        // company config data platform (azure app config, aws config manager ) JSON
        // FILE

        // IF TYPE IS RESTAURANT THIS ARE THE RULES APPLIED
        registry.put(ExpenseType.RESTAURANT, List.of(new MaxAmountRule(70)));

        registry.put(ExpenseType.ENTERTAINMENT, List.of(new MaxAmountRule(40)));
        registry.put(ExpenseType.AIRFARE, List.of(new DisallowRule()));
        return registry;
    }

    // another registery simple another config or map to map epencetype to rule
    public static List<IExpenseRule> getAllExpenseRulesRegistry() {
        return List.of(new MaxAmountRule(200));
    };

    // another registry to trip rules
    public static List<ITripRule> getAllTripRulesRegistry() {
        return List.of(new TripTotalMaxRule(10));
    };
}

package com.techprimers;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine {

    List<RuleI<Phone, Phone>> rules;

    public RuleEngine() {
        rules = new ArrayList<>();
    }

    public Phone rule(Phone phone) {
        return rules.stream()
                .filter(rule -> rule.matches(phone))
                .map(rule -> rule.process(phone))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No Matching rule found"));
    }


    public RuleEngine registerRule(RuleI<Phone, Phone> rule) {
        rules.add(rule);
        return this;
    }


}

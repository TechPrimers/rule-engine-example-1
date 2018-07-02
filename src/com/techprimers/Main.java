package com.techprimers;

public class Main {


    public static void main(String[] args) {

        RuleEngine ruleEngine = new RuleEngine();
        ruleEngine
                .registerRule(new IPhone())
                .registerRule(new AndroidPhone())
                .registerRule(new WindowsPhone());

        Phone androidPhone = new Phone(Phone.OSType.WINDOWS);
        Phone phone = ruleEngine.rule(androidPhone);

        System.out.println("Output Phone: " + phone);


    }



}

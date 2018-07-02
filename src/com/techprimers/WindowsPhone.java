package com.techprimers;

public class WindowsPhone implements RuleI<Phone, Phone> {
    @Override
    public boolean matches(Phone input) {
        return input.getOsType().equals(Phone.OSType.WINDOWS);
    }

    @Override
    public Phone process(Phone input) {
        input.setModel("Nokia 1100");
        return input;
    }
}

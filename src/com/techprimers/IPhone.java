package com.techprimers;

public class IPhone implements RuleI<Phone, Phone> {

    @Override
    public boolean matches(Phone input) {
        return input.getOsType().equals(Phone.OSType.IOS);
    }

    @Override
    public Phone process(Phone input) {

        input.setModel("IPhone X");

        return input;
    }
}

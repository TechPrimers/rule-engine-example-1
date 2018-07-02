package com.techprimers;

public class Phone {

    private String model;
    private OSType osType;

    public Phone(OSType osType) {
        this.osType = osType;
    }

    public Phone() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public OSType getOsType() {
        return osType;
    }

    public void setOsType(OSType osType) {
        this.osType = osType;
    }

    enum OSType {
        ANDROID, IOS, WINDOWS
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Phone{");
        sb.append("model='").append(model).append('\'');
        sb.append(", osType=").append(osType);
        sb.append('}');
        return sb.toString();
    }
}

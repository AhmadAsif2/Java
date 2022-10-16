package com.ahmad;

public class UIControl {
    private boolean isBoolean = true;

    public UIControl(boolean isBoolean) {
        this.isBoolean = isBoolean;
        System.out.println("UI Control");
    }

    public void isEnabled() {
        isBoolean = true;
    }

    public void isDisabled() {
        isBoolean = false;
    }

    public boolean isBoolean() {
        return isBoolean;
    }
}

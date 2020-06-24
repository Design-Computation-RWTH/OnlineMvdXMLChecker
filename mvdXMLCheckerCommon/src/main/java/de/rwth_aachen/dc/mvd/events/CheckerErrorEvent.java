package de.rwth_aachen.dc.mvd.events;

public class CheckerErrorEvent {
    private final String message;
    private final String class_name;
    public CheckerErrorEvent(String message, String class_name) {
	super();
	this.message = message;
	this.class_name = class_name;
    }
    public String getMessage() {
        return message;
    }
    public String getClass_name() {
        return class_name;
    }

}
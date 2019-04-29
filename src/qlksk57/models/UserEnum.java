package qlksk57.models;

public enum UserEnum {
	ID("ID"),
    UserName("UserName"),
    Password("Password");
	
	private String text;

	UserEnum(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static UserEnum fromString(String text) {
        for (UserEnum b : UserEnum.values()) {
            if (b.text.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}

package productshop.domain.enums;

public enum Authority {
    ROOT, ADMIN, MODERATOR, USER;

    private static final String ROLE_PREFIX = "ROLE_";

    String role;

    Authority() {
        this.role = ROLE_PREFIX + name();
    }

    public Authority fromRole(String authority) {
        return authority == null ? null : Authority.valueOf(authority);
    }

    public String asRole() {
        return this.role;
    }
}

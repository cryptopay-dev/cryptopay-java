package me.cryptopay.util;

public final class StringUtils {
    /** Empty string. */
    public static final String EMPTY = "";

    private StringUtils() {}
    ;

    /**
     * Checks if given string is empty ("") or null.
     *
     * @param str the string to check.
     * @return true if string is empty or null
     */
    public static boolean isEmpty(final String str) {
        return str == null || str.length() == 0;
    }
}

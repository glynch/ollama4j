package io.github.glynch.jollama.client;

/**
 * Enumeration of the possible redirect options for
 * {@link JOllamaClient#builder()}.
 * 
 * @author Graham Lynch
 */
public enum Redirect {
    /**
     * Always redirect, except for HTTPS to HTTP urls.
     */
    NORMAL,
    /**
     * Never redirect.
     */
    NEVER,
    /**
     * Always redirect.
     */
    ALWAYS

}

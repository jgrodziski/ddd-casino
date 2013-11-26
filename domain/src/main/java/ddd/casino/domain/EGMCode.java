package ddd.casino.domain;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 *
 */
public class EGMCode {

    private String code;

    public EGMCode(String code) {
        checkNotNull(code);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}

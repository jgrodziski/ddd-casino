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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EGMCode egmCode = (EGMCode) o;

        if (code != null ? !code.equals(egmCode.code) : egmCode.code != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }
}

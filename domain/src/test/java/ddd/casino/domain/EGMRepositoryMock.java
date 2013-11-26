package ddd.casino.domain;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class EGMRepositoryMock implements EGMRepository {
    Map<EGMCode, EGM> map = new HashMap<EGMCode, EGM>();

    @Override
    public EGM store(EGM egm) {
        map.put(egm.getCode(), egm);
        return egm;
    }

    @Override
    public EGM load(EGMCode code) {
        return map.get(code);
    }
}

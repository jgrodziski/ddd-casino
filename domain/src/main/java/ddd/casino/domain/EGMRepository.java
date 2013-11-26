package ddd.casino.domain;

/**
 *
 */
public interface EGMRepository {
    public EGM store(EGM egm);
    public EGM load(EGMCode code);
}

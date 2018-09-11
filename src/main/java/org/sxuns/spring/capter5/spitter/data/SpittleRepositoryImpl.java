package org.sxuns.spring.capter5.spitter.data;

import org.springframework.stereotype.Component;
import org.sxuns.spring.capter5.spitter.domain.Spittle;
import org.sxuns.spring.capter5.spitter.exception.DuplicateSpittleException;
import org.sxuns.spring.capter5.spitter.vo.Spitter;

import java.util.List;
@Component
public class SpittleRepositoryImpl implements SpittleRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return null;
    }

    @Override
    public void save(Spitter spitter) {
        spitter.setId(1L);
        throw new DuplicateSpittleException();
    }

    @Override
    public Spittle findOne(Long spittleID) {
        return null;
    }
}

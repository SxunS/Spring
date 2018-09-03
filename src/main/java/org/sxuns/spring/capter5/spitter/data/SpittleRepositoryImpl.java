package org.sxuns.spring.capter5.spitter.data;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.sxuns.spring.capter5.spitter.domain.Spittle;
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

    }
}

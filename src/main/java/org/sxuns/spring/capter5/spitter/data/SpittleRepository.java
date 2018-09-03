package org.sxuns.spring.capter5.spitter.data;

import org.springframework.context.annotation.Bean;
import org.sxuns.spring.capter5.spitter.domain.Spittle;
import org.sxuns.spring.capter5.spitter.vo.Spitter;

import java.util.List;
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
    void save(Spitter spitter);
}

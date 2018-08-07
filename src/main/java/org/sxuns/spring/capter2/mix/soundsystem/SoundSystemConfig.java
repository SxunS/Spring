package org.sxuns.spring.capter2.mix.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author s_xun
 */
@Configuration
@Import({CDPlayerConfig.class,CDConfig.class})
public class SoundSystemConfig {
}

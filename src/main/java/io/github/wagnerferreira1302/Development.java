package io.github.wagnerferreira1302;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")
public @interface Development {

}

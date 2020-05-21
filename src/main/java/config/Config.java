package config;

import entity.Fish;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//конфигурация для контекста
@Configuration
@ComponentScan(basePackages = {"fishService", "entity"})
public class Config {

    @Bean(name = "defaultFish")
    public Fish getDefaultCar(){
        return new Fish();
    }
}

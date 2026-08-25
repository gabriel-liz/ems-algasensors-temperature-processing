package com.algaworks.algasensors.temperature.processing.api.config.jackson;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.module.SimpleModule;
import io.hypersistence.tsid.TSID;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TSIDJacksonConfig {

    //Essa configuracao é para que quando for enviado as temperaturas, o id do device não seja enviado com um objeto e sim como uma string, apenas com o TSID
    @Bean
    public Module tsidModule(){
        SimpleModule module = new SimpleModule();
        module.addSerializer(TSID.class, new TSIDToStringSerializer());
        return module;
    }
}

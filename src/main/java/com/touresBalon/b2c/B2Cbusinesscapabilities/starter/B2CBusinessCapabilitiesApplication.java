package com.touresBalon.b2c.B2Cbusinesscapabilities.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.touresBalon.b2c.B2Cbusinesscapabilities.controller.ServicesController;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.touresBalon.b2c.B2Cbusinesscapabilities.consumer",
        "com.touresBalon.b2c.B2Cbusinesscapabilities.controller",
        "com.touresBalon.b2c.B2Cbusinesscapabilities.dto",
        "com.touresBalon.b2c.B2Cbusinesscapabilities.entities",
        "com.touresBalon.b2c.B2Cbusinesscapabilities.impl",
        "com.touresBalon.b2c.B2Cbusinesscapabilities.interfaces",
        "com.touresBalon.b2c.B2Cbusinesscapabilities.mapper"

})
@EntityScan("com.touresBalon.b2c.B2Cbusinesscapabilities.entities")
@EnableJpaRepositories("com.touresBalon.b2c.B2Cbusinesscapabilities.consumer")

public class B2CBusinessCapabilitiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(B2CBusinessCapabilitiesApplication.class, args);
	}
}

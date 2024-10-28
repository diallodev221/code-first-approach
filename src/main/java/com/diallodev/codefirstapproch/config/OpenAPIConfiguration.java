package com.diallodev.codefirstapproch.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Code first Approach",
                description = "Simple API documentation",
                contact = @Contact(
                        name = "Diallodev",
                        url = "https://diallodev.com",
                        email = "saifoulaye.diallo0512@gmail.com"
                ),
                license = @License(
                        name = "MIT Licence"
                ),
                version = "1.0.0"
        ),
        servers = @Server(url = "http://localhost:8080")
)
@SecurityScheme(
        name = "api",
        scheme = "basic",
        type = SecuritySchemeType.HTTP,
        in = SecuritySchemeIn.HEADER)
class OpenAPIConfiguration {
}

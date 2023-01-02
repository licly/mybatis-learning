package org.charlie.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Charlie-6327
 * @date 2021/12/11
 */

@Setter
@Getter
@ConfigurationProperties(prefix = "spring.datasource.db1")
public class Blog1Properties {

    private String driverClassName;

    private String url;

    private String username;

    private String password;

    private String schema;

    private String data;
}


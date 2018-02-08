package org.cloudfoundry.samples.music.config.data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("cosmosdb")
@ConfigurationProperties(prefix="vcap.services.cosmosdb.credentials")
public class CosmosDBConfigProperties {

    
    private String connectionString;

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public String getConnectionString() {
        return this.connectionString;
    }
}
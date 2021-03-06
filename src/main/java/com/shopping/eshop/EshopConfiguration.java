package com.shopping.eshop;
import com.shopping.eshop.repository.BrandRepository;
import com.shopping.eshop.repository.ProductRepository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.function.DatabaseClient;
import org.springframework.data.r2dbc.repository.support.R2dbcRepositoryFactory;
import org.springframework.data.relational.core.mapping.RelationalMappingContext;

import io.r2dbc.h2.H2ConnectionConfiguration;
import io.r2dbc.h2.H2ConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;

@Configuration
public class EshopConfiguration {

    @Bean
    ProductRepository productRepository(R2dbcRepositoryFactory factory) {
        return factory.getRepository(ProductRepository.class);
    }

    @Bean
    BrandRepository brandRepository(R2dbcRepositoryFactory factory) {
        return factory.getRepository(BrandRepository.class);
    }

    @Bean
    R2dbcRepositoryFactory factory(DatabaseClient client) {
        RelationalMappingContext context = new RelationalMappingContext();
        context.afterPropertiesSet();
        return new R2dbcRepositoryFactory(client, context);
    }

    @Bean
    DatabaseClient databaseClient(ConnectionFactory factory) {
        return DatabaseClient.builder().connectionFactory(factory).build();
    }

    @Bean
    H2ConnectionFactory connectionFactory() {
        H2ConnectionConfiguration config = H2ConnectionConfiguration.builder()
                .username("sa")
                .password("")
                .url("mem:testdb")
                .build();

        return new H2ConnectionFactory(config);
    }
}

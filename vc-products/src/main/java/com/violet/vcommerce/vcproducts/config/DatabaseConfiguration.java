package com.violet.vcommerce.vcproducts.config;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@CommonsLog
@Configuration
@EnableJpaRepositories("com.violet.vcommerce.vcproducts.repository")
@EnableTransactionManagement
public class DatabaseConfiguration {
}

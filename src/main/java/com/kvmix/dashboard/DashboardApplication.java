package com.kvmix.dashboard;

import com.kvmix.dashboard.config.ApplicationProperties;

import jakarta.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.TimeZone;

@SpringBootApplication
@EnableConfigurationProperties({ApplicationProperties.class})
public class DashboardApplication {

  public static void main(String[] args) {
    SpringApplication.run(DashboardApplication.class, args);
  }

  @PostConstruct
  public void init() {
    TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
  }

}

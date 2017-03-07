package me.wonwoo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig01Application {

  @Bean
  public Foo01Service foo01Service(Bar01Service bar01Service) {
    return new Foo01Service(bar01Service);
  }

  @Bean
  public Bar01Service barService() {
    return new Bar01Service();
  }
}

class Foo01Service {
  private final Bar01Service bar01Service;

  public Foo01Service(Bar01Service bar01Service) {
    this.bar01Service = bar01Service;
  }
}

class Bar01Service {

}

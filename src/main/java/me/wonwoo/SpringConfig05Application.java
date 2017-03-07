package me.wonwoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

/**
 * Created by wonwoo on 2017. 3. 7..
 */
@SpringBootApplication
public class SpringConfig05Application {

  public static void main(String[] args) {
    new SpringApplication(SpringConfig05Application.class, args)
      .addInitializers(new Custom01BeanDefinitionInitializr());
  }
}

class Custom01BeanDefinitionInitializr implements ApplicationContextInitializer<GenericApplicationContext> {

  @Override
  public void initialize(GenericApplicationContext gac) {

    gac.registerBean(Bar05Service.class);
    gac.registerBean(Foo05Service.class, () -> new Foo05Service(gac.getBean(Bar05Service.class)));
  }
}

class Foo05Service {

  private final Bar05Service bar05Service;

  Foo05Service(Bar05Service bar05Service) {
    this.bar05Service = bar05Service;
  }
}

class Bar05Service {

}
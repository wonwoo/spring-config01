package me.wonwoo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

/**
 * Created by wonwoo on 2017. 3. 7..
 */
@SpringBootApplication
public class SpringConfig06Application {

}

class CustomBean02DefinitionInitializr implements ApplicationContextInitializer<GenericApplicationContext> {

  @Override
  public void initialize(GenericApplicationContext gac) {
    Bar06Service bar06Service = new Bar06Service();
    Foo06Service foo06Service = new Foo06Service(bar06Service);
    gac.registerBean(Bar06Service.class, () -> bar06Service);
    gac.registerBean(Foo06Service.class, () -> foo06Service);
  }
}

class Foo06Service {

  private final Bar06Service bar06Service;

  Foo06Service(Bar06Service bar06Service) {
    this.bar06Service = bar06Service;
  }
}

class Bar06Service {

}
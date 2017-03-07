package me.wonwoo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * Created by wonwoo on 2017. 3. 7..
 */

@Configuration
@ComponentScan
public class SpringConfig02Application {

}

@Service
class Foo02Service {

  private final Bar02Service bar02Service;

  Foo02Service(Bar02Service bar02Service) {
    this.bar02Service = bar02Service;
  }
}

@Service
class Bar02Service {

}

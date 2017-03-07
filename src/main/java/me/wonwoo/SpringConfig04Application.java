package me.wonwoo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.support.BeanDefinitionBuilder.genericBeanDefinition;

/**
 * Created by wonwoo on 2017. 3. 7..
 */
@Configuration
public class SpringConfig04Application {

  @Component
  public static class CustomBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry bdr) throws BeansException {
      bdr.registerBeanDefinition("bar04Service", genericBeanDefinition(Bar04Service.class).getBeanDefinition());
      final BeanFactory cast = BeanFactory.class.cast(bdr);
      bdr.registerBeanDefinition("foo04Service", genericBeanDefinition(Foo04Service.class,
        () -> new Foo04Service(cast.getBean(Bar04Service.class))).getBeanDefinition());
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
  }
}

class Foo04Service {

  private final Bar04Service bar04Service;

  Foo04Service(Bar04Service bar04Service) {
    this.bar04Service = bar04Service;
  }
}

class Bar04Service {

}


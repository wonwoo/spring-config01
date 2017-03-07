package me.wonwoo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.support.BeanDefinitionBuilder.genericBeanDefinition;


/**
 * Created by wonwoo on 2017. 3. 7..
 */
@Configuration
public class SpringConfig03Application {

  @Component
  public static class CustomBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry bdr) throws BeansException {
      bdr.registerBeanDefinition("bar03Service", genericBeanDefinition(Bar03Service.class).getBeanDefinition());
      bdr.registerBeanDefinition("foo03Service", genericBeanDefinition(Foo03Service.class)
        .addConstructorArgReference("bar03Service")
        .getBeanDefinition()
      );
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
  }
}

class Foo03Service {

  private final Bar03Service bar03Service;

  Foo03Service(Bar03Service bar03Service) {
    this.bar03Service = bar03Service;
  }
}

class Bar03Service {

}
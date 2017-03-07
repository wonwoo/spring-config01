package me.wonwoo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by wonwoo on 2017. 3. 7..
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringConfig03Application.class)
public class SpringConfig03ApplicationTests {

  @Autowired
  private Bar03Service bar03Service;

  @Autowired
  private Foo03Service foo03Service;

  @Test
  public void config03Test() {
    assertThat(bar03Service).isNotNull();
    assertThat(foo03Service).isNotNull();
  }
}
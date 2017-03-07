package me.wonwoo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringConfig01Application.class)
public class SpringConfig01ApplicationTests {

  @Autowired
  private Bar01Service bar01Service;

  @Autowired
  private Foo01Service foo01Service;

  @Test
  public void config01Test() {
    assertThat(bar01Service).isNotNull();
    assertThat(foo01Service).isNotNull();
  }
}

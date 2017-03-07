package me.wonwoo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by wonwoo on 2017. 3. 7..
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringConfig02Application.class)
public class SpringConfig02ApplicationTests {

  @Autowired
  private Bar02Service bar02Service;

  @Autowired
  private Foo02Service foo02Service;

  @Test
  public void config02Test() {
    assertThat(bar02Service).isNotNull();
    assertThat(foo02Service).isNotNull();
  }
}
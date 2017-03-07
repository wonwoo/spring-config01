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
@ContextConfiguration(classes = SpringConfig04Application.class)
public class SpringConfig04ApplicationTests {

  @Autowired
  private Bar04Service bar04Service;

  @Autowired
  private Foo04Service foo04Service;

  @Test
  public void config04Test() {
    assertThat(bar04Service).isNotNull();
    assertThat(foo04Service).isNotNull();
  }
}
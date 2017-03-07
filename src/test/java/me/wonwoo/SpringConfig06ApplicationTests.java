package me.wonwoo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by wonwoo on 2017. 3. 7..
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringConfig06Application.class)
public class SpringConfig06ApplicationTests {

  @Autowired
  private Bar06Service bar06Service;

  @Autowired
  private Foo06Service foo06Service;

  @Test
  public void config06Test() {
    assertThat(bar06Service).isNotNull();
    assertThat(foo06Service).isNotNull();
  }
}
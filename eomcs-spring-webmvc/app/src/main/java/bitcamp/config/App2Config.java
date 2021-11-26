package bitcamp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan(basePackages = "bitcamp.web.app2")
@EnableWebMvc
public class App2Config {

  //  public ViewResolver viewResolver() {
  //    InternalResourceView vr = new InternalResourceViewResolver();
  //
  //  }
}

package io.alanda.codingkata.config;


import gg.jte.CodeResolver;
import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.DirectoryCodeResolver;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;

@Configuration
public class JteConfiguration {

  @Bean
  public ViewResolver jteViewResolve(TemplateEngine templateEngine) {
    return new JteViewResolver(templateEngine);
  }

  @Bean
  public TemplateEngine templateEngine() {
    CodeResolver codeResolver = new DirectoryCodeResolver(Path.of("src", "main", "jte"));
    TemplateEngine templateEngine = TemplateEngine.create(codeResolver, Paths.get("jte-classes"), ContentType.Html,
        getClass().getClassLoader());
    templateEngine.setBinaryStaticContent(true);
    return templateEngine;
  }
}
package ru.quizgameproject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.*;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

@Configuration
@ComponentScan("ru.quizgameproject")
@EnableWebMvc
public class SpringConfig implements WebMvcConfigurer {

    private final ApplicationContext appCont;

    @Autowired
    public SpringConfig(ApplicationContext appCont){

        this.appCont = appCont;

    }

    @Bean
    public SpringResourceTemplateResolver resolver(){

        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setSuffix("WEB-INF/views");
        resolver.setSuffix(".html");
        resolver.setApplicationContext(appCont);
        return resolver;

    }

    @Bean
    public SpringTemplateEngine engine(){

        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver(resolver());
        engine.setEnableSpringELCompiler(true);
        return engine;

    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
        thymeleafViewResolver.setTemplateEngine(engine());
        registry.viewResolver(thymeleafViewResolver);
    }
}

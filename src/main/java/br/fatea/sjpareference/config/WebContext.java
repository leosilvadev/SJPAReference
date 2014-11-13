package br.fatea.sjpareference.config;

import java.util.HashMap;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc @EnableAsync
@ComponentScan(basePackages = "br.fatea.sjpareference.*")
public class WebContext extends WebMvcConfigurerAdapter {
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		HashMap<String, MediaType> mediaTypes = new HashMap<>();
		mediaTypes.put("xml", MediaType.APPLICATION_XML);
		mediaTypes.put("json", MediaType.APPLICATION_JSON);
		
		configurer.mediaTypes(mediaTypes)
					.defaultContentType(MediaType.APPLICATION_JSON)
					.favorParameter(false)
					.favorPathExtension(true);
		
		super.configureContentNegotiation(configurer);
	}
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		
		registry.viewResolver(viewResolver);
		super.configureViewResolvers(registry);
	}
	
}

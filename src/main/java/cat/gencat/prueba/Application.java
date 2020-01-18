package cat.gencat.prueba;

import javax.servlet.Filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;
import org.webjars.servlet.WebjarsServlet;

import cat.gencat.ctti.canigo.arch.web.core.filters.LoggingFilter;
import cat.gencat.prueba.config.ConfigConstant;
import cat.gencat.prueba.config.YamlPropertiesApplicationContextInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	public static void main(final String[] args) throws Exception {
		if (System.getProperty("entorn") == null) {
			System.setProperty("entorn", "loc");
		}

		if (System.getProperty("application.defaultLanguage") == null)
			System.setProperty("application.defaultLanguage", "ca_ES");

		System.setProperty("spring.main.allow-bean-definition-overriding", String.valueOf(true));

		SpringApplicationBuilder builder = new SpringApplicationBuilder();
		addSourcesAndInitializers(builder);
		builder.run(args);
	}

	@Override
	protected SpringApplicationBuilder configure(final SpringApplicationBuilder builder) {
		return addSourcesAndInitializers(builder);
	}

	private static SpringApplicationBuilder addSourcesAndInitializers(SpringApplicationBuilder builder) {
		addSources(builder);
		addInitializers(builder);
		return builder;
	}

	private static SpringApplicationBuilder addSources(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}

	private static SpringApplicationBuilder addInitializers(SpringApplicationBuilder builder) {
		return builder.initializers(new YamlPropertiesApplicationContextInitializer());
	}

	@Bean
	public WebjarsServlet webjarsServlet() {
		return new WebjarsServlet();
	}

	@Bean
	@Autowired
	public ServletRegistrationBean webjarsServletRegistration(WebjarsServlet webjarsServlet) {
		final ServletRegistrationBean registration = new ServletRegistrationBean(webjarsServlet, "/webjars/*");
		registration.setName("webjarsServletRegistration");
		registration.setLoadOnStartup(2);
		return registration;
	}

	@Bean
	public DispatcherServlet dispatcherServlet() {
		return new DispatcherServlet();
	}

	@Bean
	@Autowired
	public ServletRegistrationBean apiDispatcherServletRegistration(DispatcherServlet dispatcherServlet) {
		final ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet,
				"/" + ConfigConstant.API + "/*");
		registration.setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME);
		return registration;
	}

	@Bean
	@Autowired
	@Qualifier("loggingFilter")
	public FilterRegistrationBean loggingfilterRegistrationBean(Filter loggingFilter) {

		final FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(loggingFilter);
		registration.addUrlPatterns("/*");
		registration.setName("loggingFilter");
		registration.setOrder(1);
		registration.setAsyncSupported(true);
		return registration;
	}

	@Bean(name = "loggingFilter")
	public Filter loggingFilter() {
		return new LoggingFilter();
	}

	// SOLO SI HAY INSTRUMENTATION SE PUEDE ACTIVAR MEDIANTE PROPIEDAD SI SE QUIERE.
//	@Bean
//	public FilterRegistrationBean instrumentationfilterRegistrationBean() {
//
//		final FilterRegistrationBean registration = new FilterRegistrationBean();
//		registration.setFilter(instrumentationFilter());
//		registration.addUrlPatterns("/*");
//		registration.setName("instrumentation");
//		registration.setOrder(2);
//		registration.setAsyncSupported(true);
//		return registration;
//	}
//
//	@Bean(name = "instrumentationFilter")
//	public Filter instrumentationFilter() {
//		return new InstrumentationFilter();
//	}

}

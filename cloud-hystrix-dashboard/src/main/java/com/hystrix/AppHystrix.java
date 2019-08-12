package com.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value={"file:config/config.properties"})
@EnableHystrixDashboard
@EnableTurbine
public class AppHystrix {
	
	public static void main(String[] args) {
		SpringApplication.run(AppHystrix.class, args);
		System.out.println("comlete....");
	}
	
	//springboot2.0熔断监控
//	@Bean
//    public ServletRegistrationBean<HystrixMetricsStreamServlet> getServlet() {
//        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
//        ServletRegistrationBean<HystrixMetricsStreamServlet> registrationBean = new ServletRegistrationBean<HystrixMetricsStreamServlet>(streamServlet);
//        registrationBean.setLoadOnStartup(1);
//        registrationBean.addUrlMappings("/actuator/hystrix.stream");
//        registrationBean.setName("HystrixMetricsStreamServlet");
//        return registrationBean;
//    }      
}

package com.chengfengkk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {
	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

//
//	/**
//	 * @author chenye
//	 */
//	@Configuration
//	public class HttpsConfig {
//
//		@Value("${server.custom.httpPort}")
//		private Integer httpPort;
//		@Value("${server.port}")
//		private Integer httpsPort;
//
//		@Bean
//		public EmbeddedServletContainerFactory servletContainerFactory() {
//			TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory() {
//				@Override
//				protected void postProcessContext(Context context) {
//					SecurityConstraint securityConstraint = new SecurityConstraint();
//					securityConstraint.setUserConstraint("CONFIDENTIAL");
//					SecurityCollection collection = new SecurityCollection();
//					collection.addPattern("/*");
//					securityConstraint.addCollection(collection);
//					context.addConstraint(securityConstraint);
//				}
//			};
//
//			tomcat.addAdditionalTomcatConnectors(initiateHttpConnector());
//			return tomcat;
//		}
//
//		private Connector initiateHttpConnector() {
//			Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//			connector.setScheme("http");
//			connector.setPort(this.httpPort);
//			connector.setSecure(false);
//			connector.setRedirectPort(this.httpsPort);
//
//			return connector;
//		}
//	}
}




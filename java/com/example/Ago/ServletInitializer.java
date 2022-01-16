package com.example.Ago;

import com.example.Ago.FileMeneger.FileMeneger;
import com.example.Ago.FileMeneger.FileMenegerJSON;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {


		return application.sources(AgoApplication.class);
	}

}

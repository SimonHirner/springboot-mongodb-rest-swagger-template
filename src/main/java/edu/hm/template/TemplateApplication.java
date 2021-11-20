package edu.hm.template;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Template API", version = "1.0", description = "Template Information"))
public class TemplateApplication implements CommandLineRunner {

	private final TemplateRepository templateRepository;

	public TemplateApplication(TemplateRepository templateRepository) {
		this.templateRepository = templateRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(TemplateApplication.class, args);
	}

	@Override
	public void run(String... args) {
		templateRepository.deleteAll();
		templateRepository.save(new TemplateModel("Einkaufen", 1));
		templateRepository.save(new TemplateModel("Seminararbeit erstellen", 2));
	}

}

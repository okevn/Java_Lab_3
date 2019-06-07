package ua.lviv.iot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ua.lviv.iot.manager.ChainsawRepository;
import ua.lviv.iot.models.Chainsaw;
import ua.lviv.iot.models.DriveType;
import ua.lviv.iot.models.MaterialType;
import ua.lviv.iot.models.SpeedType;

@SpringBootApplication
@EntityScan({"ua.lviv.iot.models"})
@ComponentScan({"ua.lviv.iot.manager"})
@EnableJpaRepositories({"ua.lviv.iot.manager"})
public class WorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ChainsawRepository repository) {
        return args -> {
            repository.save(new Chainsaw(MaterialType.METAL, DriveType.MECHANICAL, 124,
                    5, SpeedType.LOW, 66));
            repository.save(new Chainsaw(MaterialType.PLASTIC, DriveType.ENGINE, 130,
                    4, SpeedType.MEDIUM, 60));
            repository.findAll().forEach(chainsaw -> System.out.println(chainsaw.getHeaders()));
            repository.findAll().forEach(chainsaw -> System.out.println(chainsaw.toCSV()));
        };
    }


}

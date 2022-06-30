package spring.example.ioc.sources;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Engine {
    private double volume = 2.6;
}

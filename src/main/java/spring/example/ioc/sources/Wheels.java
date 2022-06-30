package spring.example.ioc.sources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wheels {
    private int wheels = 4;
}

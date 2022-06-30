package spring.example.ioc.sources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
public class Car {
    @Autowired
    public Engine engine;
    @Autowired
    public CarBody carBody;
    @Autowired
    public GearBox gearBox;
    @Autowired
    public Wheels wheels;
    public String name = "BMW" ;
    @Autowired
    public Go go;
    @Autowired
    public GoVW goVW;

}

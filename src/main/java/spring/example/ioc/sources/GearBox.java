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
@Scope("prototype")
public class GearBox {
    public String mT = "mt";
    public int steps = 7;

}

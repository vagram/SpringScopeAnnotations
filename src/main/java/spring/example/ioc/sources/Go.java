package spring.example.ioc.sources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Data
@NoArgsConstructor
@Scope("prototype")
public class Go {
    @PostConstruct
    public void go(){
        System.out.println("Эх... Прокачу!");
    }

}

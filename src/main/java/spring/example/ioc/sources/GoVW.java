package spring.example.ioc.sources;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@Scope("prototype")
public class GoVW  {
    public void goVw(){
        System.out.println("Let's go VW!");
    }
}

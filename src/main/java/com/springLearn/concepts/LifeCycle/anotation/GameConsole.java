package com.springLearn.concepts.LifeCycle.anotation;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.*;

@Data
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class GameConsole {

    private  String consoleName;

    private  String gameName;

    @PostConstruct
    public void startConsole(){
        System.out.println(consoleName + "Startiing....");
    }


    //Business Logic

    public void playGame(){
        System.out.println(consoleName + "Playing GTA 5.....");

    }

    //Destroy Method
    @PreDestroy
    public void shutDownCOnsole(){
        System.out.println(consoleName + "Shutting down...");
    }
}

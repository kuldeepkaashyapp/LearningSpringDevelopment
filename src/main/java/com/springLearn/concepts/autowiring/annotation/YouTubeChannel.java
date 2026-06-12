package com.springLearn.concepts.autowiring.annotation;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class YouTubeChannel {

    private  String channelName;
    @Autowired
    private   Editor editor;

    //BussinesLogic
    public void uploadVideo(){
      editor.editVideo();
    }

}

package com.springLearn.concepts.autowiring.QualifierDemo;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@ToString
@Component
public class YouTubeChannel {
  @Autowired
  @Qualifier("videoEditor")
    private Editor  editor;

  public void  uploadVideo(){
    editor.edit();
    System.out.println("Video uploaded");
  }
}

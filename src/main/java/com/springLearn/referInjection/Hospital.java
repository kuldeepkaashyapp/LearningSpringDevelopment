package com.springLearn.referInjection;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Hospital {

    //hospital Name;

    private String hospitalName;
    private  Doctor  doctor;


}

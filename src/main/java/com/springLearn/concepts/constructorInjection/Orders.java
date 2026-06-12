package com.springLearn.concepts.constructorInjection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Orders {

    private Long  orderId;
    private PaymentService paymentService;

}

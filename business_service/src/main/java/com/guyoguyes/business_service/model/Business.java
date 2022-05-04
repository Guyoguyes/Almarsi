package com.guyoguyes.business_service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Data
@Entity
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Business {

    @Id
    @SequenceGenerator(name = "business_id_sequence", sequenceName="business_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "business_id_sequence")
    private Long id;
    private String name;
    private String description;
    private String type;
    private String email;
    private String mobile;


}

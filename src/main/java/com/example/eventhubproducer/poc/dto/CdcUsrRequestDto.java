package com.example.eventhubproducer.poc.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CdcUsrRequestDto {
    private Long id;
    private String name;

    public String toString(){
        return "{'id': "+this.id+", 'name': '"+this.name+"'}";
    }
}

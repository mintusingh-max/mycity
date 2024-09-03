package com.bengaluru.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





    @Entity
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Table(name="abc")
    public class Lead {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String name;
        private String mobile;
        private String email;
    }



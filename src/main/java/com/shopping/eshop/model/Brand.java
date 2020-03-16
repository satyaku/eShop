package com.shopping.eshop.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("brand")
@Getter
@Setter
public class Brand {
    @Id
    private Long id;
    private String name;

    public Long getId() {
        return this.id;
    }
}

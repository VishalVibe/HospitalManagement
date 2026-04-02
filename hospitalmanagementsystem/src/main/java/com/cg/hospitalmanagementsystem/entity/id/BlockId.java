package com.cg.hospitalmanagementsystem.entity.id;


import lombok.*;

import java.io.Serializable;


@Entity
@Table(name = "block")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Block {


    @EmbeddedId
    private BlockId id;
}

package com.mihingo.gpis.counties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "counties")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class County {
    @Id
    private ObjectId id;
    private Integer code;
    private String name;
    private String capital;
    private List<String> sub_counties;


}

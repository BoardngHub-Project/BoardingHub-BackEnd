package com.groupi.boardinghub.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Location {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2",strategy="uuid2")
    private String Id;
    private String longitude;
    private String latitude;

    @OneToOne(mappedBy = "locationId", cascade = CascadeType.ALL)
    private BoardingPlaceGig boardingPlaceGig;
}

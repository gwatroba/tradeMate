package com.project.trademate.dto.allegro.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
public class LineItem {
    private String id;
    private int quantity;
    private Price price;
    private Offer offer;
    private Instant boughtAt;
}

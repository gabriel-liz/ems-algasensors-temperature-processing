package com.algaworks.algasensors.temperature.processing.api.model;

import io.hypersistence.tsid.TSID;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.UUID;


@Data
@Builder
public class TemperaturaLogOutput {

    private UUID id;
    private TSID sensor;
    private OffsetDateTime registedAt;
    private Double value;
}

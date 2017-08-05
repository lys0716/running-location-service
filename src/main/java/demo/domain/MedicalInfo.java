package demo.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@RequiredArgsConstructor
public class MedicalInfo {

    private long bfr;

    private long fmi;
}

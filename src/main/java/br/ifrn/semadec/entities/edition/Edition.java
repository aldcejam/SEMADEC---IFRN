package br.ifrn.semadec.entities.edition;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.ifrn.semadec.entities.record.Record;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name = "editions")
public class Edition implements Serializable {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String name;

    @Column(columnDefinition = "date")
    private LocalDate startDate;

    @Column(columnDefinition = "date")
    private LocalDate endDate;

    @OneToMany
    private Set<Record> records;
}

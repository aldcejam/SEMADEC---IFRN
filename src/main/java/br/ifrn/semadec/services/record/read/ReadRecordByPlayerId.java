package br.ifrn.semadec.services.record.read;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ifrn.semadec.entities.record.Record;

import br.ifrn.semadec.repositories.RecordRepository;

@Service
public class ReadRecordByPlayerId {

    @Autowired
    private RecordRepository recordRepository;

    public Record execute(UUID playerId) {
        return recordRepository.findByPlayerId(playerId);
    }

}

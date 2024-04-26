package org.example.repositories;

import org.example.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    private Map<Long, Gate> gates = new HashMap<Long, Gate>();
    public Optional<Gate> findById(long id) {
        if (gates.containsKey(id)) {
            return Optional.of(gates.get(id));
        }
        return Optional.empty();
    }

}

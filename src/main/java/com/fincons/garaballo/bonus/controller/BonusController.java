package com.fincons.garaballo.bonus.controller;

import com.fincons.garaballo.bonus.dto.BonusDto;
import com.fincons.garaballo.bonus.service.BonusService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/bonus")
@RequiredArgsConstructor
public class BonusController {

    private final BonusService bonusService;

    @GetMapping
    public ResponseEntity<List<BonusDto>> getAll() {
        return ResponseEntity.ok(bonusService.getAll());
    }

    @PostMapping
    public ResponseEntity<BonusDto> createBonus(@RequestBody BonusDto dto) {
        BonusDto created = bonusService.createBonus(dto);
        return ResponseEntity.ok(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BonusDto> updateBonus(
            @PathVariable Integer id,
            @RequestBody BonusDto dto) {
        BonusDto updated = bonusService.updateBonus(id, dto);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBonus(@PathVariable Integer id) {
        bonusService.deleteBonus(id);
        return ResponseEntity.noContent().build();
    }
}
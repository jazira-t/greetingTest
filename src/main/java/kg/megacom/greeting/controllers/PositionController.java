package kg.megacom.greeting.controllers;

import kg.megacom.greeting.controllers.base.CrudMethods;
import kg.megacom.greeting.models.Position;
import kg.megacom.greeting.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/position")
public class PositionController implements CrudMethods<Position> {


    @Autowired
    private PositionService positionService;
    @Override
    public List<Position> findAll() {
        return positionService.findAll();
    }

    @Override
    public Position getById(Long id) {
        return new Position(id, "Head", true);
    }

    @Override
    public Position save(Position position) {
        return positionService.save(position);
    }

    @Override
    public Position update(Position position) {
        return positionService.update(position);
    }

    @Override
    public Position remove(Long id) {
        return new Position(id, "Head", false);
    }
}

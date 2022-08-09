package kg.megacom.greeting.controllers;

import kg.megacom.greeting.controllers.base.CrudMethods;
import kg.megacom.greeting.models.Position;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/position")
public class PositionController implements CrudMethods<Position> {


    @Override
    public List<Position> findAll() {
        return Arrays.asList(
                new Position(1L, "Head", true),
                new Position(2L, "Senior", true),
                new Position(3L, "Middle", true),
                new Position(4L, "Junior", true));
    }

    @Override
    public Position getById(Long id) {
        return new Position(id, "Head", true);
    }

    @Override
    public Position save(Position position) {
        position.setId(9L);
        return position;
    }

    @Override
    public Position update(Position position) {
        position.setName("New object");
        return position;
    }

    @Override
    public Position remove(Long id) {
        return new Position(id, "Head", false);
    }
}

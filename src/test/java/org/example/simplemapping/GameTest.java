package org.example.simplemapping;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

class GameTest {

    @Test
    void testSimpleMapping() {
        Game game = new Game();
        game.setId(1L);
        game.setName("game1");
        game.setTimestamp(300L);

        ModelMapper modelMapper = new ModelMapper();
        GameDTO gameDTO = modelMapper.map(game, GameDTO.class);
        Assertions.assertEquals(1L, gameDTO.getId());
        Assertions.assertEquals("game1", gameDTO.getName());
    }

}

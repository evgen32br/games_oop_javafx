package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static ru.job4j.chess.firuges.Cell.*;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(C1);
        Assert.assertEquals(bishopBlack.position(), (C1));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(C8);
        bishopBlack.way(C4);
    }

    @Test
    public void WhenArray() {
        BishopBlack bishop = new BishopBlack(Cell.C8);
        Cell[] expected = {D7, E6, F5, G4};
        Cell[] rsl = bishop.way(Cell.G4);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void testIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(C8);
        Assert.assertTrue(bishopBlack.isDiagonal(C8, G4));
        Assert.assertFalse(bishopBlack.isDiagonal(C8, G5));
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(C1);
        Figure obj = bishopBlack.copy(E4);
        Assert.assertEquals(obj.position(), (E4));
    }
}
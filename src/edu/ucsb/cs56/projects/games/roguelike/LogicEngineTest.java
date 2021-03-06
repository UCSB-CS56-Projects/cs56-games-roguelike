package edu.ucsb.cs56.projects.games.roguelike;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The test class LogicEngineTest, to test the LogicEngine class
 *
 * @author Minh Le
 * @see LogicEngine
 */

public class LogicEngineTest {

    /**
     * Test to see if a player can move to a spot with a monster.
     *
     * @see LogicEngine#movable
     */
    @Test
    public void testMovable() {

        LogicEngine engine = new LogicEngine();

        assertEquals(false, engine.movable(40, 12));
    }

    /**
     * Test to see if a monster can move to a spot with a player.
     *
     * @see LogicEngine#movable
     */
    @Test
    public void testMovable2() {

        LogicEngine engine = new LogicEngine();

        assertEquals(false, engine.movable(5, 3));
    }

    /**
     * Test to see if a monster/player can move to a spot that is empty.
     *
     * @see LogicEngine#movable
     */
    @Test
    public void testMovable3() {

        LogicEngine engine = new LogicEngine();

        assertEquals(true, engine.movable(40, 12));
    }

    /**
     * Test to see if a monster/player can move to a spot that is out of bounds.
     *
     * @see LogicEngine#movable
     */
    @Test
    public void testMovable4() {

        LogicEngine engine = new LogicEngine();

        assertEquals(false, engine.movable(40, 12));
    }

    /**
     * Test to see if a monster/player can move to a spot that is out of bounds.
     *
     * @see LogicEngine#movable
     */
    @Test
    public void testMovable5() {

        LogicEngine engine = new LogicEngine();

        assertEquals(false, engine.movable(40, 12));
    }

    /**
     * Test to see if a monster/player can move to a spot that is out of bounds.
     *
     * @see LogicEngine#movable
     */
    @Test
    public void testMovable6() {

        LogicEngine engine = new LogicEngine();

        assertEquals(false, engine.movable(40, 12));
    }

    /**
     * Test to see if a monster/player can move to a spot that is out of bounds.
     *
     * @see LogicEngine#movable
     */
    @Test
    public void testMovable7() {

        LogicEngine engine = new LogicEngine();

        assertEquals(false, engine.movable(40, 12));
    }

    /**
     * Test for a dead player
     *
     * @see LogicEngine#playerIsDead()
     */
    @Test
    public void testPlayerStatus() {

        LogicEngine engine = new LogicEngine();
        engine.getPlayer().setHitPoints(0);
        assertEquals(true, engine.playerIsDead());
    }

    /**
     * Test for a player that is not dead.
     *
     * @see LogicEngine#playerIsDead()
     */
    @Test
    public void testPlayerStatus2() {

        LogicEngine engine = new LogicEngine();
        engine.getPlayer().setHitPoints(20);
        assertEquals(false, engine.playerIsDead());
    }

    /**
     * Test for a monster that is dead.
     *
     * @see LogicEngine#monsterIsDead
     */
    @Test
    public void testMonsterStatus() {

        LogicEngine engine = new LogicEngine();
        Monster[][] mList = engine.getMonsters();
        mList[5][3].setHitPoints(0);
        assertEquals(true, engine.monsterIsDead(5, 3));
    }

    /**
     * Test for a monster that is not dead.
     *
     * @see LogicEngine#monsterIsDead
     */
    @Test
    public void testMonsterStatus2() {

        LogicEngine engine = new LogicEngine();
        Monster[][] mList = engine.getMonsters();
        mList[5][3].setHitPoints(20);
        assertEquals(false, engine.monsterIsDead(5, 3));
    }


}



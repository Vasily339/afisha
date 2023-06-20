package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void checkAddFilm() {
        PosterManager manager = new PosterManager();
        manager.addFilm("film 1");
        String[] expected = {"film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkAddZeroFilm() {
        PosterManager manager = new PosterManager();
        manager.addFilm(" ");
        String[] expected = {" "};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkAddSeveralFilm() {
        PosterManager manager = new PosterManager();
        manager.addFilm("film 1");
        manager.addFilm("film 2");
        manager.addFilm("film 3");
        manager.addFilm("film 4");
        String[] expected = {"film 1", "film 2", "film 3", "film 4"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkAddSeveral1Film() {
        PosterManager manager = new PosterManager();
        manager.addFilm("film 1");
        manager.addFilm("film 2");
        manager.addFilm("film 3");
        manager.addFilm("film 4");
        manager.addFilm("film 5");
        manager.addFilm("film 6");
        manager.addFilm("film 7");
        String[] expected = {"film 1", "film 2", "film 3", "film 4", "film 5", "film 6", "film 7"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void checkAddLimitFilm() {
        PosterManager manager = new PosterManager();
        manager.addFilm("film 1");
        manager.addFilm("film 2");
        manager.addFilm("film 3");
        manager.addFilm("film 4");
        manager.addFilm("film 5");
        String[] expected = {"film 5", "film 4", "film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkAddMoreLimitFilm() {
        PosterManager manager = new PosterManager(7);
        manager.addFilm("film 1");
        manager.addFilm("film 2");
        manager.addFilm("film 3");
        manager.addFilm("film 4");
        manager.addFilm("film 5");
        manager.addFilm("film 6");
        manager.addFilm("film 7");
        String[] expected = {"film 7", "film 6", "film 5", "film 4", "film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkAddLessLimitFilm() {
        PosterManager manager = new PosterManager(3);
        manager.addFilm("film 1");
        manager.addFilm("film 2");
        manager.addFilm("film 3");
        manager.addFilm("film 4");
        manager.addFilm("film 5");
        String[] expected = {"film 5", "film 4", "film 3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}

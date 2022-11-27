package ru.netology.Java9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void aboveMaxCountStation() {
        Radio radio = new Radio(35);
        int expected = radio.getStationNumber();
        radio.setStationNumber(37);
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void correctMaxCountStation() {
        Radio radio = new Radio(35);
        int expected = 30;
        radio.setStationNumber(expected);
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveMaxStationNumber() {
        Radio radio = new Radio();

        int expected = radio.getStationNumber();
        radio.setStationNumber(20);
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void aboveMinStationNumber() {
        Radio radio = new Radio();

        int expected = radio.getStationNumber();
        radio.setStationNumber(-5);
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void correctStationNumber() {
        Radio radio = new Radio();

        int expected = 6;
        radio.setStationNumber(expected);
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationNumber() {
        Radio radio = new Radio();
        while (radio.getStationNumber() < 9) {
            int expected = radio.getStationNumber() + 1;
            radio.next();
            int actual = radio.getStationNumber();
            Assertions.assertEquals(expected, actual);
        }
        int expected = 0;
        radio.next();
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(4);
        while (radio.getStationNumber() > 0) {
            int expected = radio.getStationNumber() - 1;
            radio.prev();
            int actual = radio.getStationNumber();
            Assertions.assertEquals(expected, actual);
        }
        int expected = 9;
        radio.prev();
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveIncreaseVolume() {
        Radio radio = new Radio();

        while (radio.getVolume() < 100) {
            int expected = radio.getVolume() + 1;
            radio.increaseVolume();
            int actual = radio.getVolume();
            Assertions.assertEquals(expected, actual);
        }

        int expected = 100;
        radio.increaseVolume();
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();

        while (radio.getVolume() > 0) {
            int expected = radio.getVolume() - 1;
            radio.decreaseVolume();
            int actual = radio.getVolume();
            Assertions.assertEquals(expected, actual);
        }
        int expected = 0;
        radio.decreaseVolume();
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}

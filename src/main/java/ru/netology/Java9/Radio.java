package ru.netology.Java9;


public class Radio {

    private int stationNumber;
    private int volume = 5;

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int newStationNumber) {

        if (newStationNumber > 9 || newStationNumber < 0)
            return;
        stationNumber = newStationNumber;

    }

    public void next() {
        if (stationNumber < 9)
            stationNumber++;
        else
            stationNumber = 0;
    }

    public void prev() {
        if (stationNumber > 0)
            stationNumber--;
        else
            stationNumber = 9;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (volume < 10)
            volume++;
    }

    public void decreaseVolume() {
        if (volume > 0)
            volume--;

    }
}

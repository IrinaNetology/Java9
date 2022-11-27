package ru.netology.Java9;


public class Radio {

    private int stationNumber;
    private int volume = 5;
    private int countStation = 10;

    public Radio() {

    }

    public Radio(int newCountStation) {
        countStation = newCountStation;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int newStationNumber) {

        if (newStationNumber > countStation - 1 || newStationNumber < 0)
            return;
        stationNumber = newStationNumber;

    }

    public void next() {
        if (stationNumber < countStation - 1)
            stationNumber++;
        else
            stationNumber = 0;
    }

    public void prev() {
        if (stationNumber > 0)
            stationNumber--;
        else
            stationNumber = countStation - 1;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (volume < 100)
            volume++;
    }

    public void decreaseVolume() {
        if (volume > 0)
            volume--;

    }
}

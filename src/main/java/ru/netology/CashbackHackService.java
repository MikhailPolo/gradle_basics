package ru.netology;

public class CashbackHackService {
    protected final int remain(int amount) {
        int boundary = 1000;
        return boundary - amount % boundary;
    }
}

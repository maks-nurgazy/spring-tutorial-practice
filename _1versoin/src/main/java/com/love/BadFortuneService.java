package com.love;

import java.util.Random;

public class BadFortuneService implements FortuneService
{

    private String [] array = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    public void setArray(String[] array)
    {
        this.array = array;
    }

    @Override
    public String getFortune()
    {
        Random random = new Random();
        int num = random.nextInt(array.length);
        return array[num];
    }
}

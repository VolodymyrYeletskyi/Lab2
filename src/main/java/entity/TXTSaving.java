package entity;

import org.springframework.stereotype.Component;

import java.io.FileWriter;
//реализация сохранения в текстовый файл
@Component
public class TXTSaving implements SavingInterface {

    @Override
    public void save(Fish fish)
    {
        String text = fish.toString() + "\n";
        try(FileWriter writer = new FileWriter("fishes.txt", true))
        {
            writer.write(text);
            writer.flush();
        } catch (Exception e) {}
    }
}

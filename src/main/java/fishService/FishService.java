package fishService;

import entity.Fish;
import entity.SavingInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
//сохранение сущности
@Component
public class FishService {
    @Autowired
    private List<SavingInterface> fishes = new ArrayList<>();

    public void save(Fish fish)
    {
        for(SavingInterface savingInterface: this.fishes)
        {
            savingInterface.save(fish);
        }
    }
}

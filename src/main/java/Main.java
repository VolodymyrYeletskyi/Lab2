import config.Config;
import entity.Fish;
import fishService.FishService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//создаем экземпляр сущности по умолчанию и сохраняем в БД и файл
public class Main {
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Fish fish = (Fish)context.getBean("defaultFish");
        FishService fishService = context.getBean(FishService.class);
        fishService.save(fish);
        //System.out.println(fish);
        //Fish fish = new Fish();
        //FishService fishService = new FishService();
        //fishService.save(fish);
    }
}

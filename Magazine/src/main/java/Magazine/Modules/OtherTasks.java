package Magazine.Modules;

import Magazine.Entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class OtherTasks {

    @Autowired
    private DataMeneger data;
    private boolean isDowload=false;

    @Scheduled(initialDelayString = "3000", fixedDelayString = "3000")
    public void datatest(){
        if (isDowload==false){
            Thread tread=new Thread(() -> {
                //data.getUsersRepository().deleteAll();
                data.getItemRepository().deleteAll();
                data.getItemRepository().save(new Item((byte) 2,(byte) 5,"Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 2,(byte) 3,"Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 3,"Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 5,"Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 3,"Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 3,"Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 5,"Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 3,"Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 3,"Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 5,"Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 5,"2Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 2,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 2,(byte) 5,"2Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 2,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 5,"2Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 5,"2Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 5,"2Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 5,"2Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 5,"2Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 4,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 5,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 7,(byte) 5,"2Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 7,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 7,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 7,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 7,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 4,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 6,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 6,(byte) 5,"2Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 6,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 6,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 6,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 6,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 6,(byte) 5,"2Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 6,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 6,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 6,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 6,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 2,(byte) 3,"Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 3,"Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 5,"Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 3,"Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 3,"Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 5,"Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 3,"Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 3,"Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 5,"Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 5,"2Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 2,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 2,(byte) 5,"2Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 2,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 5,"2Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 5,"2Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 1,(byte) 5,"2Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 5,"2Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 5,"2Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 3,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 4,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 5,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                data.getItemRepository().save(new Item((byte) 7,(byte) 5,"2Протеин молочный","PURE PROTEIN",(short) 350,""));
                data.getItemRepository().save(new Item((byte) 7,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 300,""));
                data.getItemRepository().save(new Item((byte) 7,(byte) 3,"2Протеин молочный","PURE PROTEIN",(short) 500,""));
                data.getItemRepository().save(new Item((byte) 7,(byte) 4,"2Протеин соевый","PURE PROTEIN",(short) 600,""));
                data.getItemRepository().save(new Item((byte) 7,(byte) 4,"2Протеин ","PURE PROTEIN",(short) 700,""));
                isDowload=true;
                List<Item>items= (List<Item>) data.getItemRepository().findAll();
            });
          tread.run();
        }
    }
    public boolean isDowload() {
        return isDowload;
    }

    public void setDowload(boolean dowload) {
        isDowload = dowload;
    }
}

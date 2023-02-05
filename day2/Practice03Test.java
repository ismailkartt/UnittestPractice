
//Task-6::Practice03 classının add, remove, removeAll metodlarını test ediniz.

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class Practice03Test {

    Practice02 mockRepo= mock(Practice02.class);
    Practice03 service =new Practice03(mockRepo);

    @Test
    public void testAddDeveloper(){
       service.addDeveloper("Donatello");
       verify(mockRepo).add("Donatello");
       //verify(mockRepo,times(1)).add("Donatello");

    }
    @Test
    public void testRemoveDeveloper(){
        when(mockRepo.findByName("Raphael")).thenReturn("Raphael");
      service.addDeveloper("Raphael");
      service.removeDeveloper("Raphael");
      verify(mockRepo).findByName("Raphael");
      verify(mockRepo).remove("Raphael");
      //InOrder:ödev
    }

    @Test
    public void testRemoveAllDeveloper(){
        service.addDeveloper("Raphael");
        service.removeAllDeveloper();
        verify(mockRepo).removeAll();
    }






}


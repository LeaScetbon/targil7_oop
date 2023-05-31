package targil7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Painting {
    Map<String, Element> pathToElementMap;
    List<Element> elementList;

    Painting(){
        elementList=new ArrayList<>();
        pathToElementMap = new HashMap<>();
    }

    public void addElement(Element element){
        pathToElementMap.put(element.getFullName(), element);
        if (element.getPath().isEmpty()){
            elementList.add(element);
        }
        else {
            Element containingElement = pathToElementMap.get(element.getPath());
            //TODO: add element as a child of containingElement
            if (containingElement instanceof Island){
                ((Island) containingElement).addToIsland();
            }
            else if (containingElement instanceof Lake) {
                ((Lake) containingElement).addToLake();
            }
        }
    }

    public String getName() {
        return Painting.class.getSimpleName().toLowerCase();
    }
}
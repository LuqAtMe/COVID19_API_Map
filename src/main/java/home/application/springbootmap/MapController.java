package home.application.springbootmap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MapController {

//    @RequestMapping(method = RequestMethod.GET)
//    public String getMap(Model model, @RequestParam String x, @RequestParam String y) {
//        model.addAttribute("x", x);
//        model.addAttribute("y", y);
//        return "map";
//    }

//    @RequestMapping(method = RequestMethod.GET)
//    public String getMap(Model model) {
//        List<Point> pointList = new ArrayList<>();
//        pointList.add(new Point(51.76, 19.48, "Infected people: 1"));
//        pointList.add(new Point(50.82, 17.14, "Infected people: 2"));
//        model.addAttribute("pointList",pointList);
//        return "map";
//    }

    private DataRepo dataRepo;

    @Autowired
    public MapController(DataRepo dataRepo) {
        this.dataRepo = dataRepo;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getMap(Model model) {
        model.addAttribute("pointList",dataRepo.getPointList());
        return "map";
    }


}

package edu.uph.ii.platformy.controllers;


import edu.uph.ii.platformy.repositories.KierunkiRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("searchCommand")
@Log4j2
public class KierunkiListController {

    @Autowired
    private KierunkiRepository kierunkiRepository;


    @RequestMapping(value="/kierunkiList.html", method = {RequestMethod.GET, RequestMethod.POST})
    public String showStypendiaList(Model model){
        model.addAttribute("kierunki", kierunkiRepository.findAll());
        return  "kierunkiList";
    }
}




package API.controller;

import API.model.MainTab;
import API.serv.mtServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static java.lang.System.out;


@Controller
public class Acon {

    private mtServ mts;



    @Autowired(required = true)
    @Qualifier(value = "mtServ")
    public void setS(mtServ mts) {
        this.mts = mts;
    }

    @RequestMapping(value = "main", method = RequestMethod.GET)
    public String lisT(Model model){
        model.addAttribute("tab", new MainTab());
        model.addAttribute("lisT", this.mts.lisT());

        return "main";
    }

    @RequestMapping(value = "/main/add", method = RequestMethod.POST)
    public String addT(@ModelAttribute("tab") MainTab mainTab){
            if (mainTab.getId() == 0) {
                System.out.println("1");
                System.out.println(mainTab.id);
                this.mts.addT(mainTab);
            } else {
                this.mts.updT(mainTab);
                System.out.println("2");
            }



        return "redirect:/main";
    }

    @RequestMapping("/remove/{id}")
    public String remT(@PathVariable("id") int id){
        this.mts.remT(id);
        return "redirect:/main";
    }

    @RequestMapping("edit/{id}")
    public String ediT(@PathVariable("id") int id, Model model){
        model.addAttribute("tab", this.mts.getT(id));
        model.addAttribute("lisT", this.mts.lisT());
        return "main";
    }

}

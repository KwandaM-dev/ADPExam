package za.ac.cput.vehiclesystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.vehiclesystem.domain.Agent;
import za.ac.cput.vehiclesystem.service.AgentService;
import za.ac.cput.vehiclesystem.service.IAgentService;

import java.util.List;

@RestController
@RequestMapping("/agent")
public class AgentController {

    private AgentService agentCtrl;
    @Autowired
    public void setAgentService(AgentService agentService) {
        this.agentCtrl = agentService;
    }

    @GetMapping("/getAll")
    public List<Agent> getAll(){
        return agentCtrl.getAll();
    }

    @PostMapping("/create")
    public Agent create(@RequestBody Agent agent){
        return agentCtrl.create(agent);
    }

    @GetMapping("/read/{agentId}")
    public Agent read(@PathVariable("agentId") String agentId){
        return agentCtrl.read(agentId);
    }

    @PutMapping("/update")
    public Agent update(@RequestBody Agent agent){
        return agentCtrl.update(agent);
    }

    @DeleteMapping("/delete/{agentID}")
    public boolean delete(@PathVariable("agentID") String agentId){
       agentCtrl.delete(agentId);
       return true;
    }


}

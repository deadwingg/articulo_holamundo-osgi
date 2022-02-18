package com.somospnt.saludo.client;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.somospnt.saludo.api.SaludoService;

@Component(
        immediate = true,
        property = {
            "osgi.command.scope=saludar",
            "osgi.command.function=saludar"
        },
        service = SaludoCommand.class
)
public class SaludoCommand {

    @Reference
    private SaludoService saludoService;

    public void saludar(String name) {
        SaludoService greeting = saludoService;
        greeting.saludar(name);
    }

}
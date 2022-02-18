package com.somospnt.saludo.api;

import aQute.bnd.annotation.ProviderType;

@ProviderType
public interface SaludoService {
    public void saludar(String name);
}
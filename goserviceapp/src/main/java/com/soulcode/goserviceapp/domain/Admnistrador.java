package com.soulcode.goserviceapp.domain;

import com.soulcode.goserviceapp.domain.enums.Perfil;
import jakarta.persistence.Entity;

@Entity
public class Admnistrador extends Usuario{

    public Admnistrador() {
        super();
        setPerfil(Perfil.ADMIN);
    }

    public Admnistrador(Long id, String nome, String email, String senha, boolean habilitado, Perfil perfil) {
        super(id, nome, email, senha, habilitado, perfil);
    }
}

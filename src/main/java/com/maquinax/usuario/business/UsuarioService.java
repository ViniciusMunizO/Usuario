package com.maquinax.usuario.business;


import com.maquinax.usuario.business.DTO.UsuarioDTO;
import com.maquinax.usuario.business.converter.UsuarioConverter;
import com.maquinax.usuario.infrastructure.entity.Usuario;
import com.maquinax.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;


    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        usuario = usuarioRepository.save(usuario);
        return usuarioConverter.paraUsuarioDTO(usuario);

    }
}

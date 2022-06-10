package br.com.senai.guimeireles.application.config;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;

@FacesConfig(version = Version.JSF_2_3) //estabeleca qual a versão do JSF
@ApplicationScoped //funcione durante toda a aplicacao, enquanto o server estiver em uso
public class Config {
}

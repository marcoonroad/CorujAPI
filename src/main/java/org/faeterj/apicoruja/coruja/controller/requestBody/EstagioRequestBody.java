package org.faeterj.apicoruja.coruja.controller.requestBody;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Marcos Felipe
 * Date: 21/07/17
 * Time: 09:19
 * To change this template use File | Settings | File Templates.
 */

public class EstagioRequestBody {

	public Long             id;
    public AlunoRequestBody aluno;
    public String           empresa;
    public String           funcao;
    public Date             dataInicio;
    public Date             dataFim;
    public float            horas;
    public boolean          cancelado;

}

// OK

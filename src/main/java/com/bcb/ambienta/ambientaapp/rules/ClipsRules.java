package com.bcb.ambienta.ambientaapp.rules;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.drools.clips.ClipsShell;

public class ClipsRules {
	private ClipsShell clips;
	private ByteArrayOutputStream baos;
	
	public String prueba(){
		clips= new ClipsShell();
		this.baos = new ByteArrayOutputStream();
        PrintStream p = new PrintStream( baos );
        clips.addRouter( "t",p );
		clips.eval("(+ 4 5)");
		String respuesta=new String( baos.toByteArray() );
		return respuesta;
	}
	
}

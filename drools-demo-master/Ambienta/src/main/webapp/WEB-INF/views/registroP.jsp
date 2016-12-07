<%-- 
    Document   : registroP
    Created on : 04/12/2016, 09:58:11 PM
    Author     : BRENDA
--%>

<div class="container-fluid">
    <div class="row">
        <div class="col-lg-12">
            <h2>Registro de Proyecto</h2>
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="container">                
                        <form class="form-horizontal">
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="nombre">Nombre:</label>
                                <div class="col-sm-3">
                                    <input class="form-control" id="nombre">
                                </div>
                                <label class="control-label col-sm-2" for="tipo">Tipo Actividad:</label>
                                <div class="col-sm-3">
                                    <input class="form-control" id="tipo">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="metodo">Método:</label>
                                <div class="col-sm-3">          
                                    <input class="form-control" id="metodo">
                                </div>                                
                                <label class="control-label col-sm-2" for="inversion">Inversión:</label>
                                <div class="col-sm-3">          
                                    <input class="form-control" id="inversion">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="objetivo">Objetivo:</label>
                                <div class="col-sm-8">          
                                    <textarea class="form-control" id="objetivo"></textarea>
                                </div>                        
                            </div>                            
                        </form>
                    </div>


                    <div class="panel panel-default">
                        <div class="panel-heading">Meteorología</div>                            
                        <div class="panel-body">
                            <div class="container">  
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <label class="control-label col-sm-2" for="tempmax">Temperatura Máxima:</label>
                                        <div class="col-sm-3">
                                            <input class="form-control" id="tempmax">
                                        </div>
                                        <label class="control-label col-sm-2" for="tempmin">Temperatura Mínima:</label>
                                        <div class="col-sm-3">
                                            <input class="form-control" id="tempmin">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-sm-2" for="humedad">Humedad:</label>
                                        <div class="col-sm-3">          
                                            <input class="form-control" id="humedad">
                                        </div>                           
                                    </div>                                                   
                                </form>

                            </div>
                        </div>
                    </div>

                    <div class="panel panel-default">
                        <div class="panel-heading">Biología</div>
                        <div class="panel-body">
                            <div class="container">                
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <label class="control-label col-sm-2" for="caudal">Caudal Ecológico:</label>
                                        <div class="col-sm-3">
                                            <input class="form-control" id="caudal">
                                        </div>
                                        <label class="control-label col-sm-2" for="areas">Áreas Protegidas:</label>
                                        <div class="col-sm-3">
                                            <input class="form-control" id="areas">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-sm-2" for="ecofrag">Ecosistemas Frágiles:</label>
                                        <div class="col-sm-3">          
                                            <input class="form-control" id="ecofrag">
                                        </div>                                        
                                    </div>                                                             
                                </form>
                            </div>                            
                        </div>
                    </div>

                    <div class="panel panel-default">
                        <div class="panel-heading">Calidad de Elementos</div>
                        <div class="panel-body">
                            <div class="container">                
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <label class="control-label col-sm-2" for="conc">Concentración PM10:</label>
                                        <div class="col-sm-3">
                                            <input class="form-control" id="conc">
                                        </div>
                                        <label class="control-label col-sm-2" for="nivelext">Supera Nivel Extractivo:</label>
                                        <div class="col-sm-3">
                                            <input class="form-control" id="nivelext">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-sm-2" for="ruido">Ruido:</label>
                                        <div class="col-sm-3">          
                                            <input class="form-control" id="ruido">
                                        </div>                                        
                                    </div>                                                             
                                </form>
                            </div>
                        </div>
                    </div>

                    <div class="panel panel-default">
                        <div class="panel-heading">Hidrografía</div>
                        <div class="panel-body">
                            <div class="container">                
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <label class="control-label col-sm-2" for="rioprox">Caudal Río Más Próximo:</label>
                                        <div class="col-sm-3">
                                            <input class="form-control" id="rioprox">
                                        </div>
                                        <label class="control-label col-sm-2" for="cuenca">Caudal de Cuenca Fluvial:</label>
                                        <div class="col-sm-3">
                                            <input class="form-control" id="cuenca">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-sm-2" for="riop">Río Principal:</label>
                                        <div class="col-sm-3">          
                                            <input class="form-control" id="riop">
                                        </div>                                        
                                    </div>                                                             
                                </form>
                            </div>
                        </div>
                    </div>

                    <div class="panel panel-default">
                        <div class="panel-heading">Geomorfología</div>
                        <div class="panel-body">
                            <div class="container">                
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <label class="control-label col-sm-2" for="altitud">Altitud Promedio:</label>
                                        <div class="col-sm-3">
                                            <input class="form-control" id="altitud">
                                        </div>
                                        <label class="control-label col-sm-2" for="alter">Tipo de Alteraciones:</label>
                                        <div class="col-sm-3">
                                            <input class="form-control" id="alter">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-sm-2" for="pend">Pendiente Porcentual:</label>
                                        <div class="col-sm-3">          
                                            <input class="form-control" id="pend">
                                        </div>  
                                        <label class="control-label col-sm-2" for="mate">Material Predominante:</label>
                                        <div class="col-sm-3">          
                                            <input class="form-control" id="mate">
                                        </div>  
                                    </div>                                                             
                                </form>
                            </div>
                        </div>
                    </div>

                    <div class="panel panel-default">
                        <div class="panel-heading">Aspecto Social</div>
                        <div class="panel-body">
                            <div class="container">                
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <label class="control-label col-sm-2" for="pobtot">Población Total:</label>
                                        <div class="col-sm-3">
                                            <input class="form-control" id="pobtot">
                                        </div>
                                        <label class="control-label col-sm-2" for="hogprom">Hogares Promedio:</label>
                                        <div class="col-sm-3">
                                            <input class="form-control" id="hogprom">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-sm-2" for="vivi">Nro. de Viviendas:</label>
                                        <div class="col-sm-3">          
                                            <input class="form-control" id="vivi">
                                        </div>  
                                        <label class="control-label col-sm-2" for="aurb">Área Urbana:</label>
                                        <div class="col-sm-3">          
                                            <input class="form-control" id="aurb">
                                        </div>  
                                    </div>                                                             
                                </form>
                            </div>
                        </div>
                    </div>
                    
                    <button class="btn btn-primary" id="guardar" onclick="">Guardar</button>

                    <a href="#" class="btn btn-default" id="menu-toggle">Toggle Menu</a>
                </div>
            </div>
        </div>
    </div>
</div>
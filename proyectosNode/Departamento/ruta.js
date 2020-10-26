const express=require('express'),
rutas=express.Router(),
equipo=require('./controladorDepartamento');
rutas.use('/equipo',equipo);
module.exports=rutas;
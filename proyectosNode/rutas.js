const express=require('express'),
rutas=express.Router(),
equipo=require('./ControladorTerreno');
rutas.use('/equipo',equipo);
module.exports=rutas;
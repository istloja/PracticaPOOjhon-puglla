var terreno=require('./modeloDepartamento'),
express=require('express'),
rutas=express.Router();
rutas.post('/obtenerTodos',(request,response)=>{
    terreno.find({},(err,res)=>{

        if (err){
            console.log(err);
            throw err;
        }
        response.status(200).json(res)
    })


 })
rutas.post('/crear',(request,response)=>{
    var body=request.body
    terreno.insertMany({
        idDepartamento:body.idDepartamento,
        tamaño:body.tamaño,
        dimension:body.tamaño,
        lugar:body.lugar,
        calleprincipal:body.calleprincipal,
        color:body.color
    },(err,res)=>{
        if(err){
            console.log(err);
            throw err;
        }
        response.status(200).json(res);
    }
    )
})
module.exports=rutas;
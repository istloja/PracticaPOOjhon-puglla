var terreno=require('./modelosterrenos'),
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
        idterreno:body.idterreno,
        dimension:body.dimension,
        barrio:body.barrio,
        calleprincipal:body.calleprincipal

    },(err,res)=>{
        if(err){
            console.log(err);
            throw err;
        }
        response.status(200).json(res);
    }
    )
})
rutas.post('/editar',(request,response)=>{
    var body=request.body;
    terreno.update({idterreno:body.idterreno},
    {
        dimension:body.dimension,
        barrio:body.barrio,
        calleprincipal:body.calleprincipal
    },(err,res)=>{
        if(err){
            console.log(err);
            throw err;
        }
        response.status(200).json(res);
    }
    )

})
rutas.post('/eliminar',(request,response)=>{
    var body=request.body;
    terreno.remove({idterreno:body.idterreno},(err,res)=>{
        if(err){
            console.log(err);
            throw err;
            
      
        }
        response.status(200).json(res);
     }
     
     )

})
module.exports=rutas;
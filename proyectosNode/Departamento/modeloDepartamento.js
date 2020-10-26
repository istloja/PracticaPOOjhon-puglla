var mongoose=require("mongoose"),
Shemas=mongoose.Schema;
var atributos= new Shemas({
    idDepartamento:{type:Number,trim:true},
    tamaño:{type:Number,trim:true},
    dimension:{type:Number,trim:true},
    lugar: {type:String,trim:true},
    calleprincipal:{type:String,trim:true},
    color:{type:String,trim:true}
});
var departamento=mongoose.model('departamento',atributos);
module.exports=departamento;
var mongoose=require("mongoose"),
Shemas=mongoose.Schema;
var atributos= new Shemas({
    idterreno:{type:Number,trim:true},
    dimension:{type:Number,trim:true},
    barrio: {type:String,trim:true},
    calleprincipal:{type:String,trim:true}
});
var terreno=mongoose.model('terreno',atributos);
module.exports=terreno;
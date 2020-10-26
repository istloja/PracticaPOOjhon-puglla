var mongoose = require('mongoose');
var connection=mongoose.connect('mongodb+srv://admin:root@cluster0.9vklc.mongodb.net/trabajo?retryWrites=true&w=majority');
mongoose.connection.on('open',(ref)=>{
    console.log("se conecto correctamente")
});
module.exports=connection;
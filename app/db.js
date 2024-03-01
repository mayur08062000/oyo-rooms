import mongoose from "mongoose";


const URL = "mongodb+srv://mayurbha:mayur@cluster0.hhn3gm9.mongodb.net/OYO"
 
const connectDB = async ()=>{
    await mongoose.connect(URL,{
        useNewUrlParser:true,
        useUnifiedTopology:true,
    });
    console.log("db connected")
}

export default connectDB;
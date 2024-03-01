import { NextResponse } from "next/server"

export function GET(){
    const data = {name:"mayur bhadane"}
    return NextResponse.json(data,{status:200})
} 
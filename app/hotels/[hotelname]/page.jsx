import Hotel from "../../components/hotel"
import Header1 from "../../components/header"
import connectDB from "@/app/db"


connectDB();
export default function () {
  return (
    <div className='inline-block m-10'>
        <Header1/>
        <Hotel/>
    </div>
  )
}

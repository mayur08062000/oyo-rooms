"use client";
import Image from "next/image";
import Block from "./block";
import Link from "next/link";


const Header1 = () => {

  return (
    <div className=" flex justify-between border-b-2 border-gray-300 items-center h-24 px-10">
      <Image
       src={"/oyo-logo-1.png"}
        alt="logo"
        width={200}
        height={200}
        className=" w-20 h-20 "
      />
      <div className=" h-full flex">
        <Block title={"Become a member"} para={"Additional 0% off on stays."} />
        <Block
          title={"OYO for business"}
          para={"Trusted by 5000 corporates.."}
        />
        <Block title={"List your property"} para={"Start earning in 30 min."} />
        <Block title={"987654321"} para={"Call us to book now."} />
        <div className="flex items-center px-3 ">
          <Image
            src={"/123.avif"}
            alt="demo"
            width={200}
            height={200}
            className=" w-10 h-10 rounded-full mr-5"
          />      
            <Link href={"/login"} className=" font-bold">
              Login / Signup
            </Link>
      
        </div>
      </div>
    </div>
  );
};

export default Header1;
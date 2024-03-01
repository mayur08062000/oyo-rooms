import { CiDiscount1 } from "react-icons/ci";
export default function page() {
  return (
    <div className="flex h-screen justify-center items-center bg-login-background relative">
      <div className="flex mx-20 justify-center">
        <div>
          <p className="text-5xl mt-5 font-serif">
            here a smater wat to oyo rooms
          </p>
          <p className="font bold text-xl">
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Eos
            temporibus, cum tempora perspiciatis, est aliquam officia a iste
            mollitia expedita dolore! Nam excepturi, corrupti modi corporis
            labore minima placeat architecto!
          </p>
        </div>
        <div className="ml-20 p w-10/12 rounded-sm border-red-500 border-2 bg-gradient-to-r from-blue-300 to bg-purple-300 ">
          <p className=" h-8  text-center text-white font-semibold bg-gradient-to-r from-blue-400 to bg-red-300">
            Sign up & Get ₹500 OYO Money
          </p>
          <div className="px-10">
            <h3 className="text-5xl font-bold my-5">Login / Signup</h3>
            <p className="font-bold">
              Please enter your phone number to continue
            </p>
            <input
              type="text"
              placeholder="Enter your Name "
              className="
          outline-none  px-3 py-1 w-96 h-10 my-3 border-black border-2 rounded-lg"
            ></input>
            <input
              type="email"
              placeholder="Enter your Email "
              className="
          outline-none  px-3 py-1 w-96 h-10 my-3 border-black border-2 rounded-lg"
            ></input>
            <input
              type="password"
              placeholder="Enter your Password "
              className="
          outline-none  px-3 py-1 w-96 h-10 my-3 border-black border-2 rounded-lg"
            ></input>
            <button
              type="submit"
              className="w-96 h-14 text-lg bg-red-500
          hover:cursor-pointer hover:bg-green-500 text-white my-5 rounded-lg"
            >
              Sign Up
            </button>
            <p className="my-3 text-lg">
                <span className=""> Already you have a Account:</span>
                <span className=" hover:cursor-pointer
                ml-1 border-b-2 border-red-500 text-red-600 ">Login</span>
            </p>
          </div>
        </div>
      </div>
    </div>
  );
}

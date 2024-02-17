import Footer from "./components/footer";
import Header1 from "./components/header";
import Header2 from "./components/header2";
import Header3 from "./components/header3";
import Header4 from "./components/Header4";
import Head from "next/head";
import Image from "next/image";

const App = () => {
  return (
    <div>
      <Head>
        <title>
          OYO : India`s Best Online Hotel Booking Site For Sanitized Stay.
        </title>
      </Head>
      <Header1 />
      <Header2 />
      <Header3 />
      <div className="mx-20">
        <div className=" my-14">
          <Image
            src={"/6e9d9804-9c6f-4b18-a5d5-5e9a8f9815e5.avif"}
            alt="banner1"
            width={200}
            height={200}
            className=" h-80 w-full"
          />
        </div>
        <div className="mb-14">
          <Image
            src={"/12345.avif"}
            alt="banner1"
            width={200}
            height={200}
            className=" h-40 w-full"
          />
        </div>
        <Header4 />
      </div>
      <Footer />
    </div>
  );
};

export default App;
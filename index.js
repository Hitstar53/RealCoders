// // gsap.to(".logo", {
// //   duration: 2,
// //   x: "80%",
// //   backgroundColor: "#560563",
// //   borderRadius: "20%",
// //   border: "10px solid #fff9",
// //   ease: "slow", // changes everyting
// // });

// // //2
// gsap.set(".logo, .girl", { transformOrigin: "50% 50%" }); // set the anchor points for all motions

// // gsap.set(".girl", { opacity: 0 });

// // gsap.to(".logo, .girl", { duration: 2, rotation: 360, ease: "back" });

// // let myObj = { rotation: 0 };
// // gsap.to(myObj, {
// //   duration: 2,
// //   rotation: 360,
// //   ease: "back",
// //   onUpdate: function () {
// //     console.log(myObj.rotation); //getting rotation value on every updation of the screen
// //   },
// // });

// //3
// gsap.registerPlugin(ScrollTrigger);
// // gsap.r

// // gsap.registerPlugin(ScrollToPlugin, ScrollTrigger);

// gsap.from(".logo", {
//   //perfect for page load
//   duration: 1.5,
//   opacity: 0,
//   scale: 0.3,
//   ease: "back",
//   onComplete: () => {
//     setTimeout(() => {
//       gsap.from(".girl", {
//         duration: 1.5,
//         opacity: 0.4,
//         scale: 0.7,
//         ease: "back",
//       });
//     }, 500);
//   },
// });

// gsap.from(".circle", {
//   scrollTrigger: ".circle",
//   duration: 1,
//   opacity: 0,
//   y: "random(-200, 200)",
//   stagger: 0.25,
// });

gsap.from(".sq", {
  //perfect for page load
  duration: 1.5,
  opacity: 0,
  scale: 0.3,
  ease: "back",
  onComplete: () => {
    setTimeout(() => {
      gsap.from(".girl", {
        duration: 1.5,
        opacity: 0.4,
        scale: 0.7,
        ease: "back",
      });
    }, 500);
  },
});

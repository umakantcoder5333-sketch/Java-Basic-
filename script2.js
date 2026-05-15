let images = [
    "image1.jpg",
    "image2.jpg",
    "image3.jpg",
    "image4.jpg",
    "image5.jpg",
    "image6.jpg",
    "image7.jpg",
    "image8.jpg"
];

let current = 0;

// OPEN

function openLightbox(index){
    current = index;
    document.getElementById("lightbox").style.display = "flex";
    document.getElementById("lightbox-img").src = images[current];

}

// CLOSE
function closeLightbox(){
    document.getElementById("lightbox").style.display = "none";
}


// NEXT IMAGE
function next(){
    current = (current + 1) % images.length;
    document.getElementById("lightbox-img").src = images[current];
}

// PREV IMAGE
function prev(){
    current = (current - 1 + images.length) % images.length;
    document.getElementById("lightbox-img").src = images[current];

}

//FILTER

    function filterImages(category) {
    let imgs = document.querySelectorAll(".gallery img");

    imgs.forEach(img => {
        if (category === "all" || img.classList.contains(category)) {
            img.style.display = "";
        } else {
            img.style.display = "none";
        }
    });
}

// ACTIVE BUTTON
function setActive(button){
    let buttons = document.querySelectorAll(".buttons button");
    buttons.forEach(btn => btn.classList.remove("active"));
    button.classList.add("active");
}

// CLOSE ON OUTSIDE CLICK 
document.getElementById("lightbox").addEventListener("click", function(e){
    if(e.target.id === "lightbox"){
        closeLightbox();
    }
})

// KEYBOARD SUPPORT
document.addEventListener("keydown", function(e){
    if(e.key === "ArrowRight") next();
    if(e.key === "ArrowLeft") prev();
    if(e.key === "Escape") closeLightbox();
});
document.addEventListener('scroll', function() {
    const title = document.querySelector('.animated-title');
    const rect = title.getBoundingClientRect();
    const isVisible = rect.top < window.innerHeight && rect.bottom >= 0;

    if (isVisible) {
        title.classList.add('visible');
    }
});


function trocarElementos(novaImagem, novoTexto, novaSubImage1, novaSubImage2, novaSubImage3, novoSubTexto1, novoSubTexto2, novoSubTexto3, novoh1, novoh2, novoh3 ) {
    // Troca a imagem
    document.getElementById("imagem").src = novaImagem;
    // Troca o texto
    document.getElementById("texto").innerText = novoTexto;
    document.getElementById("subitemimage1").src = novaSubImage1;
    document.getElementById("subitemimage2").src = novaSubImage2;
    document.getElementById("subitemimage3").src = novaSubImage3;
    document.getElementById("subitemtitle1").innerText = novoSubTexto1;
    document.getElementById("subitemtitle2").innerText = novoSubTexto2;
    document.getElementById("subitemtitle3").innerText = novoSubTexto3;
    document.getElementById("h1").innerText = novoh1;
    document.getElementById("h2").innerText = novoh2;
    document.getElementById("h3").innerText = novoh3;
}


document.querySelectorAll('.tab').forEach(tab => {
    tab.addEventListener('click', function() {
      document.querySelectorAll('.tab').forEach(item => item.classList.remove('active'));
      this.classList.add('active');
    });
  });
  


// Loja

$(document).ready(function(){
    $('.owl-carousel').owlCarousel({
        loop: true,
        margin: 10,
        nav: false,
        autoplay: true,
        autoplayTimeout: 3000,
        items: 1
    });
    $('.slick-carousel').slick({
        slidesToShow: 3,
        slidesToScroll: 1,
        autoplay: true,
        autoplaySpeed: 2000,
        arrows: true,
        dots: true
    });
});



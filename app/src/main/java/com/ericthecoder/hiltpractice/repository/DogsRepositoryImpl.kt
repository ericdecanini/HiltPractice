package com.ericthecoder.hiltpractice.repository

import com.ericthecoder.hiltpractice.entity.Dog

class DogsRepositoryImpl : DogsRepository {

    override fun getBreeds() = listOf(
        Dog("https://bit.ly/3le3v5K", "German Shepherd"),
        Dog("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F47%2F2021%2F06%2F25%2Flabrador-retriever-yellow-sitting-275580695-2000.jpg", "Labrador Retriever"),
        Dog("https://upload.wikimedia.org/wikipedia/commons/c/ca/Pomeranian.JPG", "Pomeranian"),
        Dog("https://s3.amazonaws.com/cdn-origin-etr.akc.org/wp-content/uploads/2017/11/26155629/Siberian-Husky-head-portrait-outdoors.jpg", "Siberian Husky"),
        Dog("https://www.petmd.com/sites/default/files/2020-11/picture-of-golden-retriever-dog_0.jpg", "Golden Retriever"),
        Dog("https://www.purinaproclub.com/sites/g/files/auxxlc346/files/styles/social_share_large/public/Resources_Dog%20Articles_Health_Line%2052_Thumb.jpg?itok=XXLnAshV", "Bulldog"),
        Dog("https://www.loveyourdog.com/wp-content/uploads/2019/04/Toy-Poodle-900x500.jpg", "Poodle"),
        Dog("https://dogtime.com/assets/uploads/gallery/pit-bull-dog-breed-pictures/pit-bull-dog-breed-picture-1.jpg", "American Pit Bull Terrier"),
        Dog("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F47%2F2021%2F03%2F09%2Fchihuahua-laying-down-wooden-floor-1675701502-2000.jpg", "Chihuahua"),
        Dog("https://imgflip.com/s/meme/Doge.jpg", "Shiba Inu"),
        Dog("https://www.look4dog.com/img/thumbs/crop/w350h350q100/breeds/doberman-15035.jpeg", "Dobermann"),
    )
}

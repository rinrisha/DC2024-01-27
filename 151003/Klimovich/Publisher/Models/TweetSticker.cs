﻿using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;

namespace Publisher.Models
{
    public class TweetSticker
    {
        [Key, DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        [Required]
        public int id { get; set; }

        [ForeignKey("Tweet")]
        public int tweetId { get; set; }
        public Tweet? Tweet { get; set; }

        [ForeignKey("Sticker")]
        public int stickerId { get; set; }
        public Sticker? Sticker { get; set; }
    }
}

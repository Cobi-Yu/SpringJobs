(function ($) {
    $(document).ready(function () {
        getReadme(); // #1
    });

    // Gets the README.md.
    var getReadme = function() {
      alert('getReadme');
        var url = "https://raw.githubusercontent.com/justinyoo/ThreeSixNine/master/README.md"; // #2
        $.ajax({
                type: "GET",
                url: url,
                dataType: "json"
            })
            .done(function(data) {
              console.log(data);
                var decoded = atob(data.content); // #3
                markdownToHtml(decoded); // #4
            });
    };

    // Converts the README.md markdown to HTML and put them into the HTML element.
    var markdownToHtml = function(markdown) {
      alert('markdownToHtml');
        var url = "https://api.github.com/markdown"; // #5
        var params = {
            "mode": "gfm",
            "text": markdown
        };
        $.ajax({
                type: "POST",
                url: url,
                data: JSON.stringify(params), // #6
                dataType: "html"
            })
            .done(function(data) {
              console.log(data);
                $("#main_content").html(data); // #7
            });
    };
})(jQuery);

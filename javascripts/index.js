(function ($) {
    $(document).ready(function () {
        getFileList();
    });


    var getFileList = function(){
      // var url = "https://api.github.com/repos/Cobi-Yu/SpringJobs/contents/SpringJobs/src/main/resource/mybatisSql";
      var url = "https://api.github.com/repos/Cobi-Yu/kakao.github.io/contents/_posts";
      $.ajax({
          type: "GET",
          url: url,
          dataType: "json"
      })
      .done(function(data) {
        $("#main_content").empty();
        for (var i = 0; i < data.length; i++) {
          if(data[i].type!=="dir"){
            // var path = data[i].path;
            var title = $('<h3>').html(data[i].path).css('cursor','pointer').val(data[i].path);
            title.click(function(){
              getFileContent($(this).val());
            });
            $("#main_content").append(title);
            $("#main_content").append($('<hr>'));
          }
        }
      });
    };

    var getFileContent = function(path){
      var url = "https://raw.githubusercontent.com/Cobi-Yu/kakao.github.io/master/"+path;
      $.ajax({
          type: "GET",
          url: url,
          dataType: "json"
      })
      .done(function(data) {
        $("#main_content").empty();
        $("#main_content").append($('<h3>').html(path));
        var listBtn = $("<button>").text('list로');
        listBtn.click(function(){
          getFileList();
        });
        markdownToHtml(data.responseText);
      })
      .fail(function(data){
        $("#main_content").empty();
        $("#main_content").append($('<h3>').html(path));

        markdownToHtml(data.responseText);
      });
    };

    // Converts the README.md markdown to HTML and put them into the HTML element.
    var markdownToHtml = function(markdown) {
        var url = "https://api.github.com/markdown";
        var listBtn = $("<button>").text('list로');
        listBtn.click(function(){
          getFileList();
        });
        var params = {
            "mode": "gfm",
            "text": markdown
        };
        $.ajax({
                type: "POST",
                url: url,
                data: JSON.stringify(params),
                dataType: "html"
            })
            .done(function(data) {
              $("#main_content").html(data);
              $("#main_content").append($('<br>'));
              $("#main_content").append(listBtn);
              $("#main_content").append($('<br>'));
            });
    };
    // Gets the README.md.
    var getReadme = function() {
      var url = " https://api.github.com/repos/Cobi-Yu/SpringJobs/readme";
      $.ajax({
        type: "GET",
        url: url,
        dataType: "json"
      })
      .done(function(data) {
        console.log(data);
        var decoded = atob(data.content);
        markdownToHtml(decoded);
      }).fail(function(data){
        console.log(data);
        var decoded = data.responseText;
        markdownToHtml(decoded);
      });
    };
})(jQuery);

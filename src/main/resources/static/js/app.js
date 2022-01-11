const app = {
    init: () => {
        const context = app
        console.log(context)

        $('#btn-save').on("click", function() {
            context.savePost()
        })

    },

    savePost: function() {
        const data = {
            title: $("#title").val(),
            author: $("#author").val(),
            content: $("#content").val()
        }

        $.ajax({
            type: 'POST',
            url: '/api/posts',
            dataType: 'JSON',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(() => {
            alert('글이 등록되었습니다.')
            window.location.href = '/'
        }).fail((err) => {
            alert(JSON.stringify(err))
        })
    }
}

app.init()
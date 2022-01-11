const app = {
    init: () => {
        const context = app
        console.log(context)

        $('#btn-save').on("click", function() {
            context.savePost()
        })

        $('#btn-edit').on("click", function() {
            context.editPost()
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
    },
    editPost: function () {
        const id = $('#editTitle')[0].innerText.split(': ')[1]
        console.log(id)

        const data = {
            title: $("#title").val(),
            content: $("#content").val()
        }

        $.ajax({
            type: 'PATCH',
            url: `/api/posts/${id}`,
            dataType: 'JSON',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(() => {
            alert('글이 수정되었습니다.')
            window.location.href = '/'
        }).fail((err) => {
            alert(JSON.stringify(err))
        })
    },
    deletePost: function(id) {
        $.ajax({
            type: 'DELETE',
            url: `/api/posts/${id}`
        }).done(() => {
            alert('글이 삭제되었습니다.')
            window.location.reload()
        }).fail((err) => {
            alert(JSON.stringify(err))
        })
    }
}

app.init()
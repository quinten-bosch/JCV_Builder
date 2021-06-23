<footer class="footer py-3 text-center mt-auto">
    <div class="container">
        <span class="text-muted" id="footer-year"></span><span class="text-muted"> &copy; FossCvBuilder</span>
    </div>
</footer>
<script>
    document.getElementById("footer-year").innerHTML = new Date().getFullYear();
</script>
<style>
    body {
        min-height: 100vh;
        display: flex;
        flex-direction: column;
    }
    footer {
        margin-top: auto;
    }
</style>

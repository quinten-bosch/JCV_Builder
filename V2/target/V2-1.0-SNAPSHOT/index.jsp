<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <jsp:include page="bootstrap.jsp" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <title>CV Builder</title>
    <script data-ad-client="ca-pub-6795759946429036" async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>

    <!-- Global site tag (gtag.js) - Google Analytics -->
    <script async src="https://www.googletagmanager.com/gtag/js?id=G-4TTLZTRVX6"></script>
    <script>
        window.dataLayer = window.dataLayer || [];
        function gtag(){dataLayer.push(arguments);}
        gtag('js', new Date());

        gtag('config', 'G-4TTLZTRVX6');
    </script>
</head>
<body>

<jsp:include page="header.jsp">
    <jsp:param name="actual" value="Home" />
</jsp:include>

<div class="position-relative overflow-hidden p-3 p-md-5 mb-5 text-center bg-light">
    <div class="col-md-5 p-lg-5 mx-auto my-5">
        <h1 class="display-4 font-weight-normal">FossCvBuilder</h1>
        <p class="lead font-weight-normal">And an even wittier subheading to boot. Jumpstart your marketing efforts with this example based on Apple's marketing pages.</p>
        <a class="btn btn-outline-info" href="Servlet?command=creator">Create Your CV</a>
    </div>
    <div class="product-device box-shadow d-none d-md-block"></div>
    <div class="product-device product-device-2 box-shadow d-none d-md-block"></div>
</div>


<div class="container marketing">
    <div class="row featurette">
        <div class="col-md-7">
            <h2 class="featurette-heading">First featurette heading. <span class="text-muted">It’ll blow your mind.</span></h2>
            <p class="lead">Some great placeholder content for the first featurette here. Imagine some exciting prose here.</p>
        </div>
        <div class="col-md-5">
            <svg class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto" width="500" height="500" id="bb8a6def-7b5f-4977-9cdb-6ed5386a2dfe" data-name="Layer 1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1050.8619 704.35284"><path d="M1125.431,472.17637c0,142.47-90.2998,263.86-216.77978,310.05a326.34413,326.34413,0,0,1-59.32032,15.57,332.22787,332.22787,0,0,1-165.71972-15.05c-127.28028-45.81-218.24024-167.61-218.18018-310.64,0-182.18,147.75-329.93,330-329.93a328.56355,328.56355,0,0,1,192.01026,61.6C1070.991,263.63639,1125.431,361.54636,1125.431,472.17637Z" transform="translate(-74.56905 -97.82358)" fill="#e5e5e5"/><path d="M908.65117,782.22636a326.34413,326.34413,0,0,1-59.32032,15.57,332.22787,332.22787,0,0,1-165.71972-15.05l15.23974-61.15.91992-3.67,31.1001.12,156.24024.56,2,5.91Z" transform="translate(-74.56905 -97.82358)" fill="#2f2e41"/><rect id="effaf695-3865-40c6-8918-ced0238239c2" data-name="Rectangle 25" width="286.651" height="324.35501" fill="#e6e6e6"/><rect id="f33d627f-c769-4bde-9d74-ef156faf640e" data-name="Rectangle 25-2" x="5.111" y="6.86201" width="275.92801" height="310.63199" fill="#fff"/><circle id="b5fd4af9-5b07-4da2-8ccf-5b3d4ac887f6" data-name="Ellipse 116" cx="143.326" cy="290.98201" r="15.467" fill="#e6e6e6"/><rect id="f05405a0-af73-4807-bbd1-d761cdd06c65" data-name="Rectangle 31" x="51.876" y="116.81901" width="88.837" height="9.088" fill="#e6e6e6"/><rect id="a05e4a04-50b7-46b0-b842-8db21044ae7a" data-name="Rectangle 32" x="51.876" y="144.05199" width="134.07899" height="9.088" fill="#17a2b8"/><rect id="bdce3bac-3998-4a72-bc14-4aa79023038d" data-name="Rectangle 38" x="51.876" y="171.45602" width="120.918" height="9.088" fill="#e6e6e6"/><rect id="e1177af0-2f80-4461-b67e-43945f3b6fee" data-name="Rectangle 39" x="51.876" y="198.13601" width="186.72301" height="9.088" fill="#17a2b8"/><rect id="b290cdc3-2096-427b-bfd4-6b657da823ea" data-name="Rectangle 40" x="53.81699" y="223.54501" width="152.175" height="9.088" fill="#e6e6e6"/><g id="b96c6486-fa38-4cba-8e5e-13dca7f44a0c" data-name="Group 52"><path id="b0fbfc35-67c9-42b4-b2fe-33d0d7288754" data-name="Path 846" d="M482.17805,625.61438a29.75626,29.75626,0,0,1,2.991,3.6l140.109-3.428,16.345-29.868,48.3,18.776-23.8,55.687a22.609,22.609,0,0,1-23.5,13.561l-158.3-19.123a29.665,29.665,0,1,1-2.15-39.211Z" transform="translate(-74.56905 -97.82358)" fill="#9f616a"/><path id="a6a8f1c9-3ab8-4f6f-ba9b-45acc2f7af89" data-name="Path 852" d="M670.75807,455.06457l65.569-21.489,19.258-26.411,93.716,5.546,13.759,30.82,49.972,23.613-7.68,142.624-13.138,133.477c-67.558-34.983-193.63907-8.31221-194.74307-7.87819Z" transform="translate(-74.56905 -97.82358)" fill="#17a2b8"/><path id="fc06e97d-785e-4845-9aa0-60a5889f9ce3" data-name="Path 853" d="M684.775,648.11407l-66.694-26.684.284-1.187c.286-1.2,28.672-119.817,32.441-138.879,3.926-19.859,18.271-25.35,18.88-25.573l.445-.164,26.394,8.034,11.592,91.081Z" transform="translate(-74.56905 -97.82358)" fill="#17a2b8"/><path id="b248559b-61d8-49e2-8eef-81cc9521c19e" data-name="Path 855" d="M828.7801,737.37719a29.72053,29.72053,0,0,1,4.677.258l92.747-105.072-10.788-32.286,46.608-22.652,24.655,55.313a22.608,22.608,0,0,1-6.034,26.453l-121.65,103.073a29.6649,29.6649,0,1,1-30.215-25.087Z" transform="translate(-74.56905 -97.82358)" fill="#9f616a"/><path id="b0e9bc84-32e8-4599-bd8d-d35670d3692b" data-name="Path 856" d="M918.801,642.79113l-38.689-91.006,15.09-63.391,16.259-20.541a9.36609,9.36609,0,0,1,7.524.07c6,2.413,11.1,9.81,15.177,21.984l36.259,103.279Z" transform="translate(-74.56905 -97.82358)" fill="#17a2b8"/><path id="b58b0f1b-b11b-4f57-8de2-a939101b4938" data-name="Path 857" d="M718.072,373.4422v-68.61a91.938,91.938,0,1,1,183.875-.60916q.001.30455,0,.60916v68.61a12.364,12.364,0,0,1-12.35,12.35H730.422A12.364,12.364,0,0,1,718.072,373.4422Z" transform="translate(-74.56905 -97.82358)" fill="#2f2e41"/><circle id="ba54abe3-4119-45e5-b5c1-150877d750f7" data-name="Ellipse 148" cx="716.54794" cy="218.96508" r="67.405" fill="#9f616a"/><path id="b6bcc4bf-1738-426f-8fbf-3ee273a728b5" data-name="Path 858" d="M696.322,310.32116a72.809,72.809,0,0,1,72.727-72.727h13.723a72.808,72.808,0,0,1,72.726,72.727v1.372h-29l-9.891-27.7-1.978,27.7H799.643l-4.99-13.974-1,13.974H696.322Z" transform="translate(-74.56905 -97.82358)" fill="#2f2e41"/><path id="be96ad09-85ff-4345-abef-5a49918f7c18" data-name="Path 859" d="M784.484,393.508a12.16709,12.16709,0,0,1-.967-12.918c14.541-27.658,34.9-78.765,7.877-110.283l-1.938-2.262h78.456v117.79L796.641,398.41a12.60771,12.60771,0,0,1-2.185.193,12.3,12.3,0,0,1-9.967-5.092Z" transform="translate(-74.56905 -97.82358)" fill="#2f2e41"/></g><g id="b2dad932-78e1-44e1-9682-073c8202f887" data-name="Group 51"><path id="e043db59-b600-449e-8c52-e1eb73379667" data-name="Path 341" d="M217.64577,123.08567A32.89091,32.89091,0,1,0,250.535,155.9783v-.00172a32.89088,32.89088,0,0,0-32.89091-32.89091Zm0,9.86638a9.8664,9.8664,0,1,1-9.86636,9.86644v0A9.86643,9.86643,0,0,1,217.64577,132.95205Zm0,47.50128a23.961,23.961,0,0,1-19.73454-10.53178c.15847-6.57819,13.15636-10.1991,19.73454-10.1991s19.57608,3.62091,19.73455,10.1991A23.99974,23.99974,0,0,1,217.64577,180.45333Z" transform="translate(-74.56905 -97.82358)" fill="#17a2b8"/></g><path id="bcfa45dc-2c5a-4ac5-8376-9a2a23e225d0" data-name="Path 842" d="M218.02806,394.73458c13.55-24.831,46.01-40.556,72.563-26.382,11.952,6.379,21.453,17.663,24.469,31,3.5,15.493-3.875,30.266-11.488,43.282-4.132,7.065-8.66,13.986-12.08,21.438-3.541,7.717-6.072,16.636-3.406,25.031,2.4,7.563,8.418,13.064,15.008,17.107a111.82826,111.82826,0,0,0,23.061,10.3,135.74266,135.74266,0,0,0,51.485,6.661,140.80273,140.80273,0,0,0,25.66-4.148c8.943-2.28,17.719-5.17,26.677-7.4,14.956-3.715,32.009-5.562,46.191,1.9,13.778,7.252,19.944,22.419,21.851,37.174,3.522,27.246-7.281,55.52-26.786,74.6-9.358,9.154-21.134,16.717-33.96,19.811-11.191,2.7-25.561,2.527-34.467-5.839-9.938-9.337-7.6-24.309.293-34.16,10.075-12.569,27.143-15.588,42.374-15.894,17.326-.348,34.636,2.232,51.952.628a79.799,79.799,0,0,0,24.568-5.926,62.2576,62.2576,0,0,0,18.515-12.529c10.69-10.386,17.9-24.222,21.485-38.608,4.317-17.3,3.376-35.482.025-52.859a238.36078,238.36078,0,0,0-6.888-26.507c-1.157-3.67-6.952-2.1-5.786,1.595,10.32,32.724,16.074,70.563-3.865,100.946a60.10728,60.10728,0,0,1-35.943,25.873c-17.257,4.289-35.365,2.169-52.909,1.531-16.682-.607-35,.048-49.3,9.764-11.731,7.969-19.936,23.127-16.39,37.437,3.419,13.8,16.681,20.8,29.945,21.878,13.917,1.134,27.612-3.537,39.3-10.841,24.313-15.193,40.479-41.913,43.862-70.242,1.763-14.761-.031-30.661-6.725-44.059a43.13316,43.13316,0,0,0-15.847-17.661c-6.81-4.175-14.676-6.23-22.576-6.957-17.948-1.653-35.192,4.509-52.218,9.223a144.79836,144.79836,0,0,1-26.628,5.083,132.98246,132.98246,0,0,1-26.272-.428,129.36478,129.36478,0,0,1-25.457-5.65,101.89269,101.89269,0,0,1-23.108-10.447c-6.385-4.083-11.907-9.931-12.221-17.9-.341-8.641,4.016-16.724,8.16-24.009,8.187-14.391,18.3-28.467,20.435-45.314,1.87-14.737-4.06-29.262-14.3-39.773a53.771,53.771,0,0,0-39.737-16.485c-15.193.435-29.74,7.042-40.915,17.189a67.358,67.358,0,0,0-13.8,17.53c-1.851,3.391,3.328,6.422,5.181,3.028Z" transform="translate(-74.56905 -97.82358)" fill="#3f3d56"/></svg>
        </div>
    </div>

    <hr class="featurette-divider">

    <div class="row featurette">
        <div class="col-md-7 order-md-2">
            <h2 class="featurette-heading">Oh yeah, it’s that good. <span class="text-muted">See for yourself.</span></h2>
            <p class="lead">Another featurette? Of course. More placeholder content here to give you an idea of how this layout would work with some actual real-world content in place.</p>
        </div>
        <div class="col-md-5 order-md-1">
            <svg class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto" width="500" height="500" id="a94ba0b8-26cf-4acb-8f4d-19fff06c7e94" data-name="Layer 1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 779.31989 579.94408"><rect id="ab2e16f2-9798-47da-b25d-769524f3c86f" data-name="Rectangle 62" x="0.3" y="19.289" width="703.57599" height="333.85901" fill="#e6e6e6"/><rect id="bf81c03f-68cf-4889-8697-1102f95f97bb" data-name="Rectangle 75" x="20.41899" y="47.918" width="663.33899" height="278.54901" fill="#fff"/><rect id="f065dccc-d150-492a-a09f-a7f3f89523f0" data-name="Rectangle 80" width="703.57599" height="29.89" fill="#17a2b8"/><circle id="bdbbf39c-df25-4682-8b85-5a6af4a1bd14" data-name="Ellipse 90" cx="22.21198" cy="17.57598" r="5.54" fill="#fff"/><circle id="abcd4292-0b1f-4102-9b5e-e8bbd87baabc" data-name="Ellipse 91" cx="43.24" cy="17.57598" r="5.54" fill="#fff"/><circle id="a3fb731e-8b3d-41ca-96f2-91600dc0b434" data-name="Ellipse 92" cx="64.26899" cy="17.57598" r="5.54" fill="#fff"/><rect x="402.65457" y="90.26775" width="93.42307" height="7.0219" fill="#e6e6e6"/><rect x="402.65457" y="110.88168" width="144.26556" height="7.02188" fill="#17a2b8"/><rect x="404.15457" y="130.5137" width="117.57327" height="7.02188" fill="#e6e6e6"/><rect x="402.65457" y="152.05453" width="68.63736" height="7.02188" fill="#e6e6e6"/><rect x="402.65457" y="173.09537" width="103.59158" height="7.02188" fill="#17a2b8"/><rect x="360.07397" y="88.0589" width="11.43958" height="11.43956" fill="#e6e6e6"/><rect x="360.07397" y="108.67282" width="11.43958" height="11.43954" fill="#17a2b8"/><rect x="360.07397" y="128.30487" width="11.43958" height="11.43958" fill="#e6e6e6"/><rect x="360.07397" y="149.8457" width="11.43958" height="11.43958" fill="#e6e6e6"/><rect x="360.07397" y="170.88654" width="11.43958" height="11.43958" fill="#17a2b8"/><rect x="402.65457" y="194.26773" width="93.42307" height="7.02188" fill="#e6e6e6"/><rect x="402.65457" y="214.88168" width="144.26556" height="7.02188" fill="#17a2b8"/><rect x="404.15457" y="234.5137" width="117.57327" height="7.02188" fill="#e6e6e6"/><rect x="402.65457" y="256.05453" width="68.63736" height="7.02188" fill="#e6e6e6"/><rect x="402.65457" y="277.09537" width="103.59158" height="7.02188" fill="#e6e6e6"/><rect x="360.07397" y="192.0589" width="11.43958" height="11.43958" fill="#e6e6e6"/><rect x="360.07397" y="212.67282" width="11.43958" height="11.43954" fill="#17a2b8"/><rect x="360.07397" y="232.30487" width="11.43958" height="11.43958" fill="#e6e6e6"/><rect x="360.07397" y="253.8457" width="11.43958" height="11.43958" fill="#e6e6e6"/><rect x="360.07397" y="274.88654" width="11.43958" height="11.43958" fill="#e6e6e6"/><rect x="107.11233" y="249.34749" width="93.42307" height="7.02189" fill="#3f3d56"/><rect x="94.61233" y="267.59344" width="117.57327" height="7.02189" fill="#3f3d56"/><path d="M424.88435,320.79764a61.02248,61.02248,0,0,1-89.92457,53.72147l-.01185-.01186a61.00362,61.00362,0,1,1,89.93642-53.70961Z" transform="translate(-210.34006 -160.02796)" fill="#3f3d56"/><circle cx="153.85516" cy="141.22599" r="16.58252" fill="#fff"/><path d="M392.50991,352.1a85.47057,85.47057,0,0,1-57.23926-.22169l-.01186-.00822,12.3539-24.38615h33.16505Z" transform="translate(-210.34006 -160.02796)" fill="#fff"/><polygon points="656.072 567.394 643.813 567.394 637.98 520.106 656.075 520.107 656.072 567.394" fill="#ffb7b7"/><path d="M869.53913,739.30633l-39.53076-.00146v-.5a15.38728,15.38728,0,0,1,15.38647-15.38623h.001l24.144.001Z" transform="translate(-210.34006 -160.02796)" fill="#2f2e41"/><polygon points="686.016 567.394 698.276 567.394 704.108 520.106 686.014 520.107 686.016 567.394" fill="#ffb7b7"/><path d="M893.22884,723.41961l24.144-.001h.001a15.3873,15.3873,0,0,1,15.38648,15.38623v.5l-39.53077.00146Z" transform="translate(-210.34006 -160.02796)" fill="#2f2e41"/><circle cx="844.49784" cy="348.34723" r="21.42812" transform="translate(-53.56669 789.61575) rotate(-63.57977)" fill="#ffb7b7"/><path d="M828.719,495.75878s-6.76678,28.19488-3.38336,41.72845,13.53357,106.01282,13.53357,106.01282l6.76678,73.30676,27.06708,2.25562L869.31967,633.35l3.38336-74.43457,19.17255,72.179v85.96808l28.70605,1.12781.61664-111.90741s2.25562-87.96808-12.40576-99.246-16.91693-13.53354-16.91693-13.53354Z" transform="translate(-210.34006 -160.02796)" fill="#2f2e41"/><path d="M869.57968,371.70122l25.67926,13.53354,3.38336,117.29077s-14.66138-9.02237-37.21728,2.25559-37.21729,3.38339-37.21729,3.38339l13.53357-50.75082-5.639-67.66776,8.06543-7.32047Z" transform="translate(-210.34006 -160.02796)" fill="#cbcbcb"/><path d="M840.1705,380.2907l-4.68475,3.81628s-29.3227,14.66135-30.4505,24.81153l20.30035,55.262s5.639,12.40576,1.12781,16.91693-9.0224,15.78916-7.8946,21.42813-6.76678,29.3227,2.25562,29.3227,30.4505-54.13422,29.32269-75.56235S848.23868,378.73,840.1705,380.2907Z" transform="translate(-210.34006 -160.02796)" fill="#2f2e41"/><path d="M859.88435,372.972l10.32985-1.71887s38.34509,10.15015,43.98407,27.06711l-15.78918,39.47284s11.278,72.17892,7.89459,72.17892h-3.38336s9.02233,6.76679,3.38336,9.02237-19.17255,20.30032-22.55591,12.40573-23.68372-101.50165-21.4281-121.802S857.88136,375.09878,859.88435,372.972Z" transform="translate(-210.34006 -160.02796)" fill="#2f2e41"/><path d="M864.36734,327.36577l1.00363-2.02-5.05-2.50907s-5.571-9.06457-15.65184-6.51723-14.61641,4.07187-14.61641,4.07187l-5.03724,2.53457,2.52817,2.51545-4.53544,1.52458,3.03,1.50543-3.52547,2.02637,1.89784,10.38788s3.15217-7.87881,9.21214-4.86794,17.14458-1.55643,17.14458-1.55643l9.63008,18.63725s1.98669-6.53328,5.52884-4.79121C865.92624,348.30732,874.97551,333.89572,864.36734,327.36577Z" transform="translate(-210.34006 -160.02796)" fill="#2f2e41"/><path d="M895.73611,525.2648a10.05573,10.05573,0,0,1,7.18746-13.6417l4.34113-35.47018,14.14564,12.03057-6.29109,31.83867a10.11027,10.11027,0,0,1-19.38314,5.24264Z" transform="translate(-210.34006 -160.02796)" fill="#ffb7b7"/><path d="M835.234,522.824a10.05575,10.05575,0,0,0-8.59341-12.80269l-8.07766-34.80992L805.77268,488.674l9.63157,30.99212A10.11027,10.11027,0,0,0,835.234,522.824Z" transform="translate(-210.34006 -160.02796)" fill="#ffb7b7"/><path d="M896.28134,389.12932s14.66131-5.639,19.17255,11.278S925.604,451.15816,925.604,451.15816c.28032,18.81388-.71968,18.81388,0,37.21726l-3.38336,16.91693-19.17255-2.25562.83623-43.06469-9.85863-43.77564Z" transform="translate(-210.34006 -160.02796)" fill="#2f2e41"/><path d="M815.18539,402.15169l-6.95141.74356s-6.58216,4.89542-6.58216,16.17337-1.12781,45.11185-1.12781,45.11185-.63966.79157,4.51117,29.32269c2.51059,13.90645,6.84917,20.46888,6.84917,20.46888l14-13-1.67656-33.40821,4.51117-18.04474Z" transform="translate(-210.34006 -160.02796)" fill="#2f2e41"/><path d="M988.65994,739.972h-224a1,1,0,0,1,0-2h224a1,1,0,0,1,0,2Z" transform="translate(-210.34006 -160.02796)" fill="#cbcbcb"/><path d="M522.65994,739.972h-119a1,1,0,0,1,0-2h119a1,1,0,0,1,0,2Z" transform="translate(-210.34006 -160.02796)" fill="#cbcbcb"/><path d="M469.74545,697.43517c-19.51084,14.54435-25.04043,40.13465-25.04043,40.13465s26.10369,2.00927,45.61453-12.53511S515.36,684.90006,515.36,684.90006,489.2563,682.89085,469.74545,697.43517Z" transform="translate(-210.34006 -160.02796)" fill="#f2f2f2"/><path d="M477.8728,704.26376C468.49572,726.72,445.011,738.292,445.011,738.292s-8.28141-24.83665,1.09568-47.29285,32.86172-34.02823,32.86172-34.02823S487.24989,681.80755,477.8728,704.26376Z" transform="translate(-210.34006 -160.02796)" fill="#f2f2f2"/></svg>
        </div>
    </div>
</div>

<jsp:include page="footer.jsp" />

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

</body>
</html>

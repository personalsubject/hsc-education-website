<!DOCTYPE html>
<html lang="bn">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Romantic Surprise for Khadija</title>
    <style>
        /* CSS RESET & GENERAL STYLES */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            user-select: none;
            -webkit-tap-highlight-color: transparent;
        }

        body, html {
            width: 100%;
            height: 100%;
            overflow: hidden;
            background-color: #ffffff;
        }

        /* 1. PREMIUM INTRO SCREEN */
        #start-screen {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background-color: #ffffff;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            z-index: 10;
            transition: opacity 1s ease, visibility 1s;
        }

        .btn-get-started {
            background-color: #000000;
            color: #ffffff;
            font-size: 22px;
            font-weight: 600;
            padding: 18px 48px;
            border: none;
            border-radius: 50px;
            cursor: pointer;
            box-shadow: 0 10px 30px rgba(0,0,0,0.2);
            transition: all 0.4s ease;
            letter-spacing: 1.5px;
            position: relative;
            overflow: hidden;
        }

        .btn-get-started:hover, .btn-get-started:active {
            transform: scale(1.08);
            box-shadow: 0 15px 35px rgba(255, 75, 110, 0.4);
            background-color: #111111;
        }

        /* 2. CINEMATIC LOADING SCREEN */
        #loading-screen {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: radial-gradient(circle, #1a0826 0%, #08020f 100%);
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            z-index: 9;
            opacity: 0;
            visibility: hidden;
            transition: opacity 1s ease, visibility 1s;
            color: #ffffff;
        }

        .heart-loader {
            font-size: 60px;
            animation: pulseGlow 1.2s infinite alternate ease-in-out;
            margin-bottom: 25px;
            filter: drop-shadow(0 0 15px #ff2a75);
        }

        @keyframes pulseGlow {
            0% { transform: scale(1); filter: drop-shadow(0 0 10px #ff2a75); }
            100% { transform: scale(1.35); filter: drop-shadow(0 0 25px #ff75a0); }
        }

        .progress-container {
            width: 260px;
            height: 8px;
            background: rgba(255, 255, 255, 0.15);
            border-radius: 20px;
            overflow: hidden;
            margin-bottom: 15px;
            box-shadow: inset 0 1px 3px rgba(0,0,0,0.5);
        }

        .progress-bar {
            width: 0%;
            height: 100%;
            background: linear-gradient(90deg, #ff0055, #ff5088, #ff99c8);
            border-radius: 20px;
            transition: width 0.1s linear;
            box-shadow: 0 0 10px #ff0055;
        }

        .loading-text {
            font-size: 15px;
            color: #d1d1e0;
            letter-spacing: 1px;
            font-weight: 300;
        }

        /* 3. MAGICAL BACKGROUND & MAIN SCREEN */
        #main-screen {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: radial-gradient(circle at center, #21021c 0%, #07000d 100%);
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            z-index: 8;
            opacity: 0;
            visibility: hidden;
            transition: opacity 1.2s ease, visibility 1.2s;
        }

        #canvas {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            z-index: 1;
        }

        /* FLOATING ITEMS */
        .floating-container {
            position: absolute;
            width: 100%;
            height: 100%;
            pointer-events: none;
            z-index: 2;
        }

        .float-item {
            position: absolute;
            font-size: 38px;
            animation: floatUp 8s infinite linear;
            opacity: 0.85;
            cursor: pointer;
            pointer-events: auto;
            filter: drop-shadow(0 0 8px rgba(255, 105, 180, 0.6));
            transition: transform 0.2s ease;
        }

        @keyframes floatUp {
            0% {
                transform: translateY(105vh) rotate(0deg) scale(0.8);
                opacity: 0;
            }
            15% { opacity: 0.9; }
            85% { opacity: 0.9; }
            100% {
                transform: translateY(-10vh) rotate(360deg) scale(1.1);
                opacity: 0;
            }
        }

        /* CONTENT & TEXT ANIMATIONS */
        .content-box {
            position: relative;
            z-index: 3;
            text-align: center;
            color: #ffffff;
            padding: 20px;
            width: 90%;
            max-width: 500px;
        }

        .cartoon-icon {
            font-size: 85px;
            margin-bottom: 20px;
            display: inline-block;
            animation: bounce 2.2s infinite ease-in-out;
            filter: drop-shadow(0 10px 15px rgba(0,0,0,0.5));
        }

        @keyframes bounce {
            0%, 100% { transform: translateY(0); }
            50% { transform: translateY(-18px); }
        }

        .message-text {
            font-size: 24px;
            font-weight: 500;
            color: #fff0f5;
            text-shadow: 0 0 12px rgba(255, 105, 180, 0.7), 0 0 25px rgba(255, 20, 147, 0.4);
            opacity: 0;
            transform: translateY(20px);
            transition: opacity 0.8s ease, transform 0.8s ease;
            min-height: 90px;
            line-height: 1.5;
        }

        .message-text.active {
            opacity: 1;
            transform: translateY(0);
        }

        /* GRAND FINALE TITLE & KHADIJA NAME */
        .love-title {
            font-size: 52px;
            font-weight: 800;
            background: linear-gradient(45deg, #ff0055, #ff6699, #ffffff);
            -webkit-background-clip: text;
            -webkit-text-fill-color: transparent;
            text-shadow: 0 0 30px rgba(255, 0, 85, 0.8);
            margin-bottom: 15px;
            display: none;
            animation: zoomIn 1.2s cubic-bezier(0.175, 0.885, 0.32, 1.275) forwards;
        }

        .name-title {
            font-size: 48px;
            font-weight: 800;
            color: #ffffff;
            text-shadow: 0 0 15px #ff0066, 0 0 30px #ff3399, 0 0 45px #ff66cc;
            display: none;
            animation: fadeInGlow 1.5s ease forwards;
            letter-spacing: 2px;
        }

        @keyframes zoomIn {
            0% { transform: scale(0.2); opacity: 0; }
            100% { transform: scale(1); opacity: 1; }
        }

        @keyframes fadeInGlow {
            0% { opacity: 0; transform: translateY(25px) scale(0.9); }
            100% { opacity: 1; transform: translateY(0) scale(1); }
        }

        /* MOBILE ADJUSTMENTS */
        @media (max-width: 480px) {
            .btn-get-started { font-size: 19px; padding: 15px 38px; }
            .message-text { font-size: 20px; min-height: 80px; }
            .love-title { font-size: 42px; }
            .name-title { font-size: 38px; }
            .cartoon-icon { font-size: 70px; }
        }
    </style>
</head>
<body>

    <!-- SCREEN 1: INTRO -->
    <div id="start-screen">
        <button class="btn-get-started" id="btn-start">Get Started</button>
    </div>

    <!-- SCREEN 2: LOADING -->
    <div id="loading-screen">
        <div class="heart-loader">💖</div>
        <div class="progress-container">
            <div class="progress-bar" id="progress-bar"></div>
        </div>
        <div class="loading-text" id="loading-text">ম্যাজিকাল মুহূর্ত তৈরি হচ্ছে...</div>
    </div>

    <!-- SCREEN 3: MAIN SURPRISE -->
    <div id="main-screen">
        <canvas id="canvas"></canvas>
        <div class="floating-container" id="floating-container"></div>

        <div class="content-box">
            <div class="cartoon-icon" id="cartoon-icon">🧸</div>
            <div class="message-text" id="message-text"></div>
            <div class="love-title" id="love-title">I Love You!</div>
            <div class="name-title" id="name-title"></div>
        </div>
    </div>

    <script>
        /****************************************************************
         * ⚙️ CONFIGURATION & DATA
         ****************************************************************/
        const CONFIG = {
            personName: "খাদিজা", // আপনার দেওয়া বিশেষ নাম
            steps: [
                { icon: "🧸", text: "তোমার জন্য ছোট্ট একটা মিষ্টি সারপ্রাইজ..." },
                { icon: "🐰", text: "প্রতিটি মুহূর্তে তোমার কথাই মনে পড়ে..." },
                { icon: "🌸", text: "তুমি আমার জীবনের সবথেকে সুন্দর অনুভূতি..." },
                { icon: "🎁", text: "সবসময় এরকম মিষ্টি হাসি নিয়ে থেকো..." }
            ],
            floatingItems: ["🧸", "🌹", "💖", "🦄", "✨", "🎈", "🌸", "🎀"]
        };

        // DOM Elements
        const startScreen = document.getElementById('start-screen');
        const loadingScreen = document.getElementById('loading-screen');
        const mainScreen = document.getElementById('main-screen');
        const btnStart = document.getElementById('btn-start');
        const progressBar = document.getElementById('progress-bar');
        const loadingText = document.getElementById('loading-text');
        
        const cartoonIcon = document.getElementById('cartoon-icon');
        const messageText = document.getElementById('message-text');
        const loveTitle = document.getElementById('love-title');
        const nameTitle = document.getElementById('name-title');
        const floatingContainer = document.getElementById('floating-container');

        /****************************************************************
         * 🎵 SYNTHESIZED ROMANTIC BACKGROUND MUSIC ENGINE (Web Audio API)
         ****************************************************************/
        let audioCtx;
        let isMusicPlaying = false;

        function initAudio() {
            if (!audioCtx) {
                const AudioContext = window.AudioContext || window.webkitAudioContext;
                audioCtx = new AudioContext();
            }
            if (audioCtx.state === 'suspended') {
                audioCtx.resume();
            }
        }

        function playPopSound() {
            try {
                initAudio();
                const osc = audioCtx.createOscillator();
                const gain = audioCtx.createGain();
                osc.type = 'sine';
                osc.frequency.setValueAtTime(587.33, audioCtx.currentTime); // D5
                osc.frequency.exponentialRampToValueAtTime(880, audioCtx.currentTime + 0.15); // A5
                gain.gain.setValueAtTime(0.15, audioCtx.currentTime);
                gain.gain.exponentialRampToValueAtTime(0.01, audioCtx.currentTime + 0.15);
                osc.connect(gain);
                gain.connect(audioCtx.destination);
                osc.start();
                osc.stop(audioCtx.currentTime + 0.15);
            } catch(e){}
        }

        // Soft Romantic Melodic Loop
        function startRomanticMusic() {
            if (isMusicPlaying) return;
            initAudio();
            isMusicPlaying = true;

            const notes = [261.63, 329.63, 392.00, 523.25, 392.00, 329.63]; // C, E, G, C5, G, E
            let noteIndex = 0;

            function playNextNote() {
                if (!isMusicPlaying) return;
                try {
                    const osc = audioCtx.createOscillator();
                    const gain = audioCtx.createGain();
                    osc.type = 'triangle'; // Soft tone
                    osc.frequency.setValueAtTime(notes[noteIndex], audioCtx.currentTime);
                    
                    gain.gain.setValueAtTime(0.001, audioCtx.currentTime);
                    gain.gain.linearRampToValueAtTime(0.05, audioCtx.currentTime + 0.4);
                    gain.gain.exponentialRampToValueAtTime(0.001, audioCtx.currentTime + 1.2);

                    osc.connect(gain);
                    gain.connect(audioCtx.destination);

                    osc.start();
                    osc.stop(audioCtx.currentTime + 1.2);

                    noteIndex = (noteIndex + 1) % notes.length;
                } catch(e){}
                setTimeout(playNextNote, 600);
            }

            playNextNote();
        }

        /****************************************************************
         * 🚀 FLOW & ANIMATIONS
         ****************************************************************/
        btnStart.addEventListener('click', () => {
            playPopSound();
            startRomanticMusic();

            startScreen.style.opacity = '0';
            setTimeout(() => {
                startScreen.style.visibility = 'hidden';
                loadingScreen.style.visibility = 'visible';
                loadingScreen.style.opacity = '1';
                startLoadingSequence();
            }, 800);
        });

        function startLoadingSequence() {
            let progress = 0;
            const interval = setInterval(() => {
                progress += Math.floor(Math.random() * 4) + 2;
                if (progress > 100) progress = 100;
                
                progressBar.style.width = progress + '%';
                
                if(progress < 40) {
                    loadingText.innerText = "ম্যাজিকাল মুহূর্ত তৈরি হচ্ছে...";
                } else if(progress < 80) {
                    loadingText.innerText = "ভালোবাসার আলো ছড়ানো হচ্ছে...";
                } else {
                    loadingText.innerText = "সারপ্রাইজ প্রস্তুত!";
                }

                if (progress === 100) {
                    clearInterval(interval);
                    setTimeout(() => {
                        loadingScreen.style.opacity = '0';
                        setTimeout(() => {
                            loadingScreen.style.visibility = 'hidden';
                            mainScreen.style.visibility = 'visible';
                            mainScreen.style.opacity = '1';
                            initMainAnimation();
                        }, 800);
                    }, 500);
                }
            }, 70);
        }

        function initMainAnimation() {
            initParticles();
            createFloatingItems();

            let currentStep = 0;

            function showNextStep() {
                if (currentStep < CONFIG.steps.length) {
                    const step = CONFIG.steps[currentStep];
                    messageText.classList.remove('active');
                    
                    setTimeout(() => {
                        cartoonIcon.innerText = step.icon;
                        messageText.innerText = step.text;
                        messageText.classList.add('active');
                        playPopSound();
                        currentStep++;
                        setTimeout(showNextStep, 3800);
                    }, 800);
                } else {
                    // GRAND FINALE
                    setTimeout(() => {
                        cartoonIcon.style.display = 'none';
                        messageText.style.display = 'none';

                        // Show I Love You
                        loveTitle.style.display = 'block';
                        playPopSound();

                        // Show Khadija Name
                        setTimeout(() => {
                            nameTitle.innerText = "💖 " + CONFIG.personName + " 💖";
                            nameTitle.style.display = 'block';
                            playPopSound();
                            triggerSparkleExplosion();
                        }, 1300);

                    }, 1000);
                }
            }

            showNextStep();
        }

        /****************************************************************
         * 🎈 FLOATING ITEMS
         ****************************************************************/
        function createFloatingItems() {
            setInterval(() => {
                const item = document.createElement('div');
                item.className = 'float-item';
                const randomIcon = CONFIG.floatingItems[Math.floor(Math.random() * CONFIG.floatingItems.length)];
                item.innerText = randomIcon;
                
                item.style.left = Math.random() * 85 + 5 + 'vw';
                item.style.animationDuration = (Math.random() * 4 + 6) + 's';
                
                item.addEventListener('click', () => {
                    playPopSound();
                    item.style.transform = 'scale(1.8)';
                    item.style.opacity = '0';
                    setTimeout(() => item.remove(), 300);
                });

                floatingContainer.appendChild(item);

                setTimeout(() => {
                    if(item.parentNode) item.remove();
                }, 9000);
            }, 900);
        }

        /****************************************************************
         * 🌌 CANVAS NEON PARTICLES ENGINE
         ****************************************************************/
        const canvas = document.getElementById('canvas');
        const ctx = canvas.getContext('2d');
        let particles = [];

        function resizeCanvas() {
            canvas.width = window.innerWidth;
            canvas.height = window.innerHeight;
        }
        window.addEventListener('resize', resizeCanvas);
        resizeCanvas();

        class Particle {
            constructor() {
                this.reset();
            }
            reset() {
                this.x = Math.random() * canvas.width;
                this.y = Math.random() * canvas.height;
                this.size = Math.random() * 3 + 1;
                this.speedX = Math.random() * 1 - 0.5;
                this.speedY = Math.random() * -1 - 0.3;
                this.alpha = Math.random() * 0.7 + 0.3;
                this.hue = Math.random() * 60 + 320; // Pink to Purple hues
            }
            update() {
                this.x += this.speedX;
                this.y += this.speedY;
                if (this.y < 0 || this.x < 0 || this.x > canvas.width) {
                    this.y = canvas.height;
                    this.x = Math.random() * canvas.width;
                }
            }
            draw() {
                ctx.fillStyle = `hsla(${this.hue}, 100%, 70%, ${this.alpha})`;
                ctx.shadowBlur = 10;
                ctx.shadowColor = `hsl(${this.hue}, 100%, 60%)`;
                ctx.beginPath();
                ctx.arc(this.x, this.y, this.size, 0, Math.PI * 2);
                ctx.fill();
                ctx.shadowBlur = 0; // reset
            }
        }

        function initParticles() {
            particles = [];
            for (let i = 0; i < 65; i++) {
                particles.push(new Particle());
            }
            animateParticles();
        }

        function animateParticles() {
            ctx.clearRect(0, 0, canvas.width, canvas.height);
            particles.forEach(p => {
                p.update();
                p.draw();
            });
            requestAnimationFrame(animateParticles);
        }

        function triggerSparkleExplosion() {
            for (let i = 0; i < 50; i++) {
                particles.push(new Particle());
            }
        }
    </script>
</body>
</html>

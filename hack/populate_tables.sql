CREATE TABLE users (
                       id BIGSERIAL PRIMARY KEY,
                       name VARCHAR(100) NOT NULL,
                       email VARCHAR(150) NOT NULL UNIQUE,
                       avatar_url TEXT,
                       bio TEXT,
                       created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


INSERT INTO users (name, email, avatar_url, bio)
VALUES
    ('Kevin Wang', 'kevin@example.com', 'https://example.com/avatar1.png', 'Software engineer'),
    ('Alice Chen', 'alice@example.com', 'https://example.com/avatar2.png', 'Love traveling ✈️'),
    ('Bob Li', 'bob@example.com', 'https://example.com/avatar3.png', 'Food enthusiast 🍜'),
    ('David Zhang', 'david@example.com', NULL, 'Gamer 🎮'),
    ('Emma Liu', 'emma@example.com', NULL, 'Photographer 📷');

INSERT INTO users (name, email, avatar_url, bio)
VALUES
    ('Jason Wu', 'jason.wu@example.com', NULL, 'Backend engineer ☕'),
    ('Sophia Lin', 'sophia.lin@example.com', 'https://example.com/avatar4.png', 'UX designer 🎨'),
    ('Michael Chen', 'michael.chen@example.com', NULL, 'Gym lover 💪'),
    ('Lily Zhang', 'lily.zhang@example.com', 'https://example.com/avatar5.png', 'Coffee addict ☕'),
    ('Ethan Liu', 'ethan.liu@example.com', NULL, 'Full-stack dev 👨‍💻'),
    ('Olivia Wang', 'olivia.wang@example.com', 'https://example.com/avatar6.png', 'Travel blogger ✈️'),
    ('Daniel Xu', 'daniel.xu@example.com', NULL, 'AI enthusiast 🤖'),
    ('Grace Zhao', 'grace.zhao@example.com', NULL, 'Teacher 📚'),
    ('Noah Huang', 'noah.huang@example.com', 'https://example.com/avatar7.png', 'Photographer 📷'),
    ('Ava Sun', 'ava.sun@example.com', NULL, 'Music lover 🎵'),

    ('Jack Ma', 'jack.ma@example.com', NULL, 'Entrepreneur 🚀'),
    ('Mia Yang', 'mia.yang@example.com', 'https://example.com/avatar8.png', 'Foodie 🍜'),
    ('Lucas Zhang', 'lucas.zhang@example.com', NULL, 'Game developer 🎮'),
    ('Chloe Li', 'chloe.li@example.com', NULL, 'UI designer ✨'),
    ('Ryan Zhao', 'ryan.zhao@example.com', 'https://example.com/avatar9.png', 'Runner 🏃‍♂️'),
    ('Zoe Chen', 'zoe.chen@example.com', NULL, 'Digital nomad 🌍'),
    ('Kevin Liu', 'kevin.liu@example.com', 'https://example.com/avatar10.png', 'Cloud engineer ☁️'),
    ('Ella Wang', 'ella.wang@example.com', NULL, 'Fashion lover 👗'),
    ('Henry Wu', 'henry.wu@example.com', NULL, 'DevOps engineer ⚙️'),
    ('Scarlett Lin', 'scarlett.lin@example.com', 'https://example.com/avatar11.png', 'Dancer 💃'),

    ('Benjamin Zhang', 'benjamin.zhang@example.com', NULL, 'Startup founder 🚀'),
    ('Amelia Chen', 'amelia.chen@example.com', NULL, 'Doctor 🩺'),
    ('Leo Huang', 'leo.huang@example.com', 'https://example.com/avatar12.png', 'Basketball fan 🏀'),
    ('Harper Liu', 'harper.liu@example.com', NULL, 'Writer ✍️'),
    ('Sebastian Wang', 'sebastian.wang@example.com', NULL, 'Data scientist 📊'),
    ('Aria Xu', 'aria.xu@example.com', 'https://example.com/avatar13.png', 'Singer 🎤'),
    ('Matthew Zhao', 'matthew.zhao@example.com', NULL, 'Software engineer 👨‍💻'),
    ('Victoria Sun', 'victoria.sun@example.com', NULL, 'Marketing lead 📈'),
    ('David Yang', 'david.yang@example.com', 'https://example.com/avatar14.png', 'Cyclist 🚴'),
    ('Isabella Lin', 'isabella.lin@example.com', NULL, 'Painter 🎨'),

    ('Andrew Chen', 'andrew.chen@example.com', NULL, 'iOS developer 📱'),
    ('Sophie Wu', 'sophie.wu@example.com', 'https://example.com/avatar15.png', 'Coffee shop owner ☕'),
    ('Jason Zhang', 'jason.zhang@example.com', NULL, 'ML engineer 🤖'),
    ('Natalie Liu', 'natalie.liu@example.com', NULL, 'Student 🎓'),
    ('David Chen', 'david.chen@example.com', 'https://example.com/avatar16.png', 'Cloud architect ☁️'),
    ('Emily Zhao', 'emily.zhao@example.com', NULL, 'Product manager 📦'),
    ('Chris Wang', 'chris.wang@example.com', NULL, 'Security engineer 🔐'),
    ('Grace Liu', 'grace.liu@example.com', 'https://example.com/avatar17.png', 'UI/UX designer 🎨'),
    ('Peter Xu', 'peter.xu@example.com', NULL, 'Blockchain dev ⛓️'),
    ('Luna Zhang', 'luna.zhang@example.com', NULL, 'Astrology fan 🌙'),

    ('John Wu', 'john.wu@example.com', 'https://example.com/avatar18.png', 'Engineer ⚙️'),
    ('Sophia Zhao', 'sophia.zhao@example.com', NULL, 'HR manager 👩‍💼'),
    ('Daniel Chen', 'daniel.chen@example.com', NULL, 'Cloud engineer ☁️'),
    ('Olivia Liu', 'olivia.liu@example.com', 'https://example.com/avatar19.png', 'Traveler ✈️'),
    ('Ethan Zhang', 'ethan.zhang@example.com', NULL, 'Mobile dev 📱'),
    ('Ava Chen', 'ava.chen@example.com', NULL, 'Student 📚'),
    ('Michael Wu', 'michael.wu@example.com', 'https://example.com/avatar20.png', 'Chef 👨‍🍳'),
    ('Lily Liu', 'lily.liu@example.com', NULL, 'Yoga instructor 🧘');
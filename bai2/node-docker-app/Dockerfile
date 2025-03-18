# Sử dụng image node:18 làm base image
FROM node:18

# Tạo thư mục làm việc trong container
WORKDIR /usr/src/app

# Sao chép package.json và package-lock.json vào thư mục làm việc
COPY package*.json ./

# Cài đặt các dependency
RUN npm install

# Sao chép toàn bộ mã nguồn vào trong container
COPY . .

# Mở cổng 3000
EXPOSE 3000

# Chạy ứng dụng Node.js
CMD ["node", "app.js"]
